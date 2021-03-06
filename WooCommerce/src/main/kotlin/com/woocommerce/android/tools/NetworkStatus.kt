package com.woocommerce.android.tools

import android.content.Context
import com.woocommerce.android.annotations.OpenClassOnDebug
import org.wordpress.android.util.NetworkUtils
import javax.inject.Singleton

@Singleton
@OpenClassOnDebug
class NetworkStatus(private var context: Context) {
    fun isConnected() = NetworkUtils.isNetworkAvailable(context)
}
