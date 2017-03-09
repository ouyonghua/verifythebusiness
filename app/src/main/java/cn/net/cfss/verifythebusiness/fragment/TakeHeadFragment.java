package cn.net.cfss.verifythebusiness.fragment;

import android.view.View;

import cn.net.cfss.verifythebusiness.R;

/**
 * 描述：
 * 作者：欧永华
 * 时间: 2017/3/9.
 */

public class TakeHeadFragment extends BaseFragment {

    private static TakeHeadFragment headFragment;

    public static TakeHeadFragment newInstance(){
        if (headFragment==null){
            headFragment = new TakeHeadFragment();
        }
        return headFragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_head;
    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }
}
