package com.MercuryTours;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.MercuryTours.Data.MercuryToursObjs;
import com.google.common.collect.Ordering;

public class MercuryTours {

	WebElement type,passengers,departing,on,arriving,returning,serviceClass,airline;	
	public boolean login(WebDriver driver, String userName, String password) {
		try {
			driver.findElement(MercuryToursObjs.username).sendKeys(userName);;
			driver.findElement(MercuryToursObjs.password).sendKeys(password);
			driver.findElement(MercuryToursObjs.btn_SignIn).click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
  public boolean flightFinder(WebDriver driver,String type,String passengers,String departing,String amonth,String adate,String arriving,String rmonth,String rdate,String serviceClass,String airline) {
	  try {
		  setValues(type,passengers,departing,amonth,adate,arriving,rmonth,rdate,serviceClass,airline);
		  driver.findElement(MercuryToursObjs.radio_type).click();
		  driver.findElement(MercuryToursObjs.dropdown_Passengers).click();
		  driver.findElement(MercuryToursObjs.dropdown_DepartingFrom).click();
		  driver.findElement(MercuryToursObjs.dropdown_Month).click();
		  driver.findElement(MercuryToursObjs.dropdown_Date).click();
		  driver.findElement(MercuryToursObjs.dropdown_ArrivingIn).click();
		  driver.findElement(MercuryToursObjs.dropdown_Returning_Month).click();
		  driver.findElement(MercuryToursObjs.dropdown_Returning_Date).click();
		  driver.findElement(MercuryToursObjs.radio_Service_Class).click();
		  driver.findElement(MercuryToursObjs.dropdown_Airline).click();
		  driver.findElement(MercuryToursObjs.btn_findFlights).click();

		  return true;
	} catch (Exception e) {
		return false;
	}
  }
private void setValues(String type,String passengers,String departing,String amonth,String adate,String arriving,String rmonth,String rdate,String serviceClass,String airline) {
	  MercuryToursObjs.setRadio_type(type);
	  MercuryToursObjs.setDropdown_Passengers(passengers);
	  MercuryToursObjs.setDropdown_DepartingFrom(departing);
	  MercuryToursObjs.setDropdown_Month(amonth);
	  MercuryToursObjs.setDropdown_Date(adate);
	  MercuryToursObjs.setDropdown_ArrivingIn(arriving);
	  MercuryToursObjs.setDropdown_Returning_Month(rmonth);
	  MercuryToursObjs.setDropdown_Returning_Date(rdate);
	  MercuryToursObjs.setRadio_Service_Class(serviceClass);
	  MercuryToursObjs.setDropdown_Airline(airline);
	
}
public void isElementPresent(WebDriver driver) {
		if (MercuryToursObjs.radio_type.toString().contains("oneway")) {
			if (driver.findElement(MercuryToursObjs.ret).isEnabled()) {
				System.out.println("Error ! Return table persent for one way trip");
			}else
			System.out.println("Test Passed ! Return table not persent for one way trip");
		}else
		System.out.println("test Passed !It is a return trip");
}

public void bookflight(WebDriver driver) {
		MercuryToursObjs.setDepart_price();
		MercuryToursObjs.setArr_price();
		ArrayList<By> depList=MercuryToursObjs.getDepart_price();
		ArrayList<By> arrList=MercuryToursObjs.getArr_price();
		
		 MercuryToursObjs.setArr_checkBox();
		 MercuryToursObjs.setDep_checkBox();
		HashMap<By,By> depchk=MercuryToursObjs.getDep_checkBox();
		HashMap<By,By> arrchk=MercuryToursObjs.getArr_checkBox();
		
		if (checkMaxPrice(driver,depList)) {
			driver.findElement(depchk.get(depList.get(depList.size()-1))).click();
		}

		if (checkMaxPrice(driver, arrList)) {
			driver.findElement(arrchk.get(arrList.get(arrList.size()-1))).click();
		}
		driver.findElement(MercuryToursObjs.btn_reserveFlights).click();
}

private boolean checkSorted(ArrayList<Integer> checkMaxPrice) {
	if(Ordering.natural().isOrdered(checkMaxPrice)){
			return true;
		}else 
			return false;
}


private boolean checkMaxPrice(WebDriver driver,ArrayList<By> list) {

	ArrayList<Integer> dep_priceList=new ArrayList<>();
		for (By by : list) {
		dep_priceList.add(Integer.parseInt(driver.findElement(by).getText().substring(8)));
	}
		if (checkSorted(dep_priceList)) {
				return true;
		}else
			return false;
}
}