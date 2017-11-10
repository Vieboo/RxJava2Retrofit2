package com.vieboo.rxretrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.vieboo.rxretrofit.http.BaseObserver;
import com.vieboo.rxretrofit.http.RetrofitFactory;
import com.vieboo.rxretrofit.http.RxScheduler;
import com.vieboo.rxretrofit.model.BaseModel;
import com.vieboo.rxretrofit.model.Translation;
import com.vieboo.rxretrofit.model.Translation2;
import com.vieboo.rxretrofit.model.Upload2;
import com.vieboo.rxretrofit.model.Zhuangbi;
import com.vieboo.rxretrofit.net.Api;
import com.vieboo.rxretrofit.net.NetConfigs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
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

//        request();
        request2();


//        getTranslation();



        /**
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


         **/

        Log.e(TAG, "-----------onCreate: ");


        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TestActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "-----------onStart: " );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "-----------onResume: " );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "-----------onPause: " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "-----------onStop: " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "-----------onRestart: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "-----------onDestroy: " );
    }


    private void request() {
        RetrofitFactory.getTSInstance().getTranslation("fy", "en", "zh", "good")
                .compose(RxScheduler.<BaseModel<Translation>>compose())
                .subscribe(new BaseObserver<Translation>(MainActivity.this) {
                    @Override
                    protected void onSuccess(Translation translation) {
                        String str = "";
                        for(String s : translation.getWordMean()) {
                            str += s + "\n";
                        }
                        Log.e(TAG, "onSuccess: -->" + str);
                    }

                    @Override
                    protected void onFail(String msg) {

                    }
                });
    }


    private void request2() {
        RetrofitFactory.getTSInstance().regist("fy", "en", "zh", "register")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Consumer<BaseModel<Translation>>() {
                    @Override
                    public void accept(BaseModel<Translation> translationBaseModel) throws Exception {
                        Log.e(TAG, "accept: -1111->" + Thread.currentThread().getName());
                        String str = "";
                        for(String s : translationBaseModel.getContent().getWordMean()) {
                            str += s + "\n";
                        }
                        Log.e(TAG, "onSuccess: 第1次网络请求成功-->" + str);
                    }
                })
                .observeOn(Schedulers.io())
                .flatMap(new Function<BaseModel<Translation>, ObservableSource<BaseModel<Translation2>>>() {
                    @Override
                    public ObservableSource<BaseModel<Translation2>> apply(@NonNull BaseModel<Translation> translationBaseModel) throws Exception {
                        Log.e(TAG, "accept: -2222->" + Thread.currentThread().getName());
                        return RetrofitFactory.getTSInstance().login("fy", "en", "zh", "login");
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<Translation2>(MainActivity.this) {
                    @Override
                    protected void onSuccess(Translation2 translation2) {
                        Log.e(TAG, "accept: -3333->" + Thread.currentThread().getName());
                        String str = "";
                        for(String s : translation2.getWordMean()) {
                            str += s + "\n";
                        }
                        Log.e(TAG, "onSuccess: 第2次网络请求成功-->" + str);
                    }

                    @Override
                    protected void onFail(String msg) {
                        Log.e(TAG, "onFail: " + msg);
                    }
                });
    }



    private void getTranslation() {
        Observable.intervalRange(0, 5, 5, 2, TimeUnit.SECONDS)
                .doOnNext(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        Log.e(TAG, "accept: ----------->1 " + Thread.currentThread().getName());
                        RetrofitFactory.getTSInstance().getTranslation("fy", "en", "zh", "good")
                                .compose(RxScheduler.<BaseModel<Translation>>compose())
                                .subscribe(new BaseObserver<Translation>(MainActivity.this) {
                                    @Override
                                    protected void onSuccess(Translation translation) {
                                        String str = "";
                                        for(String s : translation.getWordMean()) {
                                            str += s + "\n";
                                        }
//                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                                        Log.e(TAG, "onSuccess: -->" + str);
                                    }

                                    @Override
                                    protected void onFail(String msg) {
                                        Toast.makeText(MainActivity.this, "onFail", Toast.LENGTH_SHORT).show();
                                    }
                                });
                    }
                })
        .subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.e(TAG, "onSubscribe: ----------->2");
            }

            @Override
            public void onNext(@NonNull Long aLong) {
                Log.e(TAG, "onNext: ----------->2 " + Thread.currentThread().getName());
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e(TAG, "onError: ----------->2");

            }

            @Override
            public void onComplete() {
                Log.e(TAG, "onComplete: ----------->2");
            }
        });
    }

}
