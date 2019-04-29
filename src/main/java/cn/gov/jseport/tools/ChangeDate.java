package cn.gov.jseport.tools;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ChangeDate {
	public static Date convertDate(String dateString) {
		if(dateString==null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static String convertString(Date date) {
		if(date==null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.format(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
