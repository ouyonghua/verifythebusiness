package cn.net.cfss.verifythebusiness.fragment;

import android.view.View;

import cn.net.cfss.verifythebusiness.R;

/**
 * 描述：拍证件
 * 作者：欧永华
 * 时间: 2017/3/9.
 */

public class CertificateFragment extends BaseFragment {

    private static CertificateFragment certificateFragment;

    public static CertificateFragment newInstance(){
        if (certificateFragment ==null){
            certificateFragment = new CertificateFragment();
        }
        return certificateFragment;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_certificate;
    }

    @Override
    public void initView(View rootView) {

    }

    @Override
    public void initData() {

    }
}
