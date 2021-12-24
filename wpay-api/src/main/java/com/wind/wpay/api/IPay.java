package com.wind.wpay.api;

import android.app.Activity;

/**
 * Created by wind on 2018/11/19.
 */

public interface IPay {


    /**
     *
     * @param context  activity对象
     * @param argsJson 支付参数
     */
    void pay(Activity context,  String argsJson);



}
