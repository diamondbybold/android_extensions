package com.diamondbybold.androidextensions

import android.content.Context

fun Context.isTablet() = resources.getBoolean(R.bool.isTablet)