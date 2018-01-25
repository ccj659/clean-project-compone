package com.smzdm.client.android.haojia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ccj.base.utils.router.RouterConstants;

@Route(path=RouterConstants.HAOJIA_MUDULE_ACTIVITY_HAOJIA_DETAIL)
public class HaojiaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haojia_detail);
    }
}
