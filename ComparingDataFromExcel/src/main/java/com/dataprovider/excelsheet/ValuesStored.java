package com.dataprovider.excelsheet;

public class ValuesStored {
	private static String UserValue;
	private static String PassValue;
	private static String CompareLoginValue;

	public static String getUserValue() {
		return UserValue;
	}
	public static void setUserValue(String userValue) {
		UserValue = userValue;
	}
	public static String getPassValue() {
		return PassValue;
	}
	public static void setPassValue(String passValue) {
		PassValue = passValue;
	}
	public static String getCompareLoginValue() {
		return CompareLoginValue;
	}
	public static void setCompareLoginValue(String compareLoginValue) {
		CompareLoginValue = compareLoginValue;
	}
}
