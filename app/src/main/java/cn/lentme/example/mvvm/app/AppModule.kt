package cn.lentme.example.mvvm.app

import cn.lentme.example.mvvm.request.viewmodel.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by rcklos on 2022/5/15 03点02分
 */
val repositoryModel = module {
}

val viewModelModule = module {
    viewModel { MainViewModel() }
}

val appModule = listOf(viewModelModule, repositoryModel)