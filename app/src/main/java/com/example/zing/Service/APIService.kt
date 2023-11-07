package com.example.zing.Service

// Kết hợp 2 function APIRetrofitcline và DataService
class APIService {
    companion object {
        // Khi một biến được khai báo là const, giá trị của nó được xác định tại thời điểm biên dịch và không thể thay đổi sau đó.
        private const val base_url = "https://appnghenhac2023.000webhostapp.com/Server_Zing/"

        fun getService(): DataService {
            return APIRetrofitClient.getClient(base_url).create(DataService::class.java)
        }
    }
}
