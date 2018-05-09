import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.216.40.141:8085/')

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/p_This is the mock app for the'))

WebUI.setText(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/input_username'), username)

WebUI.setText(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/input_password'), password)

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_Login'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/h5_Garden'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_add to cart'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/h5_Banana'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_add to cart'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/h5_Orange'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_add to cart'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/h5_Papaya'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_add to cart'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/h5_Rambutan'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_add to cart'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/a_Carts            5'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/span_5'))

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/td_Garden'))

WebUI.setText(findTestObject('user selected products and clicks confirm button/Page_ProjectBackend (1)/input_amount garden'), 
    garde_amount)

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/td_Banana'))

WebUI.setText(findTestObject('user selected products and clicks confirm button/Page_ProjectBackend (1)/input_amount banana'), 
    banana_amount)

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/td_Orange'))

WebUI.setText(findTestObject('user selected products and clicks confirm button/Page_ProjectBackend (1)/input_amount orange'), 
    orange_amount)

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/td_Papaya'))

WebUI.setText(findTestObject('user selected products and clicks confirm button/Page_ProjectBackend (1)/input_amount papaya'), 
    papaya_amount)

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/td_Rambutan'))

WebUI.setText(findTestObject('user selected products and clicks confirm button/Page_ProjectBackend (1)/input_amount rumbutan'), 
    rumbutan_amount)

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/strong_Total price'))

WebUI.verifyElementText(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/p_Total price  40924 THB'), 
    'Total price: 20,462 THB')

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('user clicked at the add to cart button/Page_ProjectBackend (2)/div_Well done You successfully'))

WebUI.closeBrowser()

