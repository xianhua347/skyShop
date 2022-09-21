package org.skyshop.Utils;

public class AcEncode<T> {
    private String msg;
    private String code;
    private T result;

    private AcEncode(String msg, String code, T result) {
        this.msg = msg;
        this.code = code;
        this.result = result;
    }

    public AcEncode getEncode(T result) {
        return new AcEncode("ok", "200", result);
    }

    public AcEncode getEncode(T result, String msg) {
        return new AcEncode(msg, "200", result);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
