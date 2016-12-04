package mvptest.bawie.com.mytest.modle;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import mvptest.bawie.com.mytest.present.MyPresent;

/**
 * Created by ZhangFanfan on 2016/12/4.
 */

public class MyModle {

    public void requestHttp() {
      //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
//创建一个Request
        final Request request = new Request.Builder()
                .url("http://api.jisuapi.com/tv/query?appkey=6942124f925e12cc&tvid=435&date=2015-08-09")
                .build();
//new call
        Call call = mOkHttpClient.newCall(request);
//请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String str = response.body().string();
            modle.sendString(str);
//                Log.e("myDatas++++++++++++++",str+"");
            }
        });

    }

    private ModleInterface modle;
    public void setModle(MyPresent modle) {
        this.modle = modle;
    }
}
