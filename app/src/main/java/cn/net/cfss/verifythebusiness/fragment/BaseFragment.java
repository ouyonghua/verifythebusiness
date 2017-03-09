package cn.net.cfss.verifythebusiness.fragment;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.net.cfss.verifythebusiness.R;
import yalantis.com.sidemenu.interfaces.ScreenShotable;

/**
 * 描述：
 * 作者：欧永华
 * 时间: 2017/3/9.
 */

public abstract class BaseFragment extends Fragment implements ScreenShotable {

    private View containerView;
    private Bitmap bitmap;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.containerView = view.findViewById(R.id.container);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutId(), container, false);
        initView(rootView);
        initData();
        return rootView;
    }

    /**
     * 设置布局视图
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 初始化控件，通过rootView来找
     *
     * @param rootView
     */
    public abstract void initView(View rootView);

    /**
     * 初始化数据
     */
    public abstract void initData();

    @Override
    public void takeScreenShot() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Bitmap bitmap = Bitmap.createBitmap(containerView.getWidth(),
                        containerView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                containerView.draw(canvas);
                BaseFragment.this.bitmap = bitmap;
            }
        };
        thread.start();
    }

    @Override
    public Bitmap getBitmap() {
        return bitmap;
    }
}
