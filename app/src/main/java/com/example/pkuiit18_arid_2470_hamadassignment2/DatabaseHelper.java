package com.example.pkuiit18_arid_2470_hamadassignment2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String database_name = "MyDatabase";
    private static final String table_name = "submit";
    private static final String table_col_name = "submit";
    private static final int db_version = 1;
    SQLiteDatabase sqLiteDatabase;

    public DatabaseHelper(Context context) {
        super(context, database_name, null, db_version);
        sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

//        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        db.execSQL("CREATE TABLE IF NOT EXISTS " + table_name + "( user_id INTEGER PRIMARY KEY AUTOINCREMENT,user_Name VARCHAR,user_Email VARCHAR,user_Pass VARCHAR,user_Gender VARCHAR,user_Subject VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + table_name);
        onCreate(db);
    }

    public long signup(String name,String email, String pass,String gender,String subject) {

        //  SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_Name", name);
        contentValues.put("user_Email", email);
        contentValues.put("user_Pass", pass);
        contentValues.put("user_Gender", gender);
        contentValues.put("user_Subject",subject);
        long user_data = sqLiteDatabase.insert(table_name, null, contentValues);
        return user_data;

    }

    public Boolean login(String email, String password) {

        // SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor user_data = sqLiteDatabase.rawQuery("SELECT * from " + table_name + " WHERE user_Email='" + email + "'" + "AND user_Pass ='" + password + "'", null);

        if (user_data.getCount()>0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}