package com.example.tor.ux.tmp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.tor.ux.R
import kotlinx.android.synthetic.main.activity_main.*


class CustomActivity : AppCompatActivity(), CustomContractor.View {
    lateinit var getPresenter: CustomActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getPresenter.getData()


    }

    override fun showMessage(message: String) {

        text_change.text = message

    }

    override fun showTitle(title: String) {

    }

}
