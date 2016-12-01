package com.superxingyun.asynctasktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();//获取实例,调用execute()方法启动task
    }
}
