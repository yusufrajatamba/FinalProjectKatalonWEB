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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kotakoki/menu_Shop'), 3)

WebUI.click(findTestObject('Object Repository/Page_Kotakoki/menu_Shop'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Products  Kotakoki/li_On Sale4'), 3)

WebUI.click(findTestObject('Object Repository/Page_Products  Kotakoki/li_On Sale4'))

WebUI.click(findTestObject('Object Repository/Page_Products  Kotakoki/img_432ea2'))

WebUI.click(findTestObject('Object Repository/Page_Cap  Kotakoki/a_Description'))

WebUI.click(findTestObject('Object Repository/Page_Cap  Kotakoki/a_Additional information'))

WebUI.click(findTestObject('Object Repository/Page_Cap  Kotakoki/a_Reviews (0)'))

WebUI.setText(findTestObject('Object Repository/Page_Cap  Kotakoki/textarea__comment'), 'Kualitas barang bagus')

WebUI.setText(findTestObject('Object Repository/Page_Cap  Kotakoki/input__author'), 'Yusuf')

WebUI.setText(findTestObject('Object Repository/Page_Cap  Kotakoki/input__email'), 'yusuf@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Cap  Kotakoki/input_Save my name'))

WebUI.click(findTestObject('Object Repository/Page_Cap  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Cap  Kotakoki/share to fb'))

WebUI.switchToWindowTitle('Facebook')

WebUI.click(findTestObject('Object Repository/Page_Facebook/h2_Facebook'))

