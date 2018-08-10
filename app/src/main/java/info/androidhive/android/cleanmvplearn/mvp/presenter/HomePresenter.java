package info.androidhive.android.cleanmvplearn.mvp.presenter;

import java.util.List;

import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;

public interface HomePresenter{

    void loadData ();

    void displayData (List<NoticeList> list);

    void displayError (String message);
}
