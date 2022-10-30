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

WebUI.click(findTestObject('Yoda_Flow_Sheet/Edit/button_Edit'))

WebUI.verifyTextPresent('Editing Yoda Flow sheet', false)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Flow name'), 'Updated')

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Business unit'), '')

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Business unit'), 'Spain')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Edit/Div_Spain'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Project'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Project'), '')

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Project'), 'Adobe')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Edit/Div_Adobe'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Logical Flow Ids'), '123BBBZZZZZ')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/label_Deprecated'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/label_Technical'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Edit/delete btn overview'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Save btn'))

WebUI.verifyTextPresent('Spain', false)

WebUI.verifyTextPresent(GlobalVariable.CreatedFlowSheet+'Updated', false)

WebUI.verifyTextPresent('Retail Diamond', false)

WebUI.verifyTextPresent('Adobe', false)

WebUI.verifyTextPresent('123BBBZZZZZ', false)

WebUI.verifyTextNotPresent('deprecated', false)

WebUI.verifyTextNotPresent('technical', false)

WebUI.verifyTextPresent('No overview specified.', false)

