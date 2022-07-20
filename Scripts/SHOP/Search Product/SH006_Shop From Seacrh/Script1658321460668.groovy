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

WebUI.setText(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/input_Featured'), 'sunglasses')

WebUI.verifyElementPresent(findTestObject('Page_Kotakoki  Welcome to my Website/div_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Kotakoki  Welcome to my Website/div_SunglassesRp90.000'), 0)

WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/img_27ab4d'))

WebUI.setText(findTestObject('Object Repository/Page_Sunglasses  Kotakoki/input_Sunglasses quantity_quantity'), '3')

WebUI.click(findTestObject('Object Repository/Page_Sunglasses  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Sunglasses  Kotakoki/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Kotakoki/Proceed to checkout'))

WebUI.callTestCase(findTestCase('PAGE cant run alone/CKT_Page Checkout'), [:], FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.callTestCase(findTestCase('SHOP/NEW PRODUCT/SHP002_Product1 and Continue SHOP'), [:], FailureHandling.STOP_ON_FAILURE)
}

