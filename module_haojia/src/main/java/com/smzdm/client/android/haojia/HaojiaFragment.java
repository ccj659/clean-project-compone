package com.smzdm.client.android.haojia;

import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ccj.base.utils.router.RouterConstants;

/**
 * Created by chenchangjun on 18/1/25.
 */
@Route(path = RouterConstants.HAOJIA_MUDULE_FRAGMENT_HOME_HAOJIA)
public class HaojiaFragment extends Fragment {


    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.haojia_fragment_haojia_home, null);
        }
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.button);

    }
}
