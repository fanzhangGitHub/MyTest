package mvptest.bawie.com.mytest.present;

import com.google.gson.Gson;

import java.util.List;

import mvptest.bawie.com.mytest.Bean.Bean;
import mvptest.bawie.com.mytest.RecyclerViewActivity;
import mvptest.bawie.com.mytest.modle.ModleInterface;
import mvptest.bawie.com.mytest.modle.MyModle;
import mvptest.bawie.com.mytest.views.MyViews;

/**
 * Created by ZhangFanfan on 2016/12/4.
 */

public class MyPresent implements ModleInterface{

    private MyViews myViews;
    public void setViews(RecyclerViewActivity myViews) {
        this.myViews = myViews;
        MyModle modle = new MyModle();
        modle.setModle(this);
        modle.requestHttp();
    }

    @Override
    public void sendString(String json) {
        Bean bean = new Gson().fromJson(json,Bean.class);
        List<Bean.MyDatas> list = bean.result.program;
        myViews.myDatas(list);
    }
}
