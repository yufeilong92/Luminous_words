package com.example.myapplication

/**
 * @Author : YFL  is Creating a porject in MyApplication2
 * @Package com.example.myapplication
 * @Email : yufeilong92@163.com
 * @Time :2019/5/5 15:53
 * @Purpose :
 */
class TestPresenter : TestContont.TestPresenter() {
    var model: TestContont.TestModel? = null
    var view: TestContont.TestView? = null
    override fun initMvp(model: TestContont.TestModel, view: TestContont.TestView) {
        this.model = model
        this.view = view
    }

    override fun requestLogin() {
        model!!.requestLogin()
    }
}