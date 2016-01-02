package com.jpush.zx.push;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashSet;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        //设置别名指定向某个手机发送
        JPushInterface.setAlias(this, "zx", new TagAliasCallback() {
            @Override
            public void gotResult(int i, String s, Set<String> set) {

            }
        });
        //设置标签发送给某些手机
        Set<String> tagList = new HashSet<>();
        tagList.add("treebear");
        tagList.add("witown");
        tagList.add("tt");
        JPushInterface.setTags(this, tagList, new TagAliasCallback() {
            @Override
            public void gotResult(int i, String s, Set<String> set) {

            }
        });

    }
}
