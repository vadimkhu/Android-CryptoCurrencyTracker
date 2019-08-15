package com.example.cracker

import android.content.Context
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val apiService = RetrofitGetInterface.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val refresher = findViewById<SwipeRefreshLayout>(R.id.refresher)
        refresher.setOnRefreshListener {
            requestCurrency()
            Toast.makeText(this,"Data was updated", Toast.LENGTH_SHORT).show()
            refresher.isRefreshing = false
        }
*/
        recycler_view.layoutManager = LinearLayoutManager(this)
        requestCurrency()
    }

    private fun requestCurrency() {
        apiService.getCryptocurrency()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(
                {
                        result ->
                        recycler_view.adapter = RecyclerViewAdapter(result, resources)
                },
                {
                        error -> error.printStackTrace()
                }
            )
    }
}
