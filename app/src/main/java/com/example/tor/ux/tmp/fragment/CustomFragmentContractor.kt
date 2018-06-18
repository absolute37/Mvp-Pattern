package com.example.tor.ux.tmp.fragment

import com.example.tor.ux.base.BaseContractor

class CustomFragmentContractor{

    interface View : BaseContractor.View
    interface Presenter : BaseContractor.Presenter<CustomFragmentContractor.View>

}