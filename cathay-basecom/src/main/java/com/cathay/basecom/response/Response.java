package com.cathay.basecom.response;


import java.io.Serializable;

/**
 * Created by jamestang on 2018/9/1.
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1580822158577817099L;

    private T resContent;

    private String resCode;

    private String failCause;

    private boolean success = true;

    public Response() {

    }

    public Response(String failCause, String resCode) {
        this.resCode = resCode;
        this.failCause = failCause;
        success = false;
    }

    public Response(T t) {
        resContent = t;
    }

    public T getResContent() {
        return resContent;
    }

    public void setResContent(T resContent) {
        this.resContent = resContent;
    }

    public String getResCode() {
        return resCode;
    }

    public Response<T> setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }

    public String getFailCause() {
        return failCause;
    }

    public Response<T> setFailCause(String failCause) {
        this.failCause = failCause;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
