package com.example.ps21601.fpolylibary.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static Database instance;

    public static synchronized Database getInstance(Context context) {
        if(instance == null){
            instance = new Database(context);
        }
        return instance;
    }

    private Database(Context context){
        super(context,"MY_DATABASE",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlUser ="CREATE TABLE IF NOT EXISTS USERS(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " EMAIL TEXT, PASSWORD TEXT, ROLE INTEGER)";
        db.execSQL(sqlUser);

        String sqlPhieumuon ="CREATE TABLE IF NOT EXISTS PHIEUMUON(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " NGUOITAO TEXT, TENSACH TEXT, GIATHUE FLOAT, NGUOIMUON DATE,NGAYTHUE DATE)";
        db.execSQL(sqlPhieumuon);

        String sqlSACH ="CREATE TABLE IF NOT EXISTS SACH(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " TENSACH TEXT, NHAXUATBAN TEXT, LOAISACH TEXT, GIATHUE FLOAT)";
        db.execSQL(sqlSACH);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }
}
