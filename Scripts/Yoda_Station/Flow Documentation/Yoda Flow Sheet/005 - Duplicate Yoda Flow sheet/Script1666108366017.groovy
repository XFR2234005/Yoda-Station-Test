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

WebUI.click(findTestObject('Menu/Flow_documentation_icon'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Yoda Flow sheet'))

WebUI.waitForElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'), 3)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'))

WebUI.waitForElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Enter name Flow sheet'), 2)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Enter name Flow sheet'), GlobalVariable.CreatedFlowSheet)

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Duplicate/button_duplicate'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Duplicate/span_Duplicate_Yoda Flow sheet'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Duplicate/input_Flow name_input-346'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Duplicate/label_Do you want to choose one or more deployments version'), 
    0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Duplicate/input_Flow name_input-346'), GlobalVariable.CreatedFlowSheet + 'Duplicated')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Duplicate/btn_Duplicate_popup'), FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.verifyTextPresent('Duplicate successful', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Duplicate/Clean'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Enter name Flow sheet'), GlobalVariable.CreatedFlowSheet + 
    'Duplicated')

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.verifyTextPresent(GlobalVariable.CreatedFlowSheet + 'Duplicated', false)

WebUI.verifyTextPresent('Route that run job(s)', false)

WebUI.verifyTextPresent('Atos', false)

WebUI.verifyTextPresent('aCRM', false)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Duplicate/button_duplicate'), 0)

WebUI.mouseOver(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Information icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Created by', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Duplicate/Clean'))

