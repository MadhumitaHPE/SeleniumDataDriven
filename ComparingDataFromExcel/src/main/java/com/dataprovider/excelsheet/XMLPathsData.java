package com.dataprovider.excelsheet;

public class XMLPathsData {
	private static String FbURL="https://www.facebook.com/";
	private static String EmailID="email";
	private static String PasswordID="pass";
	private static String LoginButtonID="loginbutton";
	public static String getFbURL() {
		return FbURL;
	}
	public static void setFbURL(String fbURL) {
		FbURL = fbURL;
	}
	public static String getEmailID() {
		return EmailID;
	}
	public static void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public static String getPasswordID() {
		return PasswordID;
	}
	public static void setPasswordID(String passwordID) {
		PasswordID = passwordID;
	}
	public static String getLoginButtonID() {
		return LoginButtonID;
	}
	public static void setLoginButtonID(String loginButtonID) {
		LoginButtonID = loginButtonID;
	}
}
