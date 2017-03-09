package cn.net.cfss.verifythebusiness.fragment;

import android.view.View;

import cn.net.cfss.verifythebusiness.R;

/**
 * 描述：拍视频
 * 作者：欧永华
 * 时间: 2017/3/9.
 */

public class VideoFragment extends BaseFragment {

    private static VideoFragment videoFragment;

    public static VideoFragment newInstance(){
        if (videoFragment ==null){
            videoFragment = new VideoFragment();
        }
        return videoFragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_video;
    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }
}
