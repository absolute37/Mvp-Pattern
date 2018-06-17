package com.example.tor.ux

import com.example.tor.ux.base.BaseMvpActivity

abstract class MainMvpActivity : BaseMvpActivity<MainContractor.Presenter<MainContractor.View>>(), MainContractor.View {

    override
    fun getName() {
        getPresenter().setData()

    }


}

