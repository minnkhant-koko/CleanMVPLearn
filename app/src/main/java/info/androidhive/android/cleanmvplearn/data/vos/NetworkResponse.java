
package info.androidhive.android.cleanmvplearn.data.vos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class NetworkResponse {

    @SerializedName("notice_list")
    private List<NoticeList> mNoticeList;

    public List<NoticeList> getNoticeList() {
        return mNoticeList;
    }

    public void setNoticeList(List<NoticeList> noticeList) {
        mNoticeList = noticeList;
    }

}
