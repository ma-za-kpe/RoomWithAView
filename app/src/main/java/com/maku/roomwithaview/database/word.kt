package com.maku.roomwithaview.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
* This class will describe the Entity (which represents the SQLite table) for your words, Annotations identify how each part of this class relates to an entry in the database
* */
@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word")val word: String)