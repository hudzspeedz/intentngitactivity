package com.coventery.jack.activityopen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ProgressBar;
import android.os.Handler;

import java.util.logging.LogRecord;

public class ProgressBarActivity extends AppCompatActivity {

    private ProgressBar mProgress;
    private int mProgressstatus = 0;
    private static int mProgressStatic;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mProgress = (ProgressBar) findViewById(R.id.progressBar);
        new Thread(new Runnable() {
            public void run(){
                while (mProgressstatus < 100){
                    mProgressstatus = doSomeWork();
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress(mProgressstatus);
                        }
                    });
                }
            }
            private int doSomeWork(){
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                return ++mProgressStatic;
            }
        }).start();



    }

}
