import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Sort'))

TestObject Table = findTestObject('Yoda_Flow_Sheet/sort/All Table')

List<Path> elements = WebUI.findWebElements(Table, 10)


for (int i = 1; i < elements.size(); ++i) {
    //KeywordUtil.logInfo(elements.get(i).getText())
    previousElemen = elements.get(i - 1).getText()

    currentElement = elements.get(i).getText()

    assert previousElemen.compareTo(currentElement) >= 0
}

WebUI.click(findTestObject('Yoda_Flow_Sheet/Filtre/Sort'))

List<Path> elementsasc = WebUI.findWebElements(Table, 10)

for (int i = 1; i < elementsasc.size(); ++i) {
    //KeywordUtil.logInfo(elements.get(i).getText())
    previousElemenasc = elementsasc.get(i - 1).getText()

    currentElementasc = elementsasc.get(i).getText()

    assert previousElemenasc.compareTo(currentElementasc) <= 0
}

