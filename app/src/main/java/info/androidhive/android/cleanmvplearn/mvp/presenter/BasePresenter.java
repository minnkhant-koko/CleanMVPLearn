package info.androidhive.android.cleanmvplearn.mvp.presenter;

import info.androidhive.android.cleanmvplearn.mvp.view.BaseView;

public abstract class BasePresenter<V extends BaseView> {
    protected V mView;

    public BasePresenter(V mView) {
        this.mView = mView;
    }
}
