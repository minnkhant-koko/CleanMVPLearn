package info.androidhive.android.cleanmvplearn.viewholders;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.OnClick;
import info.androidhive.android.cleanmvplearn.R;
import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;
import info.androidhive.android.cleanmvplearn.delegate.HomeDelegate;

public class DataViewHolder extends BaseViewHolder<NoticeList> {

    @BindView(R.id.tv_title)
    TextView noticeTitle;

    @BindView(R.id.tv_brief)
    TextView noticeBrief;

    @BindView(R.id.tv_path)
    TextView noticePath;

    private HomeDelegate delegate;

    NoticeList noticeList;
    public DataViewHolder(View itemView, HomeDelegate homeDelegate) {
        super(itemView);
        this.delegate = homeDelegate;
    }

    @Override
    public void setData(NoticeList data) {
        noticeList = data;
        noticeTitle.setText(data.getTitle());
        noticeBrief.setText(data.getBrief());
        noticePath.setText(data.getFileSource());
    }

    @OnClick(R.id.tv_path)
    void onClickFilePath() { delegate.onTapFilePath(noticeList.getFileSource());}
}
