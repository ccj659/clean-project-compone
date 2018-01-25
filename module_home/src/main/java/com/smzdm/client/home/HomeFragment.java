package com.smzdm.client.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ccj.base.Constants;
import com.ccj.base.base.BaseApplication;
import com.ccj.base.utils.router.RouterConstants;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by chenchangjun on 18/1/25.
 */
@Route(path = RouterConstants.HOME_MUDULE_FRAGMENT_HOME_HOME)
public class HomeFragment extends Fragment {


    @BindView(R2.id.button)
    TextView button;
    @BindView(R2.id.button2)
    Button button2;
    @BindView(R2.id.button3)
    Button button3;
    @BindView(R2.id.button4)
    Button button4;
    Unbinder unbinder;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.home_fragment_haojia_home, null);
        }
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R2.id.button2, R2.id.button3, R2.id.button4})
    public void onViewClicked(View view) {
        int i = view.getId();
        if (i == R.id.button2) {
            navigateToLogin();
        } else if (i == R.id.button3) {
            navigateHaojiaDetail();
        } else if (i == R.id.button4) {
            navigateTakePhoto();

        }
    }

    private void navigateHaojiaDetail() {
        ARouter.getInstance().build(RouterConstants.HAOJIA_MUDULE_ACTIVITY_HAOJIA_DETAIL).
                withString(Constants.START_LOGIN_WITH_PARAMS, "I am params from HomeFragment").
                navigation(getActivity(), Constants.REQUEST_START_LOGIN);

    }


    private void navigateToLogin() {
        ARouter.getInstance().build(RouterConstants.USER_MOUDLE_ACTIVITY).
                withString(Constants.START_LOGIN_WITH_PARAMS, "I am params from HomeFragment").
                navigation(getActivity(), Constants.REQUEST_START_LOGIN);
    }

    private void navigateTakePhoto() {
        ARouter.getInstance().
                build(RouterConstants.VIDEO_MUDULE_ACTIVITY).
                withString(Constants.START_LOGIN_WITH_PARAMS, "I am params from HomeFragment").
                navigation();

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.REQUEST_START_LOGIN) {

            if (data == null) {
                return;
            }
            String str = data.getStringExtra(Constants.PARAMS_RESULT_FROM_LOGIN);

            if (str == null) {
                return;
            }

            button.setText(str);
            BaseApplication.showToast(str);
        }

    }

}