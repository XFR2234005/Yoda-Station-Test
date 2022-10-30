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

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Open Flow Sheet Btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(GlobalVariable.CreatedFlowSheet, false)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Business unit'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Responsible team'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Project'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Sender(s)'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Receiver(s)'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Talend process type'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Logical Flow Ids'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Integration Patterns'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/td_Tags'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/td_Mappings (click on label to open)'), 0)

WebUI.verifyTextPresent(GlobalVariable.CreatedFlowSheet, false)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_Corporate'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_Retail Diamond'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_Cerberos'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_Atos'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_aCRM'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/Span Route'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_123AA'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_sort'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_technical'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/span_deprecated'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/p_Objective and flow context'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/p_Overview'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/Overview_img'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/p_Description'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Information/p_Changelog'), 0)

