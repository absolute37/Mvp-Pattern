package com.example.tor.ux.base

import com.example.tor.ux.exception.MvpViewNotAttachedException
import java.lang.ref.WeakReference

abstract class BasePresenter<V : BaseContractor.View> : BaseContractor.Presenter<V> {


    var mView: WeakReference<V>? = null

    override fun attachView(mvpView: V) {
        mView = WeakReference(mvpView)
    }

    override fun detachView() {
        mView = null
    }

    @Throws(NullPointerException::class)
    override fun getView(): V {
        if (mView != null) return mView?.get()!!
        throw MvpViewNotAttachedException()
    }

    override fun onViewCreate() {}


    override fun onViewStart() {}

    override fun onViewStop() {}

    override fun onViewDestroy() {}
}
