package com.example.molegame.storage

interface Storage {
    fun setInt(key: String, value: Int)
    fun getInt(key: String): Int
}
