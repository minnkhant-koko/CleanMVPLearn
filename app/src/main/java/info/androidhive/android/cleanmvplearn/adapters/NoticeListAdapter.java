package info.androidhive.android.cleanmvplearn.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.android.cleanmvplearn.R;
import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;
import info.androidhive.android.cleanmvplearn.delegate.HomeDelegate;
import info.androidhive.android.cleanmvplearn.viewholders.DataViewHolder;

public class NoticeListAdapter extends BaseRecyclerAdapter<DataViewHolder, NoticeList> {
    private HomeDelegate homeDelegate;

    public NoticeListAdapter(Context context, HomeDelegate homeDelegate) {
        super(context);
        this.homeDelegate = homeDelegate;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.data_list_item, parent, false);
        return new DataViewHolder(view, homeDelegate);
    }
}
