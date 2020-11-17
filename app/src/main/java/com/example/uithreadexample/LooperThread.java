package com.example.uithreadexample;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class LooperThread extends Thread {
    private static final String TAG = LooperThread.class.getSimpleName();

    Handler handler;

    @Override
    public void run() {
        Looper.prepare();

        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Log.i(TAG,"Thread id : "+ Thread.currentThread().getId()+", Count : "+msg.obj);
            }
        };
        Looper.loop();
    }
}
