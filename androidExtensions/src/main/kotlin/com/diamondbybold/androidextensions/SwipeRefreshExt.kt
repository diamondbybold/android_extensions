package com.diamondbybold.androidextensions

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

fun SwipeRefreshLayout.stopRefreshing() {
    if (isRefreshing) {
        isRefreshing = false
    }
}