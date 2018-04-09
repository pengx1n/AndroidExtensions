package com.pengx.android.extension.ktx

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author PengXin
 */
val io get() = Schedulers.io()

val mainThread get() = AndroidSchedulers.mainThread()
