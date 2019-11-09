package com.mtl.chinese.jchess.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.AppUtils;
import com.mtl.chinese.jchess.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 关于
 * 共有版本信息和源码地址两个选项，当前均指向源码地址
 */

public class AboutActivity extends AppCompatActivity {

    @BindView(R.id.version_name)
    TextView mVersionName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setupVersionInfo();
    }

    private void setupVersionInfo() {
        String versionName = AppUtils.getAppVersionName();
        mVersionName.setText(versionName);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.version_info_item,
            R.id.source_code_item})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.version_info_item:
                openWeb(getString(R.string.github_release_page));
                break;
            case R.id.source_code_item:
                openWeb(getString(R.string.github_project_page));
                break;
        }
    }
    void openWeb(String url){
        Intent intent= new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri content_url = Uri.parse(url);
        intent.setData(content_url);
        this.startActivity(intent);
    }
}

