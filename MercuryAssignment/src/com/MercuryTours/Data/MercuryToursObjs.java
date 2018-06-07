package com.MercuryTours.Data;

import java.util.ArrayList;
import java.util.HashMap;
import org.openqa.selenium.By;

public class MercuryToursObjs {

	public static By username=By.name("userName");
	public static By password=By.name("password");
	public static By btn_SignIn=By.name("login");

	public static By radio_type;
	public static By dropdown_Passengers;
	public static By dropdown_DepartingFrom;
	public static By dropdown_Month;
	public static By dropdown_Date;
	public static By dropdown_ArrivingIn;
	public static By dropdown_Returning_Month;
	public static By dropdown_Returning_Date;
	public static By radio_Service_Class;
	public static By dropdown_Airline;
	public static By btn_findFlights=By.name("findFlights");
	public static By ret=By.xpath("//font[text()[contains(.,\"RETURN\")]]");
	public static ArrayList<By> depart_price =new ArrayList<By>();
	public static ArrayList<By> arr_price =new ArrayList<By>();

	public static HashMap<By,By> dep_checkBox =new HashMap<By,By>();
	public static HashMap<By,By> arr_checkBox =new HashMap<By,By>();
	public static By btn_reserveFlights=By.name("reserveFlights");

	
	public static By getRadio_type() {
		return radio_type;
	}
	public static void setRadio_type(String val) {
		radio_type=By.xpath("//input[@value='"+val+"']");
	}

	public static By getDropdown_Passengers() {
		return dropdown_Passengers;
	}
	public static void setDropdown_Passengers(String no_of_Pass) {
		dropdown_Passengers=By.xpath("//select[@name='passCount']//option[@value='"+no_of_Pass+"']");
	}
	public static By getDropdown_DepartingFrom() {
		return dropdown_DepartingFrom;
	}
	public static void setDropdown_DepartingFrom(String DepartingFrom) {
		dropdown_DepartingFrom =By.xpath("//select[@name='fromPort']//option[@value='"+DepartingFrom+"']");
	}
	public static By getDropdown_Month() {
		return dropdown_Month;
	}
	public static void setDropdown_Month(String month) {
		dropdown_Month = By.xpath("//select[@name='fromMonth']//option[@value='"+month+"']	");
	}
	public static By getDropdown_Date() {
		return dropdown_Date;
	}
	public static void setDropdown_Date(String date) {
		dropdown_Date = By.xpath("//select[@name='fromDay']//option[@value='"+date+"']	");
	}

	public static By getDropdown_ArrivingIn() {
		return dropdown_ArrivingIn;
	}
	public static void setDropdown_ArrivingIn(String ArrivingIn) {
		dropdown_ArrivingIn =By.xpath("//select[@name='toPort']//option[@value='"+ArrivingIn+"']");
	}
	public static By getDropdown_Returning_Month() {
		return dropdown_Returning_Month;
	}
	public static void setDropdown_Returning_Month(String returning_Month) {
		dropdown_Returning_Month = By.xpath("//select[@name='toMonth']//option[@value='"+returning_Month+"']");
	}
	public static By getDropdown_Returning_Date() {
		return dropdown_Returning_Date;
	}
	public static void setDropdown_Returning_Date(String returning_Date) {
		dropdown_Returning_Date =By.xpath("//select[@name='toDay']//option[@value='"+returning_Date+"']");
	}

	public static By getRadio_Service_Class() {
		return radio_Service_Class;
	}
	public static void setRadio_Service_Class(String Service_Class) {
		radio_Service_Class =By.xpath("//input[@value='"+Service_Class+"']");
	}

	public static By getDropdown_Airline() {
		return dropdown_Airline;
	}
	public static void setDropdown_Airline(String airline) {
		dropdown_Airline =By.xpath("//select[@name='airline']/option["+airline+"]");
	}


	public static ArrayList<By> getDepart_price() {
		return depart_price;
	}
	public static void setDepart_price() {
		depart_price.add(By.xpath("//table[1]/tbody/tr[4]/td/font/font/b"));
		depart_price.add(By.xpath("//table[1]/tbody/tr[6]/td/font/font/b"));
		depart_price.add(By.xpath("//table[1]/tbody/tr[8]/td/font/font/b"));
		depart_price.add(By.xpath("//table[1]/tbody/tr[10]/td/font/font/b"));
	}

	public static ArrayList<By> getArr_price() {
		return arr_price;
	}
	public static void setArr_price() {
		arr_price.add(By.xpath("//table[2]/tbody/tr[4]/td/font/font/b"));
		arr_price.add(By.xpath("//table[2]/tbody/tr[6]/td/font/font/b"));
		arr_price.add(By.xpath("//table[2]/tbody/tr[8]/td/font/font/b"));
		arr_price.add(By.xpath("//table[2]/tbody/tr[10]/td/font/font/b"));
	}
	public static HashMap<By, By> getDep_checkBox() {
		return dep_checkBox;
	}
	public static void setDep_checkBox() {
		dep_checkBox.put(By.xpath("//table[1]/tbody/tr[4]/td/font/font/b"), By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input"));
		dep_checkBox.put(By.xpath("//table[1]/tbody/tr[6]/td/font/font/b"), By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input"));
		dep_checkBox.put(By.xpath("//table[1]/tbody/tr[8]/td/font/font/b"), By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input"));
		dep_checkBox.put(By.xpath("//table[1]/tbody/tr[10]/td/font/font/b"),By.xpath("//tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input"));
	}
	public static HashMap<By, By> getArr_checkBox() {
		return arr_checkBox;
	}
	public static void setArr_checkBox() {
		arr_checkBox.put(By.xpath("//table[2]/tbody/tr[4]/td/font/font/b"), By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input"));
		arr_checkBox.put(By.xpath("//table[2]/tbody/tr[6]/td/font/font/b"), By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input"));
		arr_checkBox.put(By.xpath("//table[2]/tbody/tr[8]/td/font/font/b"), By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input"));
		arr_checkBox.put(By.xpath("//table[2]/tbody/tr[10]/td/font/font/b"),By.xpath("//tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input"));
	}

}
//oneway