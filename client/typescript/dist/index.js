"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    Object.defineProperty(o, k2, { enumerable: true, get: function() { return m[k]; } });
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __exportStar = (this && this.__exportStar) || function(m, exports) {
    for (var p in m) if (p !== "default" && !Object.prototype.hasOwnProperty.call(exports, p)) __createBinding(exports, m, p);
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Session = exports.Kntrl = void 0;
const generated_1 = require("./generated");
const session_1 = require("./src/session");
class Kntrl {
    constructor(serverUrl = 'http://localhost:9876', lang) {
        this.serverUrl = serverUrl;
        this.lang = lang;
    }
    newSession(req) { return new session_1.Session(this, req); }
    session(accessTokenOrTokens) {
        const tokens = typeof accessTokenOrTokens == 'string'
            ? { access: accessTokenOrTokens, refresh: '', accessTokenExpiresAt: Date.now() + 1000 * 60 * 60 * 24 * 365 }
            : accessTokenOrTokens;
        return new session_1.Session(this, undefined, tokens);
    }
    serverHealth(key) {
        return this.session().server.health(key);
    }
    _axiosCfg() {
        const cfg = {
            baseURL: this.serverUrl,
            headers: {},
        };
        if (this.lang)
            cfg.headers['Accept-Language'] = this.lang;
        return cfg;
    }
    _serverCfg() { return new generated_1.Configuration({ basePath: this._axiosCfg().baseURL }); }
}
exports.Kntrl = Kntrl;
__exportStar(require("./generated"), exports);
var session_2 = require("./src/session");
Object.defineProperty(exports, "Session", { enumerable: true, get: function () { return session_2.Session; } });
//# sourceMappingURL=index.js.map