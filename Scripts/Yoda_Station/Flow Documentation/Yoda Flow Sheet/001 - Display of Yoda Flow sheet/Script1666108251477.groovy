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

WebUI.callTestCase(findTestCase('Common Test Cases/Sign On/Login_Yoda_Station'), [('Login') : 'katalon', ('Password') : 'F4jfgEtgvGxyKB'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu/Flow_documentation_icon'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Yoda Flow sheet'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Yoda Flow sheet'))

WebUI.callTestCase(findTestCase('Yoda_Station/Header/Verify_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Yoda Flow sheet list'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/button_download'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/button_Create'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/th_Flow name'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/th_Routejob'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/th_Sender(s)'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/th_Receiver(s)'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/th_CreatedByMe'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Sort'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Routejob_Filter'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Sender(s)_Filter'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/bt_Receiver(s)_Filter'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/button_Create'), 0)

