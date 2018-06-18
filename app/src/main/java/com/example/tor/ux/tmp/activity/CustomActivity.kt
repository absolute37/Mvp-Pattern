package com.example.tor.ux.tmp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.tor.ux.R
import com.example.tor.ux.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

//TODO CustomContractor.Presenter<ADD SOMETHING HERE>()
class CustomActivity : BaseActivity<CustomContractor.Presenter<>>(), CustomContractor.View {
    override fun createPresenter(): CustomContractor.Presenter {
        return CustomActivityPresenter.create()
    }

    override fun getLayoutView(): Int {
        return 0

    }

    override fun bindView() {


    }

    override fun setupInstance() {

    }

    override fun setupView() {

    }

    override fun initialize() {

    }


}
