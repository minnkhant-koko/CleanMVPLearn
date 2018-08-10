package info.androidhive.android.cleanmvplearn.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.android.cleanmvplearn.viewholders.BaseViewHolder;

public abstract class BaseRecyclerAdapter<V extends BaseViewHolder, O> extends RecyclerView.Adapter<V> {

    protected List<O> mDataList;
    protected LayoutInflater mInflater;

    public BaseRecyclerAdapter(Context context) {

        mDataList = new ArrayList<>();
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(@NonNull V holder, int position) {
        holder.setData(mDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void setNewList(List<O> newList){
        mDataList = newList;
        notifyDataSetChanged();
    }
}
