import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://portal.yep-sandbox.np.internal.auchan.com/')

WebUI.click(findTestObject('null'))

WebUI.scrollToElement(findTestObject('Other/Procced to portal'), 0)

WebUI.click(findTestObject('Other/Procced to portal'))

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Page_Portal_Yoda/Titre2_Portal_Yoda'), 3)

WebUI.verifyTextPresent('Portal YODA', false)

WebUI.verifyTextPresent('The only one portal to access to all your Yoda services!', false)

WebUI.verifyElementPresent(findTestObject('Page_Portal_Yoda/Logo_Yoda'), 0)

WebUI.click(findTestObject('Page_Portal_Yoda/Menu_PROD'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Portal_Yoda/Menu_UAT'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Portal_Yoda/Menu_COMMON'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Portal_Yoda/Yoda_Wiki_Link'), 0)

