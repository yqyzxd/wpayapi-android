package com.wind.wpay.api.event;

/**
 * Created By wind
 * on 2019-11-08
 */
public class PayResultEvent {
    private PayResult result;
    public PayResultEvent( PayResult result){
        this.result=result;
    }

    public PayResult getResult() {
        return result;
    }

    public static class PayResult{
        private boolean success;
        private int code;
        private String msg;

        public PayResult(boolean success) {
            this.success = success;
        }

        public PayResult(boolean success, int code, String msg) {
            this.success = success;
            this.code = code;
            this.msg = msg;
        }

        public boolean isSuccess() {
            return success;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
