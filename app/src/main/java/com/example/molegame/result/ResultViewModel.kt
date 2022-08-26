package com.example.molegame.result

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.molegame.di.ActivityScope
import com.example.molegame.record.RecordManager
import javax.inject.Inject

@ActivityScope
class ResultViewModel @Inject constructor(private val recordManager: RecordManager): ViewModel() {
    private val record: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(
            loadRecord()
        )
    }

    private fun loadRecord() = recordManager.record

    fun getRecord(): LiveData<Int> {
        return record
    }

    fun updateRecord(newRecord: Int): Boolean {
        return recordManager.updateRecord(newRecord)
    }
}