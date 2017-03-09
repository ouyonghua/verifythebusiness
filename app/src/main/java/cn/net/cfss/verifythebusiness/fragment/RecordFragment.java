package cn.net.cfss.verifythebusiness.fragment;

import android.view.View;

import cn.net.cfss.verifythebusiness.R;

/**
 * 描述：拍视频
 * 作者：欧永华
 * 时间: 2017/3/9.
 */

public class RecordFragment extends BaseFragment {

    private static RecordFragment recordFragment;

    public static RecordFragment newInstance(){
        if (recordFragment ==null){
            recordFragment = new RecordFragment();
        }
        return recordFragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_record;
    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }
}
