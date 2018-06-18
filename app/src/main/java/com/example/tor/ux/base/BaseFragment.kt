package com.example.tor.ux.base

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tor.ux.exception.MvpNotSetLayoutException
import com.example.tor.ux.exception.MvpPresenterNotCreateException

abstract class BaseFragment<P : BaseContractor.Presenter<BaseContractor.View>> : Fragment(), BaseContractor.View {
    private lateinit var presenter: P


    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        presenter.attachView(this)
        if (savedInstanceState == null) {
        } else {
            onRestoreInstanceState(savedInstanceState)
        }
    }

    override
    fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val layResId: Int = getLayoutView()
        if (getLayoutView() == 0) {
            throw MvpNotSetLayoutException()
        }
        return inflater?.inflate(layResId, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView(view!!)
        setupInstance()
        setupView()
        getPresenter().onViewCreate()
        if (savedInstanceState == null) {
            initialize()
        } else {
            restoreView(savedInstanceState)
        }
    }

    override
    fun onStart() {
        super.onStart()
        getPresenter().onViewStart()
    }

    override
    fun onStop() {
        super.onStop()
        getPresenter().onViewStop()
    }

    override
    fun onDestroy() {
        super.onDestroy()
        getPresenter().onViewDestroy()
    }

    override
    fun getPresenter(): P {
        if (true) {
            return presenter
        }
        throw MvpPresenterNotCreateException()
    }


    fun onRestoreInstanceState(savedInstanceState: Bundle?) {}

    override
    fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    abstract fun createPresenter(): P

    abstract fun getLayoutView(): Int

    abstract fun bindView(view: View)

    abstract fun setupInstance()

    abstract fun setupView()

    abstract fun initialize()

    abstract fun restoreView(savedInstanceState: Bundle?)


}