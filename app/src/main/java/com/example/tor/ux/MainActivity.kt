package com.example.tor.ux

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.tor.ux.base.BaseActivity

abstract class MainActivity : MainContractor.View,BaseActivity<MainContractor.Presenter>() {
    override val layoutView: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun getName() {
        getPresenter().setData()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

