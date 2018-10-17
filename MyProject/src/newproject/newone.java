package newproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newone {

	public static void main(String[] args) {
	
		String str1 = "Love";	
		String str2 = "You";
		
		System.out.println("Before swap "+str1+""+str2);
		
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After "+ str1 +""+str2);
	}
	
	
}
