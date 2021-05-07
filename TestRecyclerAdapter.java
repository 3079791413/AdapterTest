package com.example.goods;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.TestRecyclerViewHolder> {

    /**
     * 一般需要的参数可以通过构造传进来。例如context和数据源
     */

    public TestRecyclerAdapter(Context context, List list){

    }


    /**
     * 返回ViewHolder的实例
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public TestRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    /**
     * 通过holder.itemView.** 设置
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull TestRecyclerViewHolder holder, int position) {
        /**
         * 比如实现点击事件
         */
        if( myOnClickListener!=null ){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myOnClickListener.onClick(holder.itemView,position);
                }
            });
        }
    }


    /**
     * 返回数据源（list集合）长度
     * @return
     */
    @Override
    public int getItemCount() {
        return 0;
    }

    public class TestRecyclerViewHolder extends RecyclerView.ViewHolder{

        public TestRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    /**
     * 一般点击事件key通过接口回调来完成
     */
    public MyOnClickListener myOnClickListener;

    public void setMyOnClickListener(MyOnClickListener myOnClickListener) {
        this.myOnClickListener = myOnClickListener;
    }

    public interface MyOnClickListener{
        void onClick(View view,int position);
    }
}
