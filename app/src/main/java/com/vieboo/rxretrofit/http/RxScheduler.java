package com.vieboo.rxretrofit.http;

import android.widget.Toast;

import com.vieboo.rxretrofit.App;
import com.vieboo.rxretrofit.http.utils.NetUtil;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 线程调度
 * Created by Administrator on 2017/11/8.
 */

public class RxScheduler {

    public static <T>ObservableTransformer<T, T> compose() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(@NonNull Observable<T> upstream) {
                return upstream.subscribeOn(Schedulers.io())
                        .doOnSubscribe(new Consumer<Disposable>() {
                            @Override
                            public void accept(Disposable disposable) throws Exception {
                                if(!NetUtil.isNetworkAvailable(App.getInstance())) {
                                    Toast.makeText(App.getInstance(), "请检查网络", Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
