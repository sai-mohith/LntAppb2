package com.example.lntappb2.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.lntappb2.database.FeedReaderContract.FeedEntry;


/**
 * thjis class will help me create/read/update/delete a row in the db table
 */
public class DbAccessObj {
    SQLiteDatabase database;
    DbHelper dbHelper;

    public DbAccessObj(Context context) {
        dbHelper = new DbHelper(context);
    }

    public void openDb(){
        database = dbHelper.getWritableDatabase();
    }
    private void closeDb(){}

    public void createRow(String title, String subtitle){
        ContentValues values = new ContentValues();
        values.put(FeedEntry.COLUMN_NAME_TITLE,title);
        values.put(FeedEntry.COLUMN_NAME_SUBTITLE,subtitle);
        database.insert(FeedEntry.TABLE_NAME,null,values);
    }
    private void readRow(){}
    private void updateRow(){}
    private void deleteRow(){}

}
