package com.wind.wpay.api;

/**
 * created by wind on 6/16/21:3:29 PM
 */
public interface ContractCallback {
    /**
     * @param json 服务端返回的json数据
     */
    void onResponse(String json);

    void onError(int err,String msg);
}
