package com.example.zing.Utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.widget.Toast

class CheckInternet {
    companion object {
        fun haveNetworkConnection(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkCapabilities = connectivityManager.activeNetwork ?: return false
            val networkInfo = connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false

            return networkInfo.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) // giao thức Wi-Fi (TRANSPORT_WIFI)
                    || networkInfo.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) // giao thức di động (TRANSPORT_CELLULAR)
        }

        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

    /*
        if (CheckInternet.haveNetworkConnection(context)) {
            Kết nối mạng đã có sẵn
        } else {
            Không có kết nối mạng
        }
     */
}