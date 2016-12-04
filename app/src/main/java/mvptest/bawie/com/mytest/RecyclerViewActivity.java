package mvptest.bawie.com.mytest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.List;

import mvptest.bawie.com.mytest.Bean.Bean;
import mvptest.bawie.com.mytest.present.MyPresent;
import mvptest.bawie.com.mytest.views.MyAdapter;
import mvptest.bawie.com.mytest.views.MyViews;

/**
 * Created by ZhangFanfan on 2016/12/4.
 */

public class RecyclerViewActivity extends Activity implements MyViews {


    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recycler);
        init();
        initViews();
    }

    private void initViews() {
        mRecyclerView = (RecyclerView)findViewById(R.id.AnimRFRecyclerView);
//设置布局管理器
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//设置Item增加、移除动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private void init() {
        MyPresent myPresent = new MyPresent();
        myPresent.setViews(this);
    }

    @Override
    public void myDatas(List<Bean.MyDatas> list) {
     Message msg = Message.obtain();
     msg.obj = list;
        handler.sendMessage(msg);
    }
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            List<Bean.MyDatas>list = (List<Bean.MyDatas>) msg.obj;
            // 设置适配器
            mRecyclerView.setAdapter(new MyAdapter(RecyclerViewActivity.this, list));
        }
    };

}
