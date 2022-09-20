package org.skyshop.Utils;

public class AcEncode<T> {
    private String id;
    private String code;
    private T msg;

    private AcEncode(String id, String code, T msg) {
        this.id = id;
        this.code = code;
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
