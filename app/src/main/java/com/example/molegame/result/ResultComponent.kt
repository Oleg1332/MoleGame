package com.example.molegame.result

import com.example.molegame.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface ResultComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): ResultComponent
    }

    fun inject(activity: ResultActivity)
}