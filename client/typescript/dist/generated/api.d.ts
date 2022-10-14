import { Configuration } from './configuration';
import { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { RequestArgs, BaseAPI } from './base';
export interface AccessDenied {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface AccessTokenCfg {
    'cookie'?: boolean;
    'cache'?: Cache;
    'cacheUnauthenticated'?: boolean;
    'ttl'?: string;
}
export interface AnswerErr {
    'tooShort': boolean;
    'tooLong': boolean;
}
export interface AnyErr {
    [key: string]: any;
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface AppSecretAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
}
export interface AppSecretReq {
    'secret': string;
}
export interface AuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
}
export interface AuthCodeHandlerCfg {
    'tokenUrl': string;
    'clientId': string;
    'clientSecret'?: string;
}
export interface AuthData {
    'public': {
        [key: string]: any;
    };
    'login'?: string;
}
export interface AuthExecRes {
    'status': AuthExecResStatusEnum;
    'sentCode'?: Code;
    'err'?: Err;
    'resData'?: AuthExecResResData;
}
export declare const AuthExecResStatusEnum: {
    readonly Ok: "OK";
    readonly Err: "ERR";
    readonly Skipped: "SKIPPED";
};
export declare type AuthExecResStatusEnum = typeof AuthExecResStatusEnum[keyof typeof AuthExecResStatusEnum];
export interface AuthExecResResData {
    [key: string]: any;
    'emailSentTo'?: string;
    'ipEncoded'?: string;
    'login'?: string;
    'publicData'?: {
        [key: string]: object;
    };
    'password'?: string;
    'strength'?: string;
    'correct'?: {
        [key: string]: boolean;
    };
    'answersSavedAt'?: {
        [key: string]: number;
    };
}
export interface AuthIsNotConfirmed {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface AuthIsNotEnabled {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface AuthRequiresAnother {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface AuthUserCfg {
    'data'?: AuthData;
    'sentCodes'?: Array<UnconfirmedAuthData>;
    'confirmed'?: boolean;
}
export interface AuthenticateReq {
    'factors'?: {
        [key: string]: string;
    };
    'authReqs'?: {
        [key: string]: AuthenticateReqAuthReqsValue;
    };
    'dryRun'?: boolean;
}
export interface AuthenticateReqAuthReqsValue {
    [key: string]: any;
    'secret'?: string;
    'email'?: string;
    'template'?: string;
    'accessToken'?: string;
    'authorizationCode'?: string;
    'password'?: string;
    'confirmPassword'?: string;
    'answers'?: {
        [key: string]: string;
    };
}
export interface AuthenticateRes {
    'tokens'?: Tokens;
    'session'?: Session;
    'user'?: User;
    'authRes': {
        [key: string]: AuthExecRes;
    };
}
export interface AuthorizeReq {
    'rateLimiter'?: RateLimiterReq;
}
export interface AuthorizeRes {
    'session'?: Session;
}
export interface BuiltInAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
}
export declare const Cache: {
    readonly Jwt: "JWT";
    readonly Binary: "BINARY";
};
export declare type Cache = typeof Cache[keyof typeof Cache];
export interface ClientErr {
    [key: string]: any;
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'changedAt'?: number;
    'changedDaysAgo'?: number;
    'tooLong'?: boolean;
    'tooShort'?: boolean;
    'missingNumber'?: boolean;
    'missingSymbol'?: boolean;
    'missingUpperCase'?: boolean;
    'missingLowerCase'?: boolean;
    'commonPassword'?: boolean;
    'wasUsedBeforeAt'?: number;
    'matchesLogin'?: LoginId;
    'passwordsMismatch'?: boolean;
    'strength'?: string;
    'wasUsedDaysAgo'?: number;
    'data'?: {
        [key: string]: object;
    };
    'incorrectAnswers'?: Array<string>;
    'requiresMoreAnswers'?: boolean;
    'questionsNotFound'?: Array<string>;
    'invalidAnswers'?: {
        [key: string]: AnswerErr;
    };
    'tooManyAnswers'?: boolean;
    'waitTimeMs'?: number;
    'waitTimeSeconds'?: number;
    'waitTimeMinutes'?: number;
    'expiredAt'?: number;
}
export declare const ClientErrCode: {
    readonly PluginClientErr: "PLUGIN_CLIENT_ERR";
    readonly PasswordIsIncorrect: "PASSWORD_IS_INCORRECT";
    readonly PasswordIsInvalid: "PASSWORD_IS_INVALID";
    readonly EmailIsIncorrect: "EMAIL_IS_INCORRECT";
    readonly IpNew: "IP_NEW";
    readonly QuestionsAnswersIncorrect: "QUESTIONS_ANSWERS_INCORRECT";
    readonly QuestionsAnswersInvalid: "QUESTIONS_ANSWERS_INVALID";
    readonly SessionExpired: "SESSION_EXPIRED";
    readonly AccessDenied: "ACCESS_DENIED";
    readonly UserNotFound: "USER_NOT_FOUND";
    readonly SignatureIsIncorrect: "SIGNATURE_IS_INCORRECT";
    readonly UserLoginAlreadyTaken: "USER_LOGIN_ALREADY_TAKEN";
    readonly AuthIsNotEnabled: "AUTH_IS_NOT_ENABLED";
    readonly TokenExpired: "TOKEN_EXPIRED";
    readonly TooManyReqs: "TOO_MANY_REQS";
    readonly AuthIsNotConfirmed: "AUTH_IS_NOT_CONFIRMED";
    readonly AuthRequiresAnother: "AUTH_REQUIRES_ANOTHER";
    readonly CodeIsExpired: "CODE_IS_EXPIRED";
    readonly CodeTooManyAttempts: "CODE_TOO_MANY_ATTEMPTS";
    readonly CodeIsIncorrect: "CODE_IS_INCORRECT";
    readonly Unauthenticated: "UNAUTHENTICATED";
};
export declare type ClientErrCode = typeof ClientErrCode[keyof typeof ClientErrCode];
export interface Code {
    'id'?: string;
    'validUntil': number;
    'usedAttempts': number;
    'attemptsLeft': number;
    'sentAt': number;
    'hasAttemptsLeft'?: boolean;
}
export interface CodeCfg {
    'length'?: number;
    'ttl'?: string;
    'alphabet'?: string;
    'easyToRemember'?: boolean;
    'maxAttempts'?: number;
}
export interface CodeIsExpired {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface CodeIsIncorrect {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface CodeTooManyAttempts {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface CodeVerifier {
    'id'?: string;
    'validUntil': number;
    'usedAttempts': number;
    'attemptsLeft': number;
    'sentAt': number;
    'hasAttemptsLeft'?: boolean;
}
export interface ConfirmSessionAuthsReq {
    'sessionId'?: string;
    'receivedCodes': {
        [key: string]: {
            [key: string]: string;
        };
    };
}
export interface ConfirmUserAuthsReq {
    'userId'?: string;
    'receivedCodes': {
        [key: string]: {
            [key: string]: string;
        };
    };
}
export interface DbHealthRes {
    'user': HealthStatusRes;
    'session': HealthStatusRes;
    'rateLimiter': HealthStatusRes;
}
export interface DbsCfg {
    'user': DbsCfgUser;
    'session': DbsCfgSession;
    'rateLimiter': DbsCfgRateLimiter;
}
export interface DbsCfgRateLimiter {
    'inMemory'?: boolean;
    'inToken'?: boolean;
    'mongodb'?: string;
    'database'?: number;
    'redis'?: Array<string>;
    'cluster'?: boolean;
    'user'?: string;
    'password'?: string;
    'ssl'?: boolean;
    'maxConnections'?: number;
    'remote'?: string;
    'query'?: {
        [key: string]: string;
    };
    'headers'?: {
        [key: string]: string;
    };
    'mysql'?: string;
    'username'?: string;
    'postgres'?: string;
    'sqlite'?: string;
}
export interface DbsCfgSession {
    'inMemory'?: boolean;
    'inToken'?: boolean;
    'mongodb'?: string;
    'database'?: number;
    'redis'?: Array<string>;
    'cluster'?: boolean;
    'user'?: string;
    'password'?: string;
    'ssl'?: boolean;
    'maxConnections'?: number;
    'remote'?: string;
    'query'?: {
        [key: string]: string;
    };
    'headers'?: {
        [key: string]: string;
    };
    'mysql'?: string;
    'username'?: string;
    'postgres'?: string;
    'sqlite'?: string;
}
export interface DbsCfgUser {
    'inMemory'?: boolean;
    'inToken'?: boolean;
    'mongodb'?: string;
    'database'?: number;
    'redis'?: Array<string>;
    'cluster'?: boolean;
    'user'?: string;
    'password'?: string;
    'ssl'?: boolean;
    'maxConnections'?: number;
    'remote'?: string;
    'query'?: {
        [key: string]: string;
    };
    'headers'?: {
        [key: string]: string;
    };
    'mysql'?: string;
    'username'?: string;
    'postgres'?: string;
    'sqlite'?: string;
}
export interface Device {
    'mobile': boolean;
    'type'?: string;
    'browser'?: string;
    'userAgent': string;
}
export interface EditUserReq {
    'factors'?: {
        [key: string]: boolean;
    };
    'logins'?: {
        [key: string]: string;
    };
    'authReqs'?: {
        [key: string]: AuthenticateReqAuthReqsValue;
    };
    'dryRun'?: boolean;
    'systemAccess'?: boolean;
}
export interface EmailAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'server': string;
    'sender': string;
    'username'?: string;
    'password'?: string;
    'confirmationUrl'?: string;
    'templates'?: {
        [key: string]: string;
    };
    'templateParams'?: {
        [key: string]: string;
    };
    'code'?: CodeCfg;
}
export interface EmailAuthRes {
    'emailSentTo'?: string;
}
export interface EmailAuthenticateReq {
    'email'?: string;
    'template'?: string;
}
export interface EmailIsIncorrect {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface EmailUpdateReq {
    'email': string;
    'template'?: string;
}
export interface EntryAccessTokenCfg {
    'ttl'?: string;
    'cache'?: boolean;
}
export interface EntryCfg {
    'factorsRequired'?: {
        [key: string]: Array<string>;
    };
    'factorsOptional'?: {
        [key: string]: Array<string>;
    };
    'requiresEntry'?: Array<string>;
    'accessToken'?: EntryAccessTokenCfg;
    'ttl'?: string;
    'editAccount'?: boolean;
}
export interface Err {
    [key: string]: any;
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'changedAt'?: number;
    'changedDaysAgo'?: number;
    'tooLong'?: boolean;
    'tooShort'?: boolean;
    'missingNumber'?: boolean;
    'missingSymbol'?: boolean;
    'missingUpperCase'?: boolean;
    'missingLowerCase'?: boolean;
    'commonPassword'?: boolean;
    'wasUsedBeforeAt'?: number;
    'matchesLogin'?: LoginId;
    'passwordsMismatch'?: boolean;
    'strength'?: string;
    'wasUsedDaysAgo'?: number;
    'data'?: {
        [key: string]: object;
    };
    'incorrectAnswers'?: Array<string>;
    'requiresMoreAnswers'?: boolean;
    'questionsNotFound'?: Array<string>;
    'invalidAnswers'?: {
        [key: string]: AnswerErr;
    };
    'tooManyAnswers'?: boolean;
    'waitTimeMs'?: number;
    'waitTimeSeconds'?: number;
    'waitTimeMinutes'?: number;
    'expiredAt'?: number;
}
export interface ErrAuthExecRes {
    'status': ErrAuthExecResStatusEnum;
    'sentCode'?: Code;
    'err': Err;
}
export declare const ErrAuthExecResStatusEnum: {
    readonly Ok: "OK";
    readonly Err: "ERR";
    readonly Skipped: "SKIPPED";
};
export declare type ErrAuthExecResStatusEnum = typeof ErrAuthExecResStatusEnum[keyof typeof ErrAuthExecResStatusEnum];
export declare const ErrCode: {
    readonly PluginErr: "PLUGIN_ERR";
    readonly PluginClientErr: "PLUGIN_CLIENT_ERR";
    readonly PasswordIsIncorrect: "PASSWORD_IS_INCORRECT";
    readonly PasswordIsInvalid: "PASSWORD_IS_INVALID";
    readonly EmailIsIncorrect: "EMAIL_IS_INCORRECT";
    readonly IpNew: "IP_NEW";
    readonly QuestionsAnswersIncorrect: "QUESTIONS_ANSWERS_INCORRECT";
    readonly QuestionsAnswersInvalid: "QUESTIONS_ANSWERS_INVALID";
    readonly SessionExpired: "SESSION_EXPIRED";
    readonly AccessDenied: "ACCESS_DENIED";
    readonly UserNotFound: "USER_NOT_FOUND";
    readonly SignatureIsIncorrect: "SIGNATURE_IS_INCORRECT";
    readonly UserLoginAlreadyTaken: "USER_LOGIN_ALREADY_TAKEN";
    readonly AuthIsNotEnabled: "AUTH_IS_NOT_ENABLED";
    readonly TokenExpired: "TOKEN_EXPIRED";
    readonly TooManyReqs: "TOO_MANY_REQS";
    readonly AuthIsNotConfirmed: "AUTH_IS_NOT_CONFIRMED";
    readonly NoAuthAvailableForFactor: "NO_AUTH_AVAILABLE_FOR_FACTOR";
    readonly AuthRequiresAnother: "AUTH_REQUIRES_ANOTHER";
    readonly CodeIsExpired: "CODE_IS_EXPIRED";
    readonly CodeTooManyAttempts: "CODE_TOO_MANY_ATTEMPTS";
    readonly CodeIsIncorrect: "CODE_IS_INCORRECT";
    readonly Unauthenticated: "UNAUTHENTICATED";
    readonly ServerErr: "SERVER_ERR";
    readonly IntegrationErr: "INTEGRATION_ERR";
    readonly AnyErr: "ANY_ERR";
};
export declare type ErrCode = typeof ErrCode[keyof typeof ErrCode];
export interface FindSessionsRes {
    'sessions': Array<Session>;
    'tooManySessions'?: boolean;
}
export interface HealthRes {
    'db': DbHealthRes;
    'auth': {
        [key: string]: HealthStatusRes;
    };
    'status': HealthStatus;
    'msg'?: string;
}
export declare const HealthStatus: {
    readonly Healthy: "HEALTHY";
    readonly Unavailable: "UNAVAILABLE";
    readonly Err: "ERR";
};
export declare type HealthStatus = typeof HealthStatus[keyof typeof HealthStatus];
export interface HealthStatusRes {
    'status': HealthStatus;
    'msg'?: string;
}
export interface I18nCfg {
    'dir'?: string;
    'default'?: string;
}
export interface InMemoryCfg {
    'inMemory'?: boolean;
}
export interface InTokenCfg {
    'inToken'?: boolean;
}
export interface IntegrationErr {
    [key: string]: any;
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export declare const IntegrationErrCode: {
    readonly NoAuthAvailableForFactor: "NO_AUTH_AVAILABLE_FOR_FACTOR";
    readonly IntegrationErr: "INTEGRATION_ERR";
};
export declare type IntegrationErrCode = typeof IntegrationErrCode[keyof typeof IntegrationErrCode];
export interface IpAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'ipBytesToIgnore'?: number;
    'historySize'?: number;
}
export interface IpAuthRes {
    'ipEncoded': string;
}
export interface IpNew {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface JdbcCfg {
    'username'?: string;
    'password'?: string;
    'maxConnections'?: number;
}
export interface Login {
    'type': string;
    'login': string;
    'unconfirmedLogin'?: string;
    'confirmed'?: boolean;
}
export interface LoginId {
    'type': string;
    'login': string;
}
export interface MongoCfg {
    'mongodb': string;
    'database': string;
}
export interface MysqlCfg {
    'mysql'?: string;
    'username'?: string;
    'maxConnections'?: number;
    'password'?: string;
}
export interface NewSessionReq {
    'entry': string;
    'logins'?: {
        [key: string]: string;
    };
    'factors'?: {
        [key: string]: string;
    };
    'authReqs'?: {
        [key: string]: AuthenticateReqAuthReqsValue;
    };
    'signIn'?: boolean;
    'signUp'?: boolean;
    'dryRun'?: boolean;
}
export interface NextFactor {
    'factor': string;
    'supportedAuths': Set<string>;
}
export interface NoAuthAvailableForFactor {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface OAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'extractLogin': string;
    'tokenUrl'?: string;
    'clientId'?: string;
    'clientSecret'?: string;
    'userInfoUrl'?: string;
    'sendTokenInQuery'?: string;
    'sendTokenInHeader'?: boolean;
    'extractPublicData'?: {
        [key: string]: string;
    };
}
export interface OAuthReq {
    'accessToken'?: string;
    'authorizationCode'?: string;
}
export interface OAuthRes {
    'login': string;
    'publicData': {
        [key: string]: object;
    };
}
export interface OkAuthExecRes {
    'status': OkAuthExecResStatusEnum;
    'sentCode'?: Code;
    'resData'?: AuthExecResResData;
}
export declare const OkAuthExecResStatusEnum: {
    readonly Ok: "OK";
    readonly Err: "ERR";
    readonly Skipped: "SKIPPED";
};
export declare type OkAuthExecResStatusEnum = typeof OkAuthExecResStatusEnum[keyof typeof OkAuthExecResStatusEnum];
export interface PasswordAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'maxLength'?: number;
    'minLength'?: number;
    'requireNumber'?: boolean;
    'requireSymbol'?: boolean;
    'requireUpperCase'?: boolean;
    'forbidCommonPasswords'?: boolean;
    'forbidLoginAsPassword'?: boolean;
    'forbidReusingPassword'?: PasswordHistoryCfg;
    'strength'?: {
        [key: string]: PasswordStrengthRequirements;
    };
}
export interface PasswordAuthenticateReq {
    'password': string;
}
export interface PasswordHistoryCfg {
    'passwordHistorySize'?: number;
    'passwordHistoryTtl'?: string;
}
export interface PasswordIsIncorrect {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'changedAt'?: number;
    'changedDaysAgo'?: number;
}
export interface PasswordIsInvalid {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'tooLong': boolean;
    'tooShort': boolean;
    'missingNumber': boolean;
    'missingSymbol': boolean;
    'missingUpperCase': boolean;
    'missingLowerCase': boolean;
    'commonPassword': boolean;
    'wasUsedBeforeAt'?: number;
    'matchesLogin'?: LoginId;
    'passwordsMismatch': boolean;
    'strength'?: string;
    'wasUsedDaysAgo'?: number;
}
export interface PasswordStrengthRequirements {
    'minLength'?: number;
    'requireNumber'?: boolean;
    'requireSymbol'?: boolean;
    'requireUpperCase'?: boolean;
    'forbidCommonPasswords'?: boolean;
    'forbidLoginAsPassword'?: boolean;
}
export interface PasswordUpdateReq {
    'password'?: string;
    'confirmPassword'?: string;
}
export interface PasswordUpdateRes {
    'password': string;
    'strength'?: string;
}
export interface PluginClientErr {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'data'?: {
        [key: string]: object;
    };
}
export interface PluginErr {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface PostgresCfg {
    'postgres'?: string;
    'username'?: string;
    'maxConnections'?: number;
    'password'?: string;
}
export interface QuestionsAnswersIncorrect {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'incorrectAnswers': Array<string>;
    'requiresMoreAnswers': boolean;
    'questionsNotFound': Array<string>;
}
export interface QuestionsAnswersInvalid {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'invalidAnswers': {
        [key: string]: AnswerErr;
    };
    'tooManyAnswers': boolean;
}
export interface QuestionsAuthCfg {
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'lowercase'?: boolean;
    'removeSymbols'?: boolean;
    'removeSpaces'?: boolean;
    'minLength'?: number;
    'maxLength'?: number;
    'answersRequired'?: number;
    'maxAnswers'?: number;
}
export interface QuestionsAuthenticateReq {
    'answers': {
        [key: string]: string;
    };
}
export interface QuestionsAuthenticateRes {
    'correct': {
        [key: string]: boolean;
    };
}
export interface QuestionsUpdateReq {
    'answers': {
        [key: string]: string;
    };
}
export interface QuestionsUpdateRes {
    'answersSavedAt': {
        [key: string]: number;
    };
}
export interface RateLimiterCfg {
    'userId'?: boolean;
    'ip'?: boolean;
    'quota'?: number;
    'period'?: string;
    'alignLoad'?: boolean;
    'parent'?: string;
}
export interface RateLimiterReq {
    'id': string;
    'quotaToBurn': number;
}
export interface RedisCfg {
    'redis'?: Array<string>;
    'cluster'?: boolean;
    'database'?: number;
    'user'?: string;
    'password'?: string;
    'ssl'?: boolean;
    'maxConnections'?: number;
}
export interface RefreshTokenCfg {
    'ttl'?: string;
    'maxTtl'?: string;
    'unauthenticatedTtl'?: string;
    'allowReuse'?: boolean;
}
export interface RefreshTokenReq {
    'refreshToken': string;
}
export interface RefreshTokenRes {
    'tokens': Tokens;
    'session': Session;
}
export interface RemoteAuthCfg {
    'remote': string;
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'query'?: {
        [key: string]: string;
    };
    'headers'?: {
        [key: string]: string;
    };
    'code'?: CodeCfg;
}
export interface RemoteDbCfg {
    'remote': string;
    'query'?: {
        [key: string]: string;
    };
    'headers'?: {
        [key: string]: string;
    };
}
export interface SHAppCfg {
    'http'?: SHHttpCfg;
    'logins'?: Set<string>;
    'auths'?: {
        [key: string]: SHAppCfgAuthsValue;
    };
    'entries'?: {
        [key: string]: EntryCfg;
    };
    'db'?: DbsCfg;
    'token'?: TokenCfg;
    'rateLimiters'?: {
        [key: string]: RateLimiterCfg;
    };
    'secret'?: string;
    'healthCheckKey'?: string;
    'i18n'?: I18nCfg;
    '$schema'?: string;
}
export interface SHAppCfgAuthsValue {
    'remote'?: string;
    'requiresAuth'?: Array<Array<string>>;
    'skipOnFail'?: boolean;
    'rateLimiter'?: string;
    'burnQuota'?: number;
    'query'?: {
        [key: string]: string;
    };
    'headers'?: {
        [key: string]: string;
    };
    'code'?: CodeCfg;
    'server'?: string;
    'sender'?: string;
    'username'?: string;
    'password'?: string;
    'confirmationUrl'?: string;
    'templates'?: {
        [key: string]: string;
    };
    'templateParams'?: {
        [key: string]: string;
    };
    'ipBytesToIgnore'?: number;
    'historySize'?: number;
    'extractLogin'?: string;
    'tokenUrl'?: string;
    'clientId'?: string;
    'clientSecret'?: string;
    'userInfoUrl'?: string;
    'sendTokenInQuery'?: string;
    'sendTokenInHeader'?: boolean;
    'extractPublicData'?: {
        [key: string]: string;
    };
    'maxLength'?: number;
    'minLength'?: number;
    'requireNumber'?: boolean;
    'requireSymbol'?: boolean;
    'requireUpperCase'?: boolean;
    'forbidCommonPasswords'?: boolean;
    'forbidLoginAsPassword'?: boolean;
    'forbidReusingPassword'?: PasswordHistoryCfg;
    'strength'?: {
        [key: string]: PasswordStrengthRequirements;
    };
    'lowercase'?: boolean;
    'removeSymbols'?: boolean;
    'removeSpaces'?: boolean;
    'answersRequired'?: number;
    'maxAnswers'?: number;
}
export interface SHHttpCfg {
    'port'?: number;
    'bind'?: string;
    'proxy'?: boolean;
}
export interface SaveUserReq {
    'factors'?: {
        [key: string]: boolean;
    };
    'logins'?: {
        [key: string]: string;
    };
    'authReqs'?: {
        [key: string]: AuthenticateReqAuthReqsValue;
    };
    'dryRun'?: boolean;
}
export interface SaveUserRes {
    'user'?: User;
    'authRes': {
        [key: string]: AuthExecRes;
    };
}
export interface ServerErr {
    [key: string]: any;
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export declare const ServerErrCode: {
    readonly ServerErr: "SERVER_ERR";
    readonly PluginErr: "PLUGIN_ERR";
};
export declare type ServerErrCode = typeof ServerErrCode[keyof typeof ServerErrCode];
export interface Session {
    'id': string;
    'entry': string;
    'identifiedBy': Array<LoginId>;
    'userId'?: string;
    'authenticatedBy': {
        [key: string]: string;
    };
    'unconfirmedAuths': {
        [key: string]: UnconfirmedAuth;
    };
    'nextFactors': Array<NextFactor>;
    'signedInAt': number;
    'expiresAt': number;
    'refreshedAt': number;
    'newUser': boolean;
    'device': Device;
    'systemAccess': boolean;
    'expired'?: boolean;
    'authenticated'?: boolean;
}
export interface SessionExpired {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface SignatureIsIncorrect {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface SkippedAuthExecRes {
    'status': SkippedAuthExecResStatusEnum;
    'sentCode'?: Code;
}
export declare const SkippedAuthExecResStatusEnum: {
    readonly Ok: "OK";
    readonly Err: "ERR";
    readonly Skipped: "SKIPPED";
};
export declare type SkippedAuthExecResStatusEnum = typeof SkippedAuthExecResStatusEnum[keyof typeof SkippedAuthExecResStatusEnum];
export interface SqliteCfg {
    'username'?: string;
    'password'?: string;
    'maxConnections'?: number;
    'sqlite'?: string;
}
export interface TokenCfg {
    'access'?: AccessTokenCfg;
    'refresh'?: RefreshTokenCfg;
    'sameUserAgent'?: boolean;
}
export interface TokenExpired {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'expiredAt'?: number;
}
export interface TokenHandlerCfg {
    'userInfoUrl': string;
    'sendTokenInQuery'?: string;
    'sendTokenInHeader'?: boolean;
}
export interface Tokens {
    'access': string;
    'refresh': string;
    'accessTokenExpiresAt'?: number;
}
export interface TooManyReqs {
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'waitTimeMs'?: number;
    'waitTimeSeconds'?: number;
    'waitTimeMinutes'?: number;
}
export interface Unauthenticated {
    [key: string]: any;
    'code': string;
    'devMsg': string;
    'msg'?: string;
    'expiredAt'?: number;
}
export declare const UnauthenticatedCode: {
    readonly SessionExpired: "SESSION_EXPIRED";
    readonly AccessDenied: "ACCESS_DENIED";
    readonly UserNotFound: "USER_NOT_FOUND";
    readonly TokenExpired: "TOKEN_EXPIRED";
    readonly Unauthenticated: "UNAUTHENTICATED";
};
export declare type UnauthenticatedCode = typeof UnauthenticatedCode[keyof typeof UnauthenticatedCode];
export interface UnconfirmedAuth {
    'sentCodes'?: Array<CodeVerifier>;
}
export interface UnconfirmedAuthData {
    'data': AuthData;
    'code': CodeVerifier;
}
export interface User {
    'id': string;
    'logins': Array<Login>;
    'auths': {
        [key: string]: AuthUserCfg;
    };
    'factors': Set<string>;
    'signedUpAt': number;
    'updatedAt': number;
    'isNew'?: boolean;
    'systemAccess'?: boolean;
    'new'?: boolean;
}
export interface UserLoginAlreadyTaken {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export interface UserNotFound {
    'code': string;
    'devMsg': string;
    'msg'?: string;
}
export declare const AuthorisationApiAxiosParamCreator: (configuration?: Configuration | undefined) => {
    authorize: (authorizeReq: AuthorizeReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    limit: (rateLimiterReq: RateLimiterReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
export declare const AuthorisationApiFp: (configuration?: Configuration | undefined) => {
    authorize(authorizeReq: AuthorizeReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<AuthorizeRes>>;
    limit(rateLimiterReq: RateLimiterReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<AuthorizeRes>>;
};
export declare const AuthorisationApiFactory: (configuration?: Configuration | undefined, basePath?: string | undefined, axios?: AxiosInstance | undefined) => {
    authorize(authorizeReq: AuthorizeReq, options?: any): AxiosPromise<AuthorizeRes>;
    limit(rateLimiterReq: RateLimiterReq, options?: any): AxiosPromise<AuthorizeRes>;
};
export declare class AuthorisationApi extends BaseAPI {
    authorize(authorizeReq: AuthorizeReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<AuthorizeRes>>;
    limit(rateLimiterReq: RateLimiterReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<AuthorizeRes>>;
}
export declare const ServerApiAxiosParamCreator: (configuration?: Configuration | undefined) => {
    cfg: (options?: AxiosRequestConfig) => Promise<RequestArgs>;
    health: (key?: string | undefined, options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
export declare const ServerApiFp: (configuration?: Configuration | undefined) => {
    cfg(options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<SHAppCfg>>;
    health(key?: string | undefined, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<HealthRes>>;
};
export declare const ServerApiFactory: (configuration?: Configuration | undefined, basePath?: string | undefined, axios?: AxiosInstance | undefined) => {
    cfg(options?: any): AxiosPromise<SHAppCfg>;
    health(key?: string | undefined, options?: any): AxiosPromise<HealthRes>;
};
export declare class ServerApi extends BaseAPI {
    cfg(options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<SHAppCfg>>;
    health(key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<HealthRes>>;
}
export declare const SessionApiAxiosParamCreator: (configuration?: Configuration | undefined) => {
    authenticate: (authenticateReq: AuthenticateReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    confirmSessionAuths: (confirmSessionAuthsReq: ConfirmSessionAuthsReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    delSession: (sessionId: string, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    getAll: (entry?: string | undefined, userId?: string | undefined, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    getSession: (options?: AxiosRequestConfig) => Promise<RequestArgs>;
    newSession: (newSessionReq: NewSessionReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    signOut: (options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
export declare const SessionApiFp: (configuration?: Configuration | undefined) => {
    authenticate(authenticateReq: AuthenticateReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<AuthenticateRes>>;
    confirmSessionAuths(confirmSessionAuthsReq: ConfirmSessionAuthsReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<AuthenticateRes>>;
    delSession(sessionId: string, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<object>>;
    getAll(entry?: string | undefined, userId?: string | undefined, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<FindSessionsRes>>;
    getSession(options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<Session>>;
    newSession(newSessionReq: NewSessionReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<AuthenticateRes>>;
    signOut(options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<object>>;
};
export declare const SessionApiFactory: (configuration?: Configuration | undefined, basePath?: string | undefined, axios?: AxiosInstance | undefined) => {
    authenticate(authenticateReq: AuthenticateReq, options?: any): AxiosPromise<AuthenticateRes>;
    confirmSessionAuths(confirmSessionAuthsReq: ConfirmSessionAuthsReq, options?: any): AxiosPromise<AuthenticateRes>;
    delSession(sessionId: string, options?: any): AxiosPromise<object>;
    getAll(entry?: string | undefined, userId?: string | undefined, options?: any): AxiosPromise<FindSessionsRes>;
    getSession(options?: any): AxiosPromise<Session>;
    newSession(newSessionReq: NewSessionReq, options?: any): AxiosPromise<AuthenticateRes>;
    signOut(options?: any): AxiosPromise<object>;
};
export declare class SessionApi extends BaseAPI {
    authenticate(authenticateReq: AuthenticateReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<AuthenticateRes>>;
    confirmSessionAuths(confirmSessionAuthsReq: ConfirmSessionAuthsReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<AuthenticateRes>>;
    delSession(sessionId: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<object>>;
    getAll(entry?: string, userId?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<FindSessionsRes>>;
    getSession(options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<Session>>;
    newSession(newSessionReq: NewSessionReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<AuthenticateRes>>;
    signOut(options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<object>>;
}
export declare const SignatureApiAxiosParamCreator: (configuration?: Configuration | undefined) => {
    getPublicKey: (options?: AxiosRequestConfig) => Promise<RequestArgs>;
    sign: (body: string, secret?: string | undefined, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    verify: (signature: string, body: string, secret?: string | undefined, options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
export declare const SignatureApiFp: (configuration?: Configuration | undefined) => {
    getPublicKey(options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<string>>;
    sign(body: string, secret?: string | undefined, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<string>>;
    verify(signature: string, body: string, secret?: string | undefined, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<void>>;
};
export declare const SignatureApiFactory: (configuration?: Configuration | undefined, basePath?: string | undefined, axios?: AxiosInstance | undefined) => {
    getPublicKey(options?: any): AxiosPromise<string>;
    sign(body: string, secret?: string | undefined, options?: any): AxiosPromise<string>;
    verify(signature: string, body: string, secret?: string | undefined, options?: any): AxiosPromise<void>;
};
export declare class SignatureApi extends BaseAPI {
    getPublicKey(options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<string>>;
    sign(body: string, secret?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<string>>;
    verify(signature: string, body: string, secret?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<void>>;
}
export declare const TokenApiAxiosParamCreator: (configuration?: Configuration | undefined) => {
    refreshToken: (refreshTokenReq: RefreshTokenReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
export declare const TokenApiFp: (configuration?: Configuration | undefined) => {
    refreshToken(refreshTokenReq: RefreshTokenReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<RefreshTokenRes>>;
};
export declare const TokenApiFactory: (configuration?: Configuration | undefined, basePath?: string | undefined, axios?: AxiosInstance | undefined) => {
    refreshToken(refreshTokenReq: RefreshTokenReq, options?: any): AxiosPromise<RefreshTokenRes>;
};
export declare class TokenApi extends BaseAPI {
    refreshToken(refreshTokenReq: RefreshTokenReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<RefreshTokenRes>>;
}
export declare const UserApiAxiosParamCreator: (configuration?: Configuration | undefined) => {
    confirmUserAuths: (confirmUserAuthsReq: ConfirmUserAuthsReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    editUser: (id: string, editUserReq: EditUserReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
    getUser: (options?: AxiosRequestConfig) => Promise<RequestArgs>;
    saveUser: (saveUserReq: SaveUserReq, options?: AxiosRequestConfig) => Promise<RequestArgs>;
};
export declare const UserApiFp: (configuration?: Configuration | undefined) => {
    confirmUserAuths(confirmUserAuthsReq: ConfirmUserAuthsReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<SaveUserRes>>;
    editUser(id: string, editUserReq: EditUserReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<SaveUserRes>>;
    getUser(options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<User>>;
    saveUser(saveUserReq: SaveUserReq, options?: AxiosRequestConfig | undefined): Promise<(axios?: AxiosInstance | undefined, basePath?: string | undefined) => AxiosPromise<SaveUserRes>>;
};
export declare const UserApiFactory: (configuration?: Configuration | undefined, basePath?: string | undefined, axios?: AxiosInstance | undefined) => {
    confirmUserAuths(confirmUserAuthsReq: ConfirmUserAuthsReq, options?: any): AxiosPromise<SaveUserRes>;
    editUser(id: string, editUserReq: EditUserReq, options?: any): AxiosPromise<SaveUserRes>;
    getUser(options?: any): AxiosPromise<User>;
    saveUser(saveUserReq: SaveUserReq, options?: any): AxiosPromise<SaveUserRes>;
};
export declare class UserApi extends BaseAPI {
    confirmUserAuths(confirmUserAuthsReq: ConfirmUserAuthsReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<SaveUserRes>>;
    editUser(id: string, editUserReq: EditUserReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<SaveUserRes>>;
    getUser(options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<User>>;
    saveUser(saveUserReq: SaveUserReq, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<SaveUserRes>>;
}
