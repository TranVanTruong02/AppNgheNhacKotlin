package com.example.zing.Activity.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.zing.Fragment.BaiDang.View.FragmentBaiDangMain
import com.example.zing.Fragment.PhimNgan.View.FragmentPhimNganMain
import com.example.zing.Fragment.TrangCaNhan.View.FragmentTrangCaNhanMain
import com.example.zing.Fragment.XuHuong.View.FragmentXuHuongViewMain
import com.example.zing.R
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView

class ActivityTrangChinh : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var collapsingToolbarLayout: CollapsingToolbarLayout
    private lateinit var toolbar: Toolbar
    private lateinit var frameLayout: FrameLayout
    private lateinit var fragmentManager: FragmentManager
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var floatingActionButton: FloatingActionButton
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trangchinh)

        TrangChinh_AnhXa()
        ToolBar_Tab()
        BottomNavigationView_Tab()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_share -> {
                Toast.makeText(this, "HIHI", Toast.LENGTH_SHORT).show()
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return false
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.trangchinh_framelayout, fragment)
            .commit()
    }

    private fun TrangChinh_AnhXa() {
        drawerLayout = findViewById(R.id.trangchinh_drawerlayout)
        collapsingToolbarLayout = findViewById(R.id.trangchinh_collapsingtoolbarlayout)
        toolbar = findViewById(R.id.trangchinh_toolbar)
        setSupportActionBar(toolbar)

        frameLayout = findViewById(R.id.trangchinh_framelayout)
        bottomNavigationView = findViewById(R.id.trangchinh_bottomnavigationview)
        bottomNavigationView.background = null
        floatingActionButton = findViewById(R.id.trangchinh_floatingactionbutton)
        navigationView = findViewById(R.id.trangchinh_navigationview)
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun ToolBar_Tab() {
        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_open
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    private fun BottomNavigationView_Tab() {
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottomsheet_trangchinh_trending -> {
                    openFragment(FragmentXuHuongViewMain())
                    return@setOnItemSelectedListener true
                }
                R.id.bottomsheet_trangchinh_movie -> {
                    openFragment(FragmentPhimNganMain())
                    return@setOnItemSelectedListener true
                }
                R.id.bottomsheet_trangchinh_post -> {
                    openFragment(FragmentBaiDangMain())
                    return@setOnItemSelectedListener true
                }
                R.id.bottomsheet_trangchinh_profile -> {
                    openFragment(FragmentTrangCaNhanMain())
                    return@setOnItemSelectedListener true
                }
            }
            false
        }

        fragmentManager = supportFragmentManager
        openFragment(FragmentXuHuongViewMain())

        floatingActionButton.setOnClickListener { view ->
            Toast.makeText(this, "Oki", Toast.LENGTH_SHORT).show()
        }
    }

    /*
        Lý thuyết:
        Thêm từ khóa private vào các biến giao diện là một cách thường được sử dụng để giữ các biến này riêng tư (private) và tránh
        truy cập trực tiếp từ bên ngoài lớp. Điều này giúp đảm bảo tính đóng gói và ẩn thông tin chi tiết về cài đặt giao diện của lớp.

        Camel case là một quy ước đặt tên biến, phương thức và lớp trong lập trình, trong đó các từ trong tên được viết liền nhau và từ
        đầu tiên của mỗi từ sau được viết hoa, trừ từ đầu tiên.

            Ví dụ:
            Tên biến: myVariable, firstName, totalAmount
            Tên phương thức: getUserInfo(), calculateTotal(), setFirstName()
            Tên lớp: MyClass, UserModel, PaymentService
     */
}