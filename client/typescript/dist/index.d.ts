import { AuthenticateReq, Configuration, HealthRes, NewSessionReq, Tokens } from './generated';
import { Session } from './src/session';
import { AxiosRequestConfig } from 'axios';
export declare class Kntrl {
    readonly serverUrl: string;
    readonly lang?: string | undefined;
    constructor(serverUrl?: string, lang?: string | undefined);
    newSession(req: Omit<NewSessionReq, keyof AuthenticateReq>): Session;
    session(accessTokenOrTokens?: string | Tokens): Session;
    serverHealth(key?: string): Promise<HealthRes>;
    _axiosCfg(): AxiosRequestConfig;
    _serverCfg(): Configuration;
}
export * from './generated';
export { Session as SessionModel } from './generated';
export { Session } from './src/session';
