"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Session = void 0;
const generated_1 = require("../generated");
const utils_1 = require("./utils");
const user_1 = require("./user");
const server_1 = require("./server");
const rate_limiter_1 = require("./rate-limiter");
class Session {
    constructor(kntrl, newSessionReq, tokens, id, entry, identifiedBy, authenticatedBy, userId, unconfirmedAuths, nextFactors, signedInAt, expiresAt, newUser, authenticated, device, refreshedAt, systemAccess) {
        var _a;
        if (tokens === void 0) { tokens = undefined; }
        if (id === void 0) { id = ''; }
        if (entry === void 0) { entry = (_a = newSessionReq === null || newSessionReq === void 0 ? void 0 : newSessionReq.entry) !== null && _a !== void 0 ? _a : ''; }
        if (identifiedBy === void 0) { identifiedBy = []; }
        if (authenticatedBy === void 0) { authenticatedBy = {}; }
        if (userId === void 0) { userId = undefined; }
        if (unconfirmedAuths === void 0) { unconfirmedAuths = {}; }
        if (nextFactors === void 0) { nextFactors = []; }
        if (signedInAt === void 0) { signedInAt = 0; }
        if (expiresAt === void 0) { expiresAt = 0; }
        if (newUser === void 0) { newUser = false; }
        if (authenticated === void 0) { authenticated = false; }
        if (device === void 0) { device = { userAgent: '' }; }
        if (refreshedAt === void 0) { refreshedAt = 0; }
        if (systemAccess === void 0) { systemAccess = false; }
        this.kntrl = kntrl;
        this.newSessionReq = newSessionReq;
        this.tokens = tokens;
        this.id = id;
        this.entry = entry;
        this.identifiedBy = identifiedBy;
        this.authenticatedBy = authenticatedBy;
        this.userId = userId;
        this.unconfirmedAuths = unconfirmedAuths;
        this.nextFactors = nextFactors;
        this.signedInAt = signedInAt;
        this.expiresAt = expiresAt;
        this.newUser = newUser;
        this.authenticated = authenticated;
        this.device = device;
        this.refreshedAt = refreshedAt;
        this.systemAccess = systemAccess;
        this.api = new generated_1.SessionApi(kntrl._serverCfg());
        this.user = new user_1.UserSvc(this);
        this.server = new server_1.ServerSvc(this);
        this.rateLimiter = new rate_limiter_1.RateLimiterSvc(this);
    }
    get() {
        return __awaiter(this, void 0, void 0, function* () {
            const res = yield utils_1.handleErr(this.api.getSession(yield this._authenticatedAxiosCfg()), this);
            utils_1.merge(this, res);
            return res;
        });
    }
    authenticate(req = {}) {
        var _a;
        return __awaiter(this, void 0, void 0, function* () {
            const res = yield utils_1.handleErr(() => __awaiter(this, void 0, void 0, function* () {
                if (this.newSessionReq) {
                    return this.api.newSession(Object.assign(Object.assign({}, this.newSessionReq), req), yield this._authenticatedAxiosCfg());
                }
                else {
                    return this.api.authenticate(req, yield this._authenticatedAxiosCfg());
                }
            }), this);
            if ((_a = res === null || res === void 0 ? void 0 : res.tokens) === null || _a === void 0 ? void 0 : _a.access)
                this.newSessionReq = undefined;
            this.update(res);
            return res;
        });
    }
    confirmAuth(req) {
        return __awaiter(this, void 0, void 0, function* () {
            const res = yield utils_1.handleErr(this.api.confirmSessionAuths(req, yield this._authenticatedAxiosCfg()), this);
            this.update(res);
            return res;
        });
    }
    signOut() {
        return __awaiter(this, void 0, void 0, function* () {
            yield utils_1.handleErr(this.api.signOut(yield this._authenticatedAxiosCfg()), this);
        });
    }
    refreshAccessToken(refreshToken, errOnMissingToken) {
        var _a;
        return __awaiter(this, void 0, void 0, function* () {
            refreshToken = refreshToken || ((_a = this.tokens) === null || _a === void 0 ? void 0 : _a.refresh);
            if (!refreshToken)
                throw errOnMissingToken || 'No refresh token';
            const res = yield utils_1.handleErr(new generated_1.TokenApi(this._serverCfg()).refreshToken({ refreshToken }, yield this.kntrl._axiosCfg()));
            this.update(res);
            return res;
        });
    }
    newSession(req) {
        return new Session(this.kntrl, { entry: req.entry, signIn: true }, this.tokens);
    }
    allSessions(entry, userId) {
        return __awaiter(this, void 0, void 0, function* () {
            return (yield utils_1.handleErr(this.api.getAll(entry, userId, yield this._authenticatedAxiosCfg()), this));
        });
    }
    authorize(req = {}) {
        return __awaiter(this, void 0, void 0, function* () {
            return utils_1.handleErr(new generated_1.AuthorisationApi(this._serverCfg()).authorize(req, yield this._authenticatedAxiosCfg()), this);
        });
    }
    accessToken(refreshBeforeExpireMs = 1000) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function* () {
            if (!((_a = this.tokens) === null || _a === void 0 ? void 0 : _a.refresh))
                return (_b = this.tokens) === null || _b === void 0 ? void 0 : _b.access;
            if (this.tokens.accessTokenExpiresAt - Date.now() < refreshBeforeExpireMs)
                yield this.refreshAccessToken();
            return (_c = this.tokens) === null || _c === void 0 ? void 0 : _c.access;
        });
    }
    _authenticatedAxiosCfg() {
        return __awaiter(this, void 0, void 0, function* () {
            if (!this.tokens)
                return this.kntrl._axiosCfg();
            return Object.assign(Object.assign({}, this.kntrl._axiosCfg()), { headers: Object.assign(Object.assign({}, this.kntrl._axiosCfg().headers), { Authorization: `Bearer ${yield this.accessToken()}` }) });
        });
    }
    _serverCfg() { return this.kntrl._serverCfg(); }
    update(res) {
        utils_1.merge(this, res.session);
        if (res.tokens)
            this.tokens = res.tokens;
    }
}
exports.Session = Session;
//# sourceMappingURL=session.js.map