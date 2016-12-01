package com.superxingyun.asynctasktest;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by 月满轩尼诗 on 2016/11/14.
 */

public class ImageTest extends Activity {
    private ImageView mImage;
    private ProgressBar mProgressBar;
    private static String URL = "http://img.mukewang.com/57a322f00001e4ae02560256-200-200.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        mImage = (ImageView) findViewById(R.id.image);
        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
    }

    class MyAsyncTask extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... strings) {
            String url = strings[0];
            return null;
        }
    }
}
