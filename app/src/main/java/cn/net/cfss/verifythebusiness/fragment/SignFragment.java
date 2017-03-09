package cn.net.cfss.verifythebusiness.fragment;

import android.view.View;

import cn.net.cfss.verifythebusiness.R;

/**
 * 描述：拍视频
 * 作者：欧永华
 * 时间: 2017/3/9.
 */

public class SignFragment extends BaseFragment {

    private static SignFragment signFragment;

    public static SignFragment newInstance(){
        if (signFragment ==null){
            signFragment = new SignFragment();
        }
        return signFragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_sign;
    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }
}
