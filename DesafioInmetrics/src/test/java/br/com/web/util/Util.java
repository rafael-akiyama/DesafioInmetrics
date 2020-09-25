package br.com.web.util;

import static br.com.web.core.DriverFactory.getDriver;
import static br.com.web.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Util {

	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	}

	public static void takeScreenShot(Scenario scenario) {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			if (!scenario.isFailed()) {
				FileUtils.copyFile(srcFile,
						(new File("./screenshots/passed/", scenario.getName() + " - " + timestamp() + ".png")));
			} else {
				FileUtils.copyFile(srcFile,
						(new File("./screenshots/failed", scenario.getName() + " - " + timestamp() + ".png")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void afterScenario(Scenario scenario) {
		if (!scenario.isFailed()) {
			extentTest.log(Status.PASS, "Cenário " + scenario.getName() + " executado com sucesso!");
		} else {
			extentTest.log(Status.FAIL, "Cenário " + scenario.getName() + " executado com falha!");
		}
		extentReport.flush();
	}

	@Before
	public static void takeReport(Scenario scenario) {
		if (extentReport == null) {
			criarDiretorioMacro();
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("./report/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}
		extentTest = extentReport.createTest(scenario.getId());
	}
	
	public static void criarDiretorioMacro() {
        try {
            File diretorio = new File("./report");
            diretorio.mkdir();
            System.out.println("Diretorio report criado com sucesso na pasta raiz do projeto");
        } catch (Exception ex) {
        	System.out.println("Erro ao criar o diretorio report na pasta raiz do projeto");
            System.out.println(ex);
        }
    }

	@After
	public static void tearDown(Scenario scenario) {
		takeScreenShot(scenario);
		afterScenario(scenario);
		killDriver();
	}
}
