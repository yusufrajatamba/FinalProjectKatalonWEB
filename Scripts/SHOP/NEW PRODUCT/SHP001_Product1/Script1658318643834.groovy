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

WebUI.click(findTestObject('Object Repository/Page_Products  Kotakoki/a_New Products'))

WebUI.click(findTestObject('Object Repository/Page_Products  Kotakoki/post-image01'))

WebUI.click(findTestObject('Object Repository/Page_Frozen Tempe/productname'))

WebUI.getText(findTestObject('Object Repository/Page_Frozen Tempe/keterangan'))

WebUI.click(findTestObject('Object Repository/Page_Frozen Tempe/a_Description'))

WebUI.setText(findTestObject('Object Repository/Page_Frozen Tempe/input_Frozen'), '3')

WebUI.click(findTestObject('Object Repository/Page_Frozen Tempe/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Frozen Tempe/viecart'))

WebUI.verifyElementPresent(findTestObject('Page_Cart  Kotakoki/td_Frozen Tempe Furai Original 400 g'), 3)

WebUI.click(findTestObject('Object Repository/Page_Cart  Kotakoki/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/inputfirst_name'), 'YusufRaja')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/inputlast_name'), 'Tamba')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/inputbilling_company'), 'BTDP')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Kotakoki/inputaddress_1'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/inputaddress_1'), 'Jalan Curug Gardeb No B3/40')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input_address_2'), 'Banten')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_city'), 'Tangerang')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_postcode'), '20001')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_phone'), '082276471331')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_email'), 'yusufraja001@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/comments'), 'Mohon Di packing dengna Rapi')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Kotakoki/input_TEST MODE_payment_method'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Kotakoki/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout/notransaksi'), 5)

WebUI.click(findTestObject('Object Repository/Page_Checkout/simulasi pembayaran'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Checkout  Kotakoki/Order received'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout  Kotakoki/div_Thank you'), 4)

