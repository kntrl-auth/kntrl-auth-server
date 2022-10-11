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
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.UserApi = exports.UserApiFactory = exports.UserApiFp = exports.UserApiAxiosParamCreator = exports.TokenApi = exports.TokenApiFactory = exports.TokenApiFp = exports.TokenApiAxiosParamCreator = exports.SignatureApi = exports.SignatureApiFactory = exports.SignatureApiFp = exports.SignatureApiAxiosParamCreator = exports.SessionApi = exports.SessionApiFactory = exports.SessionApiFp = exports.SessionApiAxiosParamCreator = exports.ServerApi = exports.ServerApiFactory = exports.ServerApiFp = exports.ServerApiAxiosParamCreator = exports.AuthorisationApi = exports.AuthorisationApiFactory = exports.AuthorisationApiFp = exports.AuthorisationApiAxiosParamCreator = exports.SkippedAuthExecResStatusEnum = exports.OkAuthExecResStatusEnum = exports.HealthStatus = exports.ErrAuthExecResStatusEnum = exports.Cache = exports.AuthExecResStatusEnum = void 0;
const axios_1 = __importDefault(require("axios"));
const common_1 = require("./common");
const base_1 = require("./base");
exports.AuthExecResStatusEnum = {
    Ok: 'OK',
    Err: 'ERR',
    Skipped: 'SKIPPED'
};
exports.Cache = {
    Jwt: 'JWT',
    Binary: 'BINARY'
};
exports.ErrAuthExecResStatusEnum = {
    Ok: 'OK',
    Err: 'ERR',
    Skipped: 'SKIPPED'
};
exports.HealthStatus = {
    Healthy: 'HEALTHY',
    Unavailable: 'UNAVAILABLE',
    Err: 'ERR'
};
exports.OkAuthExecResStatusEnum = {
    Ok: 'OK',
    Err: 'ERR',
    Skipped: 'SKIPPED'
};
exports.SkippedAuthExecResStatusEnum = {
    Ok: 'OK',
    Err: 'ERR',
    Skipped: 'SKIPPED'
};
const AuthorisationApiAxiosParamCreator = function (configuration) {
    return {
        authorize: (authoriseReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('authorize', 'authoriseReq', authoriseReq);
            const localVarPath = `/api/authorise`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(authoriseReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        limit: (rateLimiterReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('limit', 'rateLimiterReq', rateLimiterReq);
            const localVarPath = `/api/rate-limiter/limit`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(rateLimiterReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.AuthorisationApiAxiosParamCreator = AuthorisationApiAxiosParamCreator;
const AuthorisationApiFp = function (configuration) {
    const localVarAxiosParamCreator = exports.AuthorisationApiAxiosParamCreator(configuration);
    return {
        authorize(authoriseReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.authorize(authoriseReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        limit(rateLimiterReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.limit(rateLimiterReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.AuthorisationApiFp = AuthorisationApiFp;
const AuthorisationApiFactory = function (configuration, basePath, axios) {
    const localVarFp = exports.AuthorisationApiFp(configuration);
    return {
        authorize(authoriseReq, options) {
            return localVarFp.authorize(authoriseReq, options).then((request) => request(axios, basePath));
        },
        limit(rateLimiterReq, options) {
            return localVarFp.limit(rateLimiterReq, options).then((request) => request(axios, basePath));
        },
    };
};
exports.AuthorisationApiFactory = AuthorisationApiFactory;
class AuthorisationApi extends base_1.BaseAPI {
    authorize(authoriseReq, options) {
        return exports.AuthorisationApiFp(this.configuration).authorize(authoriseReq, options).then((request) => request(this.axios, this.basePath));
    }
    limit(rateLimiterReq, options) {
        return exports.AuthorisationApiFp(this.configuration).limit(rateLimiterReq, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.AuthorisationApi = AuthorisationApi;
const ServerApiAxiosParamCreator = function (configuration) {
    return {
        cfg: (options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/server/cfg`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        health: (key, options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/server/health`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            if (key !== undefined) {
                localVarQueryParameter['key'] = key;
            }
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.ServerApiAxiosParamCreator = ServerApiAxiosParamCreator;
const ServerApiFp = function (configuration) {
    const localVarAxiosParamCreator = exports.ServerApiAxiosParamCreator(configuration);
    return {
        cfg(options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.cfg(options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        health(key, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.health(key, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.ServerApiFp = ServerApiFp;
const ServerApiFactory = function (configuration, basePath, axios) {
    const localVarFp = exports.ServerApiFp(configuration);
    return {
        cfg(options) {
            return localVarFp.cfg(options).then((request) => request(axios, basePath));
        },
        health(key, options) {
            return localVarFp.health(key, options).then((request) => request(axios, basePath));
        },
    };
};
exports.ServerApiFactory = ServerApiFactory;
class ServerApi extends base_1.BaseAPI {
    cfg(options) {
        return exports.ServerApiFp(this.configuration).cfg(options).then((request) => request(this.axios, this.basePath));
    }
    health(key, options) {
        return exports.ServerApiFp(this.configuration).health(key, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.ServerApi = ServerApi;
const SessionApiAxiosParamCreator = function (configuration) {
    return {
        authenticate: (authenticateReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('authenticate', 'authenticateReq', authenticateReq);
            const localVarPath = `/api/session`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'PATCH' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(authenticateReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        confirmSessionAuths: (confirmSessionAuthsReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('confirmSessionAuths', 'confirmSessionAuthsReq', confirmSessionAuthsReq);
            const localVarPath = `/api/session/auth/confirm`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(confirmSessionAuthsReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        delSession: (sessionId, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('delSession', 'sessionId', sessionId);
            const localVarPath = `/api/session/{session-id}`
                .replace(`{${"session-id"}}`, encodeURIComponent(String(sessionId)));
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'DELETE' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        getAll: (entry, userId, options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/session/all`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            if (entry !== undefined) {
                localVarQueryParameter['entry'] = entry;
            }
            if (userId !== undefined) {
                localVarQueryParameter['userId'] = userId;
            }
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        getSession: (options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/session`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        newSession: (newSessionReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('newSession', 'newSessionReq', newSessionReq);
            const localVarPath = `/api/session`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(newSessionReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        signOut: (options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/session`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'DELETE' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.SessionApiAxiosParamCreator = SessionApiAxiosParamCreator;
const SessionApiFp = function (configuration) {
    const localVarAxiosParamCreator = exports.SessionApiAxiosParamCreator(configuration);
    return {
        authenticate(authenticateReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.authenticate(authenticateReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        confirmSessionAuths(confirmSessionAuthsReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.confirmSessionAuths(confirmSessionAuthsReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        delSession(sessionId, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.delSession(sessionId, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        getAll(entry, userId, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getAll(entry, userId, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        getSession(options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getSession(options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        newSession(newSessionReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.newSession(newSessionReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        signOut(options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.signOut(options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.SessionApiFp = SessionApiFp;
const SessionApiFactory = function (configuration, basePath, axios) {
    const localVarFp = exports.SessionApiFp(configuration);
    return {
        authenticate(authenticateReq, options) {
            return localVarFp.authenticate(authenticateReq, options).then((request) => request(axios, basePath));
        },
        confirmSessionAuths(confirmSessionAuthsReq, options) {
            return localVarFp.confirmSessionAuths(confirmSessionAuthsReq, options).then((request) => request(axios, basePath));
        },
        delSession(sessionId, options) {
            return localVarFp.delSession(sessionId, options).then((request) => request(axios, basePath));
        },
        getAll(entry, userId, options) {
            return localVarFp.getAll(entry, userId, options).then((request) => request(axios, basePath));
        },
        getSession(options) {
            return localVarFp.getSession(options).then((request) => request(axios, basePath));
        },
        newSession(newSessionReq, options) {
            return localVarFp.newSession(newSessionReq, options).then((request) => request(axios, basePath));
        },
        signOut(options) {
            return localVarFp.signOut(options).then((request) => request(axios, basePath));
        },
    };
};
exports.SessionApiFactory = SessionApiFactory;
class SessionApi extends base_1.BaseAPI {
    authenticate(authenticateReq, options) {
        return exports.SessionApiFp(this.configuration).authenticate(authenticateReq, options).then((request) => request(this.axios, this.basePath));
    }
    confirmSessionAuths(confirmSessionAuthsReq, options) {
        return exports.SessionApiFp(this.configuration).confirmSessionAuths(confirmSessionAuthsReq, options).then((request) => request(this.axios, this.basePath));
    }
    delSession(sessionId, options) {
        return exports.SessionApiFp(this.configuration).delSession(sessionId, options).then((request) => request(this.axios, this.basePath));
    }
    getAll(entry, userId, options) {
        return exports.SessionApiFp(this.configuration).getAll(entry, userId, options).then((request) => request(this.axios, this.basePath));
    }
    getSession(options) {
        return exports.SessionApiFp(this.configuration).getSession(options).then((request) => request(this.axios, this.basePath));
    }
    newSession(newSessionReq, options) {
        return exports.SessionApiFp(this.configuration).newSession(newSessionReq, options).then((request) => request(this.axios, this.basePath));
    }
    signOut(options) {
        return exports.SessionApiFp(this.configuration).signOut(options).then((request) => request(this.axios, this.basePath));
    }
}
exports.SessionApi = SessionApi;
const SignatureApiAxiosParamCreator = function (configuration) {
    return {
        getPublicKey: (options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/signature/public-key`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        sign: (body, secret, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('sign', 'body', body);
            const localVarPath = `/api/signature/sign`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            if (secret !== undefined) {
                localVarQueryParameter['secret'] = secret;
            }
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(body, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        verify: (signature, body, secret, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('verify', 'signature', signature);
            common_1.assertParamExists('verify', 'body', body);
            const localVarPath = `/api/signature/verify`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            if (signature !== undefined) {
                localVarQueryParameter['signature'] = signature;
            }
            if (secret !== undefined) {
                localVarQueryParameter['secret'] = secret;
            }
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(body, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.SignatureApiAxiosParamCreator = SignatureApiAxiosParamCreator;
const SignatureApiFp = function (configuration) {
    const localVarAxiosParamCreator = exports.SignatureApiAxiosParamCreator(configuration);
    return {
        getPublicKey(options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getPublicKey(options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        sign(body, secret, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.sign(body, secret, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        verify(signature, body, secret, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.verify(signature, body, secret, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.SignatureApiFp = SignatureApiFp;
const SignatureApiFactory = function (configuration, basePath, axios) {
    const localVarFp = exports.SignatureApiFp(configuration);
    return {
        getPublicKey(options) {
            return localVarFp.getPublicKey(options).then((request) => request(axios, basePath));
        },
        sign(body, secret, options) {
            return localVarFp.sign(body, secret, options).then((request) => request(axios, basePath));
        },
        verify(signature, body, secret, options) {
            return localVarFp.verify(signature, body, secret, options).then((request) => request(axios, basePath));
        },
    };
};
exports.SignatureApiFactory = SignatureApiFactory;
class SignatureApi extends base_1.BaseAPI {
    getPublicKey(options) {
        return exports.SignatureApiFp(this.configuration).getPublicKey(options).then((request) => request(this.axios, this.basePath));
    }
    sign(body, secret, options) {
        return exports.SignatureApiFp(this.configuration).sign(body, secret, options).then((request) => request(this.axios, this.basePath));
    }
    verify(signature, body, secret, options) {
        return exports.SignatureApiFp(this.configuration).verify(signature, body, secret, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.SignatureApi = SignatureApi;
const TokenApiAxiosParamCreator = function (configuration) {
    return {
        refreshToken: (refreshTokenReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('refreshToken', 'refreshTokenReq', refreshTokenReq);
            const localVarPath = `/api/token/refresh`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(refreshTokenReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.TokenApiAxiosParamCreator = TokenApiAxiosParamCreator;
const TokenApiFp = function (configuration) {
    const localVarAxiosParamCreator = exports.TokenApiAxiosParamCreator(configuration);
    return {
        refreshToken(refreshTokenReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.refreshToken(refreshTokenReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.TokenApiFp = TokenApiFp;
const TokenApiFactory = function (configuration, basePath, axios) {
    const localVarFp = exports.TokenApiFp(configuration);
    return {
        refreshToken(refreshTokenReq, options) {
            return localVarFp.refreshToken(refreshTokenReq, options).then((request) => request(axios, basePath));
        },
    };
};
exports.TokenApiFactory = TokenApiFactory;
class TokenApi extends base_1.BaseAPI {
    refreshToken(refreshTokenReq, options) {
        return exports.TokenApiFp(this.configuration).refreshToken(refreshTokenReq, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.TokenApi = TokenApi;
const UserApiAxiosParamCreator = function (configuration) {
    return {
        confirmUserAuths: (confirmUserAuthsReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('confirmUserAuths', 'confirmUserAuthsReq', confirmUserAuthsReq);
            const localVarPath = `/api/user/auth/confirm`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'POST' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(confirmUserAuthsReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        editUser: (id, editUserReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('editUser', 'id', id);
            common_1.assertParamExists('editUser', 'editUserReq', editUserReq);
            const localVarPath = `/api/user/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id)));
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'PATCH' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(editUserReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        getUser: (options = {}) => __awaiter(this, void 0, void 0, function* () {
            const localVarPath = `/api/user`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'GET' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
        saveUser: (saveUserReq, options = {}) => __awaiter(this, void 0, void 0, function* () {
            common_1.assertParamExists('saveUser', 'saveUserReq', saveUserReq);
            const localVarPath = `/api/user`;
            const localVarUrlObj = new URL(localVarPath, common_1.DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign(Object.assign({ method: 'PATCH' }, baseOptions), options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};
            yield common_1.setApiKeyToObject(localVarQueryParameter, "access-token", configuration);
            localVarHeaderParameter['Content-Type'] = 'application/json';
            common_1.setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = Object.assign(Object.assign(Object.assign({}, localVarHeaderParameter), headersFromBaseOptions), options.headers);
            localVarRequestOptions.data = common_1.serializeDataIfNeeded(saveUserReq, localVarRequestOptions, configuration);
            return {
                url: common_1.toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        }),
    };
};
exports.UserApiAxiosParamCreator = UserApiAxiosParamCreator;
const UserApiFp = function (configuration) {
    const localVarAxiosParamCreator = exports.UserApiAxiosParamCreator(configuration);
    return {
        confirmUserAuths(confirmUserAuthsReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.confirmUserAuths(confirmUserAuthsReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        editUser(id, editUserReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.editUser(id, editUserReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        getUser(options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.getUser(options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
        saveUser(saveUserReq, options) {
            return __awaiter(this, void 0, void 0, function* () {
                const localVarAxiosArgs = yield localVarAxiosParamCreator.saveUser(saveUserReq, options);
                return common_1.createRequestFunction(localVarAxiosArgs, axios_1.default, base_1.BASE_PATH, configuration);
            });
        },
    };
};
exports.UserApiFp = UserApiFp;
const UserApiFactory = function (configuration, basePath, axios) {
    const localVarFp = exports.UserApiFp(configuration);
    return {
        confirmUserAuths(confirmUserAuthsReq, options) {
            return localVarFp.confirmUserAuths(confirmUserAuthsReq, options).then((request) => request(axios, basePath));
        },
        editUser(id, editUserReq, options) {
            return localVarFp.editUser(id, editUserReq, options).then((request) => request(axios, basePath));
        },
        getUser(options) {
            return localVarFp.getUser(options).then((request) => request(axios, basePath));
        },
        saveUser(saveUserReq, options) {
            return localVarFp.saveUser(saveUserReq, options).then((request) => request(axios, basePath));
        },
    };
};
exports.UserApiFactory = UserApiFactory;
class UserApi extends base_1.BaseAPI {
    confirmUserAuths(confirmUserAuthsReq, options) {
        return exports.UserApiFp(this.configuration).confirmUserAuths(confirmUserAuthsReq, options).then((request) => request(this.axios, this.basePath));
    }
    editUser(id, editUserReq, options) {
        return exports.UserApiFp(this.configuration).editUser(id, editUserReq, options).then((request) => request(this.axios, this.basePath));
    }
    getUser(options) {
        return exports.UserApiFp(this.configuration).getUser(options).then((request) => request(this.axios, this.basePath));
    }
    saveUser(saveUserReq, options) {
        return exports.UserApiFp(this.configuration).saveUser(saveUserReq, options).then((request) => request(this.axios, this.basePath));
    }
}
exports.UserApi = UserApi;
//# sourceMappingURL=api.js.map