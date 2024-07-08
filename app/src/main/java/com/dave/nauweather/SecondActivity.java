package com.dave.nauweather;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private Context mContext;
    private static final String TAG = "SecondActivity";
    TextView mSettingsVersion;
    TextView mSettingsBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_settings);
        mContext = this;
        mSettingsVersion = findViewById(R.id.settings_version);
        mSettingsBack = findViewById(R.id.settings_back);

        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            int versionCode = packageInfo.versionCode; // 版本号（整数）
            String versionName = packageInfo.versionName; // 版本名称（字符串）

            // 输出版本号和版本名称
            Log.d(TAG, "Version Code: " + versionCode);
            Log.d(TAG, "Version Name: " + versionName);
            mSettingsVersion.setText("版本号："+versionName);

        } catch (Exception e) {
            Log.e(TAG, "Failed to get package info", e);
        }


    }

    public void openBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
