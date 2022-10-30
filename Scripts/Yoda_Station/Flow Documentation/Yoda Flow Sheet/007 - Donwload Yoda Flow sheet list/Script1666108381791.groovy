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
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.util.regex.Pattern as Pattern
import java.util.stream.Collectors as Collectors
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.click(findTestObject('Yoda_Flow_Sheet/Page_Yoda Station/button_download2'))

WebUI.verifyTextPresent('Successfully extracted', false)

/**
 * Scans the folder "/Users/name/Downloads" for files "report_flux.csv".
 * If found print their full paths,
 * else fails.
 */
Path userHome = Paths.get(System.getProperty('user.home'))

Path downloadsFolder = userHome.resolve('Downloads')

assert Files.exists(downloadsFolder)

Pattern pattern = Pattern.compile('report_flux.csv')

List<Path> files = Files.list(downloadsFolder).filter({ def p ->
        Files.isRegularFile(p)
    }).filter({ def p ->
        pattern.matcher(p.getFileName().toString()).matches()
    }).collect(Collectors.toList())

if (files.size() > 0) {
    files.each({ def file ->
            println(file.toString())
        })
} else {
    KeywordUtil.markFailedAndStop("found no file that match regex $pattern")
}

