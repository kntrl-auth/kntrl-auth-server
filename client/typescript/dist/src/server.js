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
exports.ServerSvc = void 0;
const generated_1 = require("../generated");
const utils_1 = require("./utils");
class ServerSvc {
    constructor(session) {
        this.session = session;
        this.api = new generated_1.ServerApi(session._serverCfg());
    }
    health(key) {
        return __awaiter(this, void 0, void 0, function* () {
            try {
                return utils_1.handleErr(this.api.health(key, yield this.session._authenticatedAxiosCfg()), this.session);
            }
            catch (err) {
                if (err.code) {
                    throw err;
                }
                const status = {
                    status: generated_1.HealthStatus.Err,
                    msg: err.message,
                };
                return Object.assign({ db: { user: status, session: status, rateLimiter: status }, auth: {} }, status);
            }
        });
    }
    cfg() {
        return __awaiter(this, void 0, void 0, function* () {
            return utils_1.handleErr(this.api.cfg(yield this.session._authenticatedAxiosCfg()), this.session);
        });
    }
}
exports.ServerSvc = ServerSvc;
//# sourceMappingURL=server.js.map