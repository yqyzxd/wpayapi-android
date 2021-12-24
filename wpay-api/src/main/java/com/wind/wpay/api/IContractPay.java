package com.wind.wpay.api;

import java.util.Map;

/**
 * created by wind on 6/16/21:3:23 PM
 * 支付宝/微信 签约
 *
 *  * 支付签约 唤起签约方式说明 https://opensupport.alipay.com/support/helpcenter/120/201602498880?ant_source=zsearch#anchor__7
 *  *      一、先签约，后代扣
 *  *              拼接alipays短链接
 *  *      二、支付后签约
 *  *          支付后签约使用sdkExecute方法，直接返回请求字符串。走正常支付流程
 */
public interface IContractPay {

    /**
     * 创建签约信息
     * @param params
     */
    void requestContract(Map<String,String> params,ContractCallback callback);

    /**
     * 打开对应的签约页面
     * @param params
     */
    void openContractPage(Map<String,String> params);
}
