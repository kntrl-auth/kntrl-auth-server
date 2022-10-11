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
exports.merge = exports.handleErr = void 0;
function handleErr(action, retryOnExpiredTokenOn) {
    var _a, _b, _c, _d;
    return __awaiter(this, void 0, void 0, function* () {
        try {
            if (typeof action === 'function')
                return (yield action()).data;
            return (yield action).data;
        }
        catch (error) {
            if (((_b = (_a = error.response) === null || _a === void 0 ? void 0 : _a.data) === null || _b === void 0 ? void 0 : _b.code) == 'TOKEN_EXPIRED' && retryOnExpiredTokenOn) {
                yield retryOnExpiredTokenOn.refreshAccessToken(undefined, (_c = error.response) === null || _c === void 0 ? void 0 : _c.data);
                return yield handleErr(action);
            }
            throw ((_d = error.response) === null || _d === void 0 ? void 0 : _d.data) || error;
        }
    });
}
exports.handleErr = handleErr;
function merge(target, res) {
    for (let key in res)
        target[key] = res[key];
}
exports.merge = merge;
//# sourceMappingURL=utils.js.map