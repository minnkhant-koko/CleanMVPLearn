package info.androidhive.android.cleanmvplearn.mvp.view;

import java.util.List;

import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;

public interface HomeView extends BaseView {
    void displayDataList(List<NoticeList> list);

    void displayErrorMessage(String message);
}
