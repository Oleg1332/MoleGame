package com.example.molegame.game

import com.example.molegame.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface GameComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): GameComponent
    }

    fun inject(activity: GameActivity)
}