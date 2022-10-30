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
import org.openqa.selenium.internal.FindsByClassName as FindsByClassName
import org.openqa.selenium.internal.FindsByClassName as Keys
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar as DateTimeFormatterRegistrar
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Enter name Flow sheet'), 'test_auto_not_found')

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.verifyTextPresent('No data to display.', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Clean_1'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Routejob_Filter'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/select_Enter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Job_Select'))

WebUI.verifyElementText(findTestObject('Yoda_Flow_Sheet/Filtre/All row Job'), 'Job')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Job_Select'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Sender(s)_Filter'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/select_Enter'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Div2_Account'))

WebUI.verifyElementText(findTestObject('Yoda_Flow_Sheet/Filtre/All row Account'), 'Account')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Div2_Account'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/bt_Receiver(s)_Filter'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/select_Enter'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Div_aCRM2'))

WebUI.verifyElementText(findTestObject('Yoda_Flow_Sheet/Filtre/All row aCRM'), 'aCRM')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Div_aCRM2'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/button_Create'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Button_Created by me'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Rows per page'))

WebUI.mouseOver(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Information icon'))

WebUI.verifyTextPresent('Created by : katalon - katalon@gmail.com (', false)

WebUI.verifyTextPresent('Updated by : katalon - katalon@gmail.com (', false)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/button_Create'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Button_Created by me'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/button_Creation date'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Date_Calendar'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/button_Close'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Paging/Rows per page'))

WebUI.mouseOver(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Information icon'))

LocalDateTime now = LocalDateTime.now()

DateTimeFormatter formatter = DateTimeFormatter.ofPattern('yyyy/MM/dd')

String nowString = formatter.format(now)

WebUI.verifyTextPresent('Created by : katalon - katalon@gmail.com (' + nowString, false)

WebUI.verifyTextPresent('Updated by : katalon - katalon@gmail.com (' + nowString, false)

