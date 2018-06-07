package com.MercuryTours.Handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MercuryTours.MercuryTours;

public class MercuryToursAssg {

	private static MercuryTours mObj;
	private static String property="webdriver.chrome.driver";
	//private static String path="D://Essentials//Setup//Selinium//chromedriver.exe";
	/*Home*/	private static String path="F:\\Selinium\\chromedriver.exe";
	private static String url="http://newtours.demoaut.com/";
	private static String userName="mercury";
	private static String password="mercury";
	private static WebDriver driver;
	public static void main(String[] args) {		// TODO Auto-generated method stub
		
		System.setProperty(property, path);
		
		driver=new ChromeDriver();
		driver.get(url);
		
		mObj=new MercuryTours();

		if (mObj.login(driver,userName,password)) {
			System.out.println("Login SuccessFull");
			if (mObj.flightFinder(driver,"roundtrip","2","London","7","22","Sydney","8","22","Business","4")) {
				mObj.isElementPresent(driver);
				mObj.bookflight(driver);
			}
		}
	}

}
