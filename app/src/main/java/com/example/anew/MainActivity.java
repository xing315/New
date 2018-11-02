package com.example.anew;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {
    private final static String lancherActivityClassName = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        JPushInterface.setAlias(MainActivity.this,"J0096513",null);
        HashSet<String> has=new HashSet<String>();
        has.add("123");
       // JPushInterface.setTags(MainActivity.this,1,has);*/
        //添加一段注释测试一下
        String s="123456";
    }
}
