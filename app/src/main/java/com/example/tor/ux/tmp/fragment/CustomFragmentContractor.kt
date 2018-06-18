package com.example.tor.ux.tmp.fragment

import com.example.tor.ux.base.BaseMvpContractor

class CustomFragmentContractor{

    interface View : BaseMvpContractor.View
    interface Presenter : BaseMvpContractor.Presenter<CustomFragmentContractor.View>

}