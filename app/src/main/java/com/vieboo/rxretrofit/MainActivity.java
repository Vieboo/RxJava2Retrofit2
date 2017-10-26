package com.vieboo.rxretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.vieboo.rxretrofit.model.Upload2;
import com.vieboo.rxretrofit.model.Zhuangbi;
import com.vieboo.rxretrofit.net.Api;
import com.vieboo.rxretrofit.net.NetConfigs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String TAG = "RxJava&Retrofit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(NetConfigs.BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

//        Call<ResponseBody> call = api.search("2");
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    Log.e(TAG, "onResponse: " + response.body().string());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });


        api.search("2")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Zhuangbi<Upload2>>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                        Log.e(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(@NonNull List<Zhuangbi<Upload2>> zhuangbis) {
                        Log.e(TAG, "onResponse: " + zhuangbis.size());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e(TAG, "onError: " + e.toString());
                    }

                    @Override
                    public void onComplete() {

                        Log.e(TAG, "onComplete: ");
                    }
                });
//                .subscribe(new Consumer<List<Zhuangbi<Upload2>>>() {
//                    @Override
//                    public void accept(List<Zhuangbi<Upload2>> bookLists) throws Exception {
//
//                        Toast.makeText(MainActivity.this, "--Success--", Toast.LENGTH_SHORT).show();
//                        Log.e(TAG, "onResponse: " + bookLists.size());
//                        for (Zhuangbi zhuangbi : bookLists) {
//                            Log.e(TAG, "zhuangbi: " + zhuangbi.getDescription());
//                        }
//                    }
//
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(Throwable throwable) throws Exception {
//                        Toast.makeText(MainActivity.this, "--Fail--", Toast.LENGTH_SHORT).show();
//                        throwable.printStackTrace();
//                    }
//                });

    }
}
