package com.jenkinsDummy.loginvtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginVtigerTest {
	
@Test	
public void loginvtigerTest() throws Throwable 
{
	WebDriver driver=new ChromeDriver();
	FileInputStream fis=new FileInputStream("./data/Commondata.properties");
	Properties pboj= new Properties();
	pboj.load(fis);
	System.out.println("login to application");
	String Browser=pboj.getProperty("browser");
	String Url=pboj.getProperty("url");
	driver.get(Url);
	System.out.println("url");
	System.out.println("welcome to jenkins");
	System.out.println("good evening");
}
}
