package info.androidhive.android.cleanmvplearn.data.model;

import info.androidhive.android.cleanmvplearn.data.vos.NetworkResponse;
import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;
import info.androidhive.android.cleanmvplearn.mvp.presenter.HomePresenter;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class NoticeListModel extends BaseModel {
    private static NoticeListModel INSTANCE;

    public static NoticeListModel getInstance(){
        if (INSTANCE == null){
            INSTANCE = new NoticeListModel();
        }
        return INSTANCE;
    }

    public void loadData (final HomePresenter homePresenter){
        mNetworkApi.fetchDataFromNetwork()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NetworkResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NetworkResponse networkResponse) {
                        if (networkResponse != null){
                            homePresenter.displayData(networkResponse.getNoticeList());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        homePresenter.displayError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
