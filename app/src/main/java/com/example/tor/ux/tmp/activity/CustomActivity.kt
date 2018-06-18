package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BaseMvpActivity

class CustomActivity : BaseMvpActivity<CustomContractor.Presenter>(), CustomContractor.View {
    
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