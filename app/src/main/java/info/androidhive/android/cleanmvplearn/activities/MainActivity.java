package info.androidhive.android.cleanmvplearn.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import info.androidhive.android.cleanmvplearn.R;
import info.androidhive.android.cleanmvplearn.adapters.NoticeListAdapter;
import info.androidhive.android.cleanmvplearn.data.vos.NoticeList;
import info.androidhive.android.cleanmvplearn.delegate.HomeDelegate;
import info.androidhive.android.cleanmvplearn.mvp.presenter.HomePresenter;
import info.androidhive.android.cleanmvplearn.mvp.presenter.HomePresenterlmpl;
import info.androidhive.android.cleanmvplearn.mvp.view.HomeView;

public class MainActivity extends AppCompatActivity implements HomeView, HomeDelegate{
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    NoticeListAdapter mAdapter;
    HomePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mAdapter = new NoticeListAdapter(getApplicationContext(), this);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mPresenter = new HomePresenterlmpl(this);
        mPresenter.loadData();
    }

    @Override
    public void onTapFilePath(String filePath) {

    }

    @Override
    public void displayDataList(List<NoticeList> list) {

    }

    @Override
    public void displayErrorMessage(String message) {

    }
}
