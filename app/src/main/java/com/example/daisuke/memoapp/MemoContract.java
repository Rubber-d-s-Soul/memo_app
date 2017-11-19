package com.example.daisuke.memoapp;

import android.provider.BaseColumns;

/**
 * Created by daisuke on 2017/11/20.
 */

public final class MemoContract {
	//空のやつ
	public MemoContract(){}

	//フィールド定義
	public static abstract class Memos implements BaseColumns{
		public static final String TABLE_NAME = "memos";
		public static final String COL_TITLE = "title";
		public static final String COL_BODY = "body";
		public static final String COL_CREATED = "created";
		public static final String COL_UPDATED = "updated";
	}
}
