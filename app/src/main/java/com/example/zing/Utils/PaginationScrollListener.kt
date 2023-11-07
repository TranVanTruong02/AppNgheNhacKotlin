package com.example.zing.Utils

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

abstract class PaginationScrollListener(private val linearLayoutManager: LinearLayoutManager) :
    RecyclerView.OnScrollListener() {

    private var isLoading = false
    private var isLastPage = false

    // Sử lí phân trang
    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        val visibleItemCount = linearLayoutManager.childCount // Đến các item có thể nhìn thấy trên màn hình
        val totalItemCount = linearLayoutManager.itemCount // Tổng số bản ghi trong 1 trang
        val firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition() // Item đầu tiên

        // Khi thỏa mãn điều kiện thì tiếp tục load more
        // Boolean mặc định là true
        if (!isLoading && !isLastPage && (visibleItemCount + firstVisibleItemPosition) >= totalItemCount && firstVisibleItemPosition >= 0) {
            loadMoreItems();
        }
    }

    abstract fun loadMoreItems() // Gọi khi load tiếp dữ liệu
    abstract fun isLoading(): Boolean // Để xem đang được load hay load xong rồi
    abstract fun isLastPage(): Boolean // Để xem đến trang cuối thì không sử lí phân trang nữa
}