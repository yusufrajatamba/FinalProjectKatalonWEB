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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/span_Shop'))

WebUI.click(findTestObject('Object Repository/Page_Products  Kotakoki/a_Uncategorized'))

WebUI.verifyElementPresent(findTestObject('Page_Uncategorized  Kotakoki/h1_Uncategorized15 items'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Uncategorized  Kotakoki/NewAlbum'), 0)

WebUI.click(findTestObject('Object Repository/Page_Uncategorized  Kotakoki/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.click(findTestObject('Object Repository/Page_Album  Kotakoki/div_Zoom'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Album  Kotakoki/img_Copyright'), 0)

WebUI.click(findTestObject('Object Repository/Page_Album  Kotakoki/img_Copyright'))

WebUI.setText(findTestObject('Object Repository/Page_Album  Kotakoki/Album quantity'), '10')

WebUI.click(findTestObject('Object Repository/Page_Album  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Album  Kotakoki/a_10'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Kotakoki/a_Proceed to checkout'))

WebUI.callTestCase(findTestCase('PAGE cant run alone/CKT_Page Checkout'), [:], FailureHandling.STOP_ON_FAILURE)

