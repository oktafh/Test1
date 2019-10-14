import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import internal.GlobalVariable

import java.awt.AWTException
import java.awt.Robot
import java.awt.event.KeyEvent
import java.io.*

public class Custom {
	@Keyword
	def input() throws IOException, AWTException, InterruptedException{
		WebUI.openBrowser('http://financetr.beyond.asuransi.astra.co.id')
		WebUI.delay(30)

		Robot robot = new Robot()
		robot.waitForIdle()
		robot.keyPress(KeyEvent.VK_B)
		Thread.sleep(500)
		robot.keyPress(KeyEvent.VK_E)
		Thread.sleep(500)
		robot.keyPress(KeyEvent.VK_Y)
		Thread.sleep(500)
		robot.keyPress(KeyEvent.VK_O)
		Thread.sleep(500)
		robot.keyPress(KeyEvent.VK_N)
		Thread.sleep(500)
		robot.keyPress(KeyEvent.VK_D)
	}
}
