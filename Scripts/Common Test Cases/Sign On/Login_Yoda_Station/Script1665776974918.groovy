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

WebUI.openBrowser(GlobalVariable.url_Sandbox)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Other/Btn_Advanced'))

WebUI.scrollToElement(findTestObject('Other/Procced to portal'), 0)

WebUI.click(findTestObject('Other/Procced to portal'))

WebUI.waitForElementVisible(findTestObject('Page_Portal_Yoda/Titre2_Portal_Yoda'), 3)

WebUI.click(findTestObject('Page_Portal_Yoda/Yoda_Station_Link'))

WebUI.switchToWindowTitle('Privacy error')

WebUI.click(findTestObject('Other/Btn_Advanced'))

WebUI.scrollToElement(findTestObject('Other/Procced to portal'), 0)

WebUI.click(findTestObject('Other/Procced to portal'))

WebUI.click(findTestObject('Other/Btn_Advanced'))

WebUI.scrollToElement(findTestObject('Other/Procced to portal'), 0)

WebUI.click(findTestObject('Other/Procced to portal'))

WebUI.switchToWindowTitle('Sign in to sandbox')

WebUI.setText(findTestObject('Sign On/Username_Sandbox', [('variable') : 'standard_user']), Login)

WebUI.setText(findTestObject('Sign On/Password_Sandbox'), Password)

WebUI.click(findTestObject('Sign On/Sign on Sandbox'))

