package com.KtorApp.di

import com.KtorApp.repos.PropRepoImp
import com.KtorApp.repos.propertyrepo
import org.koin.dsl.module

val KoinModule = module {
single<propertyrepo> {
    PropRepoImp()
}
}

