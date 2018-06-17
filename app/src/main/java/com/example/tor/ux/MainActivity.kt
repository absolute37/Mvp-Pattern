package com.example.tor.ux

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tor.ux.base.BaseMvpActivity

class MainActivity : BaseMvpActivity<MainContractor.Presenter>(), MainContractor.View {
    override fun createPresenter(): MainContractor.Presenter {
        return MainPresenter.create()
    }


    override
    fun getLayoutView(): Int {
        return 0
    }

    override
    fun bindView() {

    }

    override
    fun setupInstance() {

    }

    override
    fun setupView() {
    }

    override
    fun initialize() {
    }


    override
    fun getName() {

    }


}
