package com.hw.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateConvert {
	public static Date dateConvert() {
		java.util.Date nDate = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sDate = sdf.format(nDate);
        java.sql.Date date = java.sql.Date.valueOf(sDate);
        return date;
	}
}
