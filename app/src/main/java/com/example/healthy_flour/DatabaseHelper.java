package com.example.healthy_flour;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public  static final String DATABASE_NAME ="Person.db";
    public static final String TABLE_NAME="flour_table";

    public static final String COL_1 ="Id";
    public static final String COL_2 ="USERNAME";
    public static final String COL_3 ="PASSWORD";
    public static final String COL_4="REPASSWORD";

    public DatabaseHelper(@Nullable Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME +"(ID INTEGER PRIMARY KEY AUTOINCREMENT ,Id TEXT,USERNAME TEXT, PASSWORD TEXT,REPASSWORD TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);

    }

    public  boolean insertDATA( String username, String id, String password, String repassword )
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,username);
        contentValues.put(COL_3,password);
        contentValues.put(COL_4,repassword);
        long result = db.insert(TABLE_NAME,null,contentValues);
        db.close();

        //to check whether data is entered or not
        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery(" Select *from "+TABLE_NAME,null);
        return res;

    }
}
