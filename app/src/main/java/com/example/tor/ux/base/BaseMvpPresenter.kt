package com.example.tor.ux.base

import com.example.tor.ux.exception.MvpViewNotAttachedException
import java.lang.ref.WeakReference

abstract class BaseMvpPresenter<V : BaseMvpContractor.View> : BaseMvpContractor.Presenter<V> {

    lateinit var mMvpView: WeakReference<V>

    override fun attachView(mvpView: V) {
        mMvpView = WeakReference(mvpView)
    }

    override fun detachView() {
        mMvpView = null
    }

    @Throws(NullPointerException::class)
    override fun getView(): V {
        if (mMvpView != null) return mMvpView.get()!!
        throw MvpViewNotAttachedException()
    }

    override fun onViewCreate() {}


    override fun onViewStart() {}

    override fun onViewStop() {}

    override fun onViewDestroy() {}
}
}