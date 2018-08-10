package info.androidhive.android.cleanmvplearn.mvp.presenter;

import java.util.List;

import info.androidhive.android.cleanmvplearn.data.model.NoticeListModel;
import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;
import info.androidhive.android.cleanmvplearn.mvp.view.HomeView;

public class HomePresenterlmpl extends BasePresenter<HomeView> implements HomePresenter {
    public HomePresenterlmpl(HomeView mView) {
        super(mView);
    }

    @Override
    public void loadData() {
        NoticeListModel.getInstance().loadData(this);
    }

    @Override
    public void displayData(List<NoticeList> list) {
        mView.displayDataList(list);
    }

    @Override
    public void displayError(String message) {
        mView.displayErrorMessage(message);
    }
}
