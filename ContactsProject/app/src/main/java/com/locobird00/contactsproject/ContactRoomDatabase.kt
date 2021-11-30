package com.locobird00.contactsproject

import android.content.Context
import android.os.strictmode.InstanceCountViolation
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.locobird00.contactsproject.Contact
import com.locobird00.contactsproject.ContactDao

@Database(entities = [(Contact::class)], version = 1)
abstract class ContactRoomDatabase: RoomDatabase() {

    abstract fun contactDao(): ContactDao

    companion object {

        private var INSTANCE: ContactRoomDatabase? = null

        internal fun getDatabase(context: Context): ContactRoomDatabase? {
            if (INSTANCE == null) {
                synchronized(ContactRoomDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE =
                            Room.databaseBuilder<ContactRoomDatabase>(
                                context.applicationContext,
                                ContactRoomDatabase::class.java,
                                "contact_database").build()
                    }
                }
            }
            return INSTANCE
        }
    }
}