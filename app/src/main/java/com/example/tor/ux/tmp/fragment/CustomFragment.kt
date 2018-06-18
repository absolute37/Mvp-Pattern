package com.example.tor.ux.tmp.fragment

import android.os.Bundle
import android.view.View
import com.example.tor.ux.base.BaseMvpFragment

class CustomFragment : BaseMvpFragment<CustomFragmentContractor.Presenter>,CustomFragmentContractor.View {

    fun CustomFragment(): CustomFragment {
        super()
    }

    fun newInstance(): CustomFragment {
        val fragment = CustomFragment()
        val args = Bundle()
        fragment.arguments = args
        return fragment
    }
    override fun createPresenter(): CustomFragmentContractor.Presenter {
        return CustomFragmentPresenter.create()

    }

    override fun getLayoutView(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindView(view: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setupInstance() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setupView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initialize() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun restoreView(savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}