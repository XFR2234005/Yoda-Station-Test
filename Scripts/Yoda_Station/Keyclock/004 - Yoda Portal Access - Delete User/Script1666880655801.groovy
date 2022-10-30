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

WebUI.waitForElementVisible(findTestObject('Keycloak/Users'), 2)

WebUI.click(findTestObject('Keycloak/Users'))

WebUI.setText(findTestObject('Keycloak/Input_Search'), username_Pass)

WebUI.click(findTestObject('Keycloak/Search'))

WebUI.click(findTestObject('Keycloak/ID Usr'))

WebUI.click(findTestObject('Keycloak/Attributes'))

WebUI.click(findTestObject('Keycloak/btn-delete'))

WebUI.click(findTestObject('Keycloak/pop-up-delete'))

WebUI.setText(findTestObject('Keycloak/Input_Search'), username_Pass)

WebUI.click(findTestObject('Keycloak/Search'))

WebUI.waitForElementVisible(findTestObject('Keycloak/no results'), 2)

WebUI.verifyTextPresent('No results', false)

