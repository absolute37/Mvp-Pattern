package com.example.tor.ux

import com.example.tor.ux.base.BaseActivity

abstract class MainActivity : MainContractor.View, BaseActivity<MainContractor.Presenter>() {

    override
    fun getName() {
        getPresenter().setData()

    }


}

