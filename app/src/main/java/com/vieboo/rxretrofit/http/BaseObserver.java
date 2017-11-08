package com.vieboo.rxretrofit.http;

import android.content.Context;

import com.vieboo.rxretrofit.model.BaseModel;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by Administrator on 2017/11/8.
 */

public abstract class BaseObserver<T> implements Observer<BaseModel<T>> {

    private Context mContext;

    public BaseObserver(Context mContext) {
        this.mContext = mContext;
    }

    protected abstract void onSuccess(T t);
    protected abstract void onFail(String msg);


    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull BaseModel<T> tBaseModel) {
        if(null != tBaseModel){
            if(0 == tBaseModel.getStatus()) {
                onSuccess(tBaseModel.getContent());
            }else {
                onFail("");
            }
        }
    }

    @Override
    public void onError(@NonNull Throwable e) {
        onFail("");
    }

    @Override
    public void onComplete() {

    }
}
