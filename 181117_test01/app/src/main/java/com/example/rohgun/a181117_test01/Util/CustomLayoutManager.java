package com.example.rohgun.a181117_test01.Util;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

/**
 * Created by XPS on 2017-12-02.
 */
//Index Out Of Exception Error를 막기 위해 만든 커스텀 레이아웃 매니저
public class CustomLayoutManager extends LinearLayoutManager {

    public CustomLayoutManager(Context context) {
        super(context);
    }

    //아이템을 다 불러오기전까지 리사이클러의 로딩을 막는 역할?
    @Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            Log.e("Error : ", " In RecyclerView ViewHolder");
        }
    }


}
