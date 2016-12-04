package mvptest.bawie.com.mytest.Bean;

import java.util.List;

/**
 * Created by ZhangFanfan on 2016/12/4.
 */

public class Bean {
    public MyResult result;
    public  class MyResult{
        public List<MyDatas>program;
    }
    public class MyDatas{
        public String name;
        public String starttime;
    }
}
