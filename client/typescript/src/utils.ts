import { AxiosPromise } from 'axios';
import { Session } from './session';

export async function handleErr<T>(
    action: AxiosPromise<T> | (() => AxiosPromise<T>),
    retryOnExpiredToken?: Session,
): Promise<T> {
    try {
        if (typeof action === 'function') return (await action()).data
        return (await action).data
    } catch (error) {
        if (error.response?.data?.code == 'TOKEN_EXPIRED' && retryOnExpiredToken) {
            await retryOnExpiredToken.refreshAccessToken(undefined, true)
            return await handleErr(action)
        }
        throw error.response?.data || error;
    }
}

export function merge(target: any, res: any) {
    for (let key in res) target[key] = res[key];
}