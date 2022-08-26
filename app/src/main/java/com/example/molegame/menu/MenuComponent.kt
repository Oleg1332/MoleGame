package com.example.molegame.menu

import com.example.molegame.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface MenuComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MenuComponent
    }

    fun inject(activity: MenuActivity)
}