package com.example.tor.ux.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.tor.ux.exception.MvpNotSetLayoutException
import com.example.tor.ux.exception.MvpPresenterNotCreateException

abstract class BaseActivity<P : BaseMvpContractor.Presenter<BaseMvpContractor.View>> : AppCompatActivity(), BaseMvpContractor.View {

    private var presenter: P? = null
    abstract val layoutView: Int

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        presenter = createPresenter()
        presenter!!.attachView(this)
        val layoutResId = layoutView
        if (layoutView == 0) throw MvpNotSetLayoutException()
        setContentView(layoutResId)
        bindView()
        setupInstance()
        setupView()
        getPresenter().onViewCreate()
        if (savedInstanceState == null) {
            initialize()
        }

    }

    override fun onStart() {
        super.onStart()
        getPresenter().onViewStart()
    }

    override fun onStop() {
        super.onStop()
        getPresenter().onViewStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        getPresenter().onViewDestroy()
    }

    override fun getPresenter(): P {
        if (presenter != null) {
            presenter
        }
        throw  MvpPresenterNotCreateException()

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            restoreView(savedInstanceState)
        }
    }

    open fun restoreView(savedInstanceState: Bundle) {}

    abstract fun createPresenter(): P

    abstract fun bindView()

    abstract fun setupInstance()

    abstract fun setupView()

    abstract fun initialize()


}