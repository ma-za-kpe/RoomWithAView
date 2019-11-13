package com.maku.roomwithaview.repository

import androidx.lifecycle.LiveData
import com.maku.roomwithaview.database.Word
import com.maku.roomwithaview.database.WordDao

/*
* A Repository class abstracts access to multiple data sources.
* it is a suggested best practice for code separation and architecture.
* It also provides a clean API for data access to the rest of the application.
* it manages queries and allows you to use multiple backends
*
* In the most common example, the Repository implements the logic for deciding
* whether to fetch data from a network or use results cached in a local database.
* */

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class WordRepository (private val wordDao: WordDao) {
    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    //The suspend modifier tells the compiler that this needs to be called from a coroutine or another suspending function.
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}