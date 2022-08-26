package com.example.molegame.di

import com.example.molegame.game.GameComponent
import com.example.molegame.menu.MenuComponent
import com.example.molegame.result.ResultComponent
import dagger.Module

@Module(subcomponents = [MenuComponent::class, ResultComponent::class, GameComponent::class])
class AppSubcomponents {
}