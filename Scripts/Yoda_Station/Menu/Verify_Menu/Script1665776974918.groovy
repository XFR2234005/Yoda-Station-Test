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

WebUI.verifyElementPresent(findTestObject('Menu/Home_icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Home'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Flow_documentation_icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Flow Documentation'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/icon_Template'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Templates'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Infrastructure_icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Infrastructure'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Tools_icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Tools'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Reports-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Reports'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Wiki-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Wiki'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Profile-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Profile'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/About-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/About'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/icon_logout'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Logout'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/XFR0000001_Usr'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/XFR_chevron_left'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Chevron_left_Flw_Doc'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Chevron_Temp'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Chevron_Infra'), 0)

WebUI.verifyElementPresent(findTestObject('Menu/Chevron_Tools'), 0)

