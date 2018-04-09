package com.pengx.android.extensions.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.pengx.android.extension.ktx.io
import com.pengx.android.extension.ktx.mainThread
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Observable.just("123").delay(1000, TimeUnit.MILLISECONDS)
                .subscribeOn(io)
                .observeOn(mainThread).subscribe { s -> Log.d("BEN", s) }
    }
}
