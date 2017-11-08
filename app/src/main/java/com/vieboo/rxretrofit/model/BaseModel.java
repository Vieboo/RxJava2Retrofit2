package com.vieboo.rxretrofit.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Administrator on 2017/11/8.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseModel<T> {

    @JsonProperty("status")
    private int status;
    @JsonProperty("content")
    private T content;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
