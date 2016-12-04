package mvptest.bawie.com.mytest.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mvptest.bawie.com.mytest.Bean.Bean;
import mvptest.bawie.com.mytest.R;

/**
 * Created by ZhangFanfan on 2016/12/4.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<Bean.MyDatas> list;
    private Context context;

    public MyAdapter(Context context, List<Bean.MyDatas> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.layout_item,null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    holder.view1.setText(list.get(position).name+"\n"+list.get(position).starttime);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView view;
        private TextView view1;

        public MyViewHolder(View itemView) {
            super(itemView);
            view = (ImageView) itemView.findViewById(R.id.image);
            view1 = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
