import { AxiosPromise } from 'axios';
import { Session } from './session';
export declare function handleErr<T>(action: AxiosPromise<T> | (() => AxiosPromise<T>), retryOnExpiredToken?: Session): Promise<T>;
export declare function merge(target: any, res: any): void;
