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

WebUI.verifyElementPresent(findTestObject('Page_Kotakoki  Welcome to my Website/gambar_palumix'), 0)

WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/menuRegister'))

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Username_'), 'yusuf34234uas')

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_E-mail'), 'yusuf.tamba2971@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Phone Number'), '082276471331')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Password'), password1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Confirm Password'), password1)

WebUI.setText(findTestObject('Object Repository/Page_Register Now  Kotakoki/input_Address'), 'Jalan curug garden no B3/40')

WebUI.click(findTestObject('Object Repository/Page_Register Now  Kotakoki/btn_register'))

WebUI.waitForAlert(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/menuMy account'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_menu my account/li_Dashboard'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_menu my account/a_Orders'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_menu my account/a_Downloads'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_menu my account/a_Addresses'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_menu my account/a_Payment methods'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_menu my account/a_Account details'), 2)

