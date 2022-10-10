package com.example.main;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	@Test
	public void login() throws IOException {

		Properties prop = new Properties();

		// Load properties file

		prop.load(loginTest.class.getClassLoader().getResourceAsStream("application.properties"));

		String uName = prop.getProperty("uName");// AgentHunt
		String pwd = prop.getProperty("Pwd");// MissionImpossible

		System.out.println("Username Value is ==> " + uName);
		System.out.println("Password Value is ==> " + pwd);
	}
}
