package com.vieboo.rxretrofit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/10/27.
 */

public class TestFragment extends Fragment {

    String TAG = "RxJava&Retrofit";

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onHiddenChanged: " + hidden);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onActivityResult: " );
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onAttachFragment: " );
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onAttach: " );
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onCreate: " );
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onCreateView: " );

        View view = new View(getActivity());
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(lp);
        view.setBackgroundColor(Color.YELLOW);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onViewCreated: " );
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onActivityCreated: " );
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onStart: " );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onResume: " );
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onSaveInstanceState: " );
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onPause: " );
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onStop: " );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onDestroyView: " );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onDestroy: " );
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "~~~~~~~~~~~~~~~~~~~~~~~~~~~onDetach: " );
    }
}
