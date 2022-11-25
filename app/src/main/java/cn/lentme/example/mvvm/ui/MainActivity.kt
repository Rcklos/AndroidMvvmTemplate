package cn.lentme.example.mvvm.ui

import cn.lentme.example.mvvm.databinding.ActivityMainBinding
import cn.lentme.example.mvvm.request.viewmodel.MainViewModel
import cn.lentme.mvvm.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity: BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun fetchBinding() = ActivityMainBinding.inflate(layoutInflater)
    override fun fetchViewModel(): MainViewModel = getViewModel()

    override fun initData() {
        mViewModel.hello.observe(this) { mBinding.hello.text = it }
    }
}