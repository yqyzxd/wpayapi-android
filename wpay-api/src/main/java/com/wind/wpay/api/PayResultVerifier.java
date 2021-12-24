package com.wind.wpay.api;

import java.util.Map;

/**
 * Created By wind
 * on 2019-12-10
 */
public interface PayResultVerifier {

    void onPayVerify(Map<String,String> params);
}
