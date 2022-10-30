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

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/button_Create2'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Title New Yoda flow Sheet'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Flow name'), 0)

WebUI.scrollToElement(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/btn Auto Generate'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/btn Auto Generate'))

int AutoGenerate

AutoGenerate = ((Math.random() * 856) as int)

numberFlowSheetGenerate = AutoGenerate

GlobalVariable.CretaedFlwSheetAutoGener = ('RETAILDIAM_Test_Auto' + numberFlowSheetGenerate.toString())

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Business name'), GlobalVariable.CretaedFlwSheetAutoGener)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Flow Name Disabled'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Business unit'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Business unit'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Business unit'), 'Corporate')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div_Corporate'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Responsible team'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Responsible team'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Responsible team'), 'Retail Diamond')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div Retail Diamond'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Project'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Project'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Project'), 'Cerberos')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div_Cerberos'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Label Sender'), 0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Sender'), 'Atos')

WebUI.scrollToElement(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Logical Flow Ids'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div_Sender'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Label Receiver'), 0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Receiver'), 'aCRM')

WebUI.scrollToElement(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Logical Flow Ids'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div_Receiver'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Label Talend process type'), 0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Talend process type'), 'Route that run job(s)')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div_Talend process type'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Label Integration Patterns'), 0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Integration Patterns'), 'sort')

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Div_Integration Patterns'))

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Labe Logical Flow Ids'), 0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Logical Flow Ids'), '123AA')

WebUI.scrollToElement(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Desc'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/label_Deprecated'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/label_Technical'))

WebUI.uploadFile(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Upload/UploadFile'), 'C:\\Test Auto\\401.PNG')

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Upload/FileUploaded'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Upload/Img_uploaded'), 0)

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Mapping label'), 'Test_Auto_label_Mapping')

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Input Mapping link'), 'www.google.com')

WebUI.scrollToElement(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/button_Mapping'), 0)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/button_Mapping'))

WebUI.click(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Save btn'))

WebUI.verifyTextPresent('Resource successfully created', false)

WebUI.waitForElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'), 2)

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/btn_Flow name_Filter'))

WebUI.setText(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Enter name Flow sheet'), GlobalVariable.CretaedFlwSheetAutoGener)

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.verifyTextPresent(GlobalVariable.CretaedFlwSheetAutoGener, false)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Route Job Created'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Sender Created'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Create Flow Sheet/Receiver Created'), 0)

WebUI.verifyElementPresent(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Duplicate btn'), 0)

WebUI.mouseOver(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/Information icon'), FailureHandling.STOP_ON_FAILURE)

