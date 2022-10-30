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
import org.openqa.selenium.internal.FindsByCssSelector as FindsByCssSelector
import org.openqa.selenium.internal.FindsByCssSelector as Keys

WebUI.callTestCase(findTestCase('Yoda_Station/Keyclock/001 - Yoda Portal Access - Login to Keycloak'), [('usr_keycloak') : 'test-auto'
        , ('pwd_keycloak') : '36ir2JbkFBN9'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Keycloak/NP'))

WebUI.waitForElementClickable(findTestObject('Keycloak/k-clients'), 3)

WebUI.click(findTestObject('Keycloak/k-clients'))

WebUI.click(findTestObject('Keycloak/Base_URL_account'))

WebUI.switchToWindowTitle('Sign On')

WebUI.setText(findTestObject('Sign On/input_User'), username_Pass)

WebUI.click(findTestObject('Sign On/Next'))

WebUI.setText(findTestObject('Sign On/Password_Sandbox'), password_Pass)

WebUI.click(findTestObject('Sign On/Sign On'))

WebUI.verifyElementPresent(findTestObject('Keycloak/Update your country'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Country'), 0)

WebUI.selectOptionByValue(findTestObject('Keycloak/Select_Country'), 'FRANCE', false)

WebUI.click(findTestObject('Keycloak/Register'))

WebUI.verifyElementPresent(findTestObject('Keycloak/Update your project'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Project'), 0)

WebUI.selectOptionByValue(findTestObject('Keycloak/Select_Project'), 'OT', false)

WebUI.click(findTestObject('Keycloak/Register'))

WebUI.verifyElementPresent(findTestObject('Keycloak/Home_page'), 0)

WebUI.switchToWindowTitle('Keycloak Admin Console')

WebUI.click(findTestObject('Keycloak/Users'))

WebUI.setText(findTestObject('Keycloak/Input_Search'), username_Pass)

WebUI.click(findTestObject('Keycloak/Search'))

WebUI.click(findTestObject('Keycloak/ID Usr'))

WebUI.click(findTestObject('Keycloak/Attributes'))

WebUI.verifyElementPresent(findTestObject('Keycloak/Key-Country'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Key-country-code'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Key-is-corporate'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Key-first-login-date'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Key-orga-project'), 0)

WebUI.scrollToElement(findTestObject('Keycloak/Key-uid2'), 0)

WebUI.verifyElementPresent(findTestObject('Keycloak/Key-uid2'), 0)

/*Country
WebUI.getAttribute(findTestObject('Keycloak/Value-Country'), 'value')

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Keycloak/Value-Country'), 'value'), 'FRANCE', null)*/
WebUI.getAttribute(findTestObject('Keycloak/Value-Country-code'), 'value')

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Keycloak/Value-Country-code'), 'value'), 'FR', null)

/*uid and is corporate*/
WebUI.getAttribute(findTestObject('Keycloak/Key-is-corporate'), 'value')

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Keycloak/Value-is-corporate'), 'value'), 'true', null)

WebUI.getAttribute(findTestObject('Keycloak/Value-uid2'), 'value')

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Keycloak/Value-uid2'), 'value'), 'XFR2206005', null)

/*orga project and date*/
WebUI.getAttribute(findTestObject('Keycloak/Value--first-login-date'), 'value')

/*WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Keycloak/Value--first-login-date'), 'value'), 'true', null)*/
WebUI.getAttribute(findTestObject('Keycloak/Value-orga-project'), 'value')

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Keycloak/Value-orga-project'), 'value'), 'Others', null)

WebUI.switchToWindowTitle('Keycloak Account Management')

WebUI.verifyElementPresent(findTestObject('Keycloak/Home_page'), 0)

