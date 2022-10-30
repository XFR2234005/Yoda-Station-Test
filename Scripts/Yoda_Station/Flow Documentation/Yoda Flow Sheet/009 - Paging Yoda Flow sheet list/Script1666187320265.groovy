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

WebUI.scrollToElement(findTestObject('Yoda_Flow_Sheet/Paging/Rows per page'), 0)

WebUI.verifyTextPresent('1-10 of', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Click_Select_10'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Select_15'))

WebUI.verifyTextPresent('1-15 of', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Click_Select_15'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Select_5'))

WebUI.verifyTextPresent('1-5 of ', false)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Paging/Before_disabled'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Btn_After'))

WebUI.verifyTextPresent('6-10', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Btn_Before'))

WebUI.verifyTextPresent('1-5 of', false)

