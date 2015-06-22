package com.appium.jenkins.ParameterizingMaven;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.MobileDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SafariIosSimulator {
	
	@Test
	public void testSafariSimulator() throws Exception {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("platformName"));
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("platformVersion"));
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
	//capabilities.setCapability("app", "//Users//vikasjain//Downloads//com.mobeta.android.demodslv.apk");
	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
	//capabilities.setCapability("appActivity", "DtryActivity");
	//capabilities.setCapability("noReset", false);
	
	IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
	driver.get("http://google.com");
	Thread.sleep(2000);
	
	
	

	}}
