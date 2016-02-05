package com.github.kittinunf.reactiveandroid.support.v7.widget

import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import com.github.kittinunf.reactiveandroid.subscription.AndroidMainThreadSubscription
import rx.Observable

//================================================================================
// Events
//================================================================================

fun Toolbar.rx_navigationClick(): Observable<View> {
    return Observable.create { subscriber ->
        setNavigationOnClickListener {
            subscriber.onNext(it)

        }

        subscriber.add(AndroidMainThreadSubscription {
            setNavigationOnClickListener(null)
        })
    }
}

fun Toolbar.rx_menuItemClick(consumed: Boolean): Observable<MenuItem> {
    return Observable.create { subscriber ->
        setOnMenuItemClickListener {
            subscriber.onNext(it)
            consumed
        }

        subscriber.add(AndroidMainThreadSubscription {
            setOnMenuItemClickListener(null)
        })
    }
}
