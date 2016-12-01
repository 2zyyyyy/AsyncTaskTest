package com.superxingyun.asynctasktest;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by 月满轩尼诗 on 2016/11/14.
 */

public class MyAsyncTask extends AsyncTask<Void, Void, Void> {
    @Override
    protected Void doInBackground(Void... voids) {
        Log.d("Info", "doInBackground");
        publishProgress();
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("Info", "onPreExecute");
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d("Info", "onPostExecute");
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
        Log.d("Info", "onProgressUpdate");
    }
}
