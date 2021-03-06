package com.messiaslima.promogamer.feature.latestdeals.products.di

import com.messiaslima.promogamer.feature.latestdeals.products.LatestDealsProductsNavigatorImpl
import com.messiaslima.promogamer.feature.latestdeals.products.contract.LatestDealsProductsNavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface LatestDealsProductsModule {
    @Binds
    fun bindLatestDealsProductsNavigator(implementation: LatestDealsProductsNavigatorImpl): LatestDealsProductsNavigator
}
