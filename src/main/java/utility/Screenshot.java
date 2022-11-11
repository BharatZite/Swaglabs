package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.Browser;

public class Screenshot {
	public static void clickScreenshot(WebDriver driver,String name) throws IOException {
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter time= DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String s=date.format(time);
		File destination=new File("C:\\Users\\Bharat\\Documents\\eclipse\\automation\\src\\SwagLabs\\screenshot\\"+name+"-"+s+".png");
		FileHandler.copy(source, destination);
		
		
		
		
	}
	



}

