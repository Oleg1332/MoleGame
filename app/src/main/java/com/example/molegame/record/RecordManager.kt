package com.example.molegame.record

import com.example.molegame.storage.Storage
import javax.inject.Inject
import javax.inject.Singleton

const val RECORD_KEY = "RECORD"

@Singleton
class RecordManager @Inject constructor(private val storage: Storage) {
    var record: Int? = readRecord()
        private set

    private fun readRecord(): Int {
        return storage.getInt(RECORD_KEY)
    }

    fun updateRecord(newRecord: Int): Boolean {
        if (record != null) {
            if (newRecord <= record!!) {
                return false
            }
        }
        storage.setInt(RECORD_KEY, newRecord)
        record = newRecord

        return true
    }
}