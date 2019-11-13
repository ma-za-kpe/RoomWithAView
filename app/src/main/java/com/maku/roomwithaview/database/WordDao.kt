package com.maku.roomwithaview.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/*
* A DAO (data access object) validates your SQL at compile-time and associates it with a method
* This DAO provides queries for:
Getting all words ordered alphabetically
Inserting a word
Deleting all words
* */

@Dao
// DAOs must either be interfaces or abstract classes.
interface WordDao{

    /* A method to get all the words and have it return a List of Words.*
    Use a return value of type LiveData in your method description,
    and Room generates all necessary code to update the LiveData when the database is updated.
    */
    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): LiveData<List<Word>>

    //The selected on conflict strategy ignores a new word if it's exactly the same as one already in the list.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()

}