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

WebUI.setText(findTestObject('admin total transaction/input_username'), admin_username)

WebUI.setText(findTestObject('admin total transaction/input_password'), admin_password)

WebUI.sendKeys(findTestObject('admin total transaction/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('admin total transaction/a_Total Transaction'))

WebUI.delay(5)

//WebUI.click(findTestObject('admin total transaction/p_Total price old admin'))
def oldTotalPrice = WebUI.getText(findTestObject('admin total transaction/p_Total price old admin')).replaceAll('Total price: ', 
    '').replaceAll(' THB', '')

println(oldTotalPrice)

WebUI.click(findTestObject('admin total transaction/button_Logout'))

WebUI.setText(findTestObject('admin total transaction/input_username'), user_username)

WebUI.setText(findTestObject('admin total transaction/input_password'), user_password)

WebUI.click(findTestObject('admin total transaction/button_Login'))

WebUI.click(findTestObject('admin total transaction/button_add to cart'))

WebUI.click(findTestObject('admin total transaction/button_add to cart'))

WebUI.click(findTestObject('admin total transaction/button_add to cart'))

WebUI.click(findTestObject('admin total transaction/button_add to cart'))

WebUI.click(findTestObject('admin total transaction/button_add to cart'))

WebUI.click(findTestObject('admin total transaction/a_Carts            5'))

WebUI.click(findTestObject('admin total transaction/span_5'))

WebUI.delay(5)

def userTotalPrice = WebUI.getText(findTestObject('admin total transaction/p_Total price user')).replaceAll('Total price: ', 
    '').replaceAll(' THB', '')

println(userTotalPrice)

WebUI.click(findTestObject('admin total transaction/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('admin total transaction/div_Well done You successfully'))

WebUI.click(findTestObject('admin total transaction/button_Logout'))

WebUI.setText(findTestObject('admin total transaction/input_username'), admin_username)

WebUI.setText(findTestObject('admin total transaction/input_password'), admin_password)

WebUI.click(findTestObject('admin total transaction/button_Login'))

WebUI.click(findTestObject('admin total transaction/a_Total Transaction'))

WebUI.delay(5)

def newTotalPrice = WebUI.getText(findTestObject('admin total transaction/p_Total price new admin')).replaceAll('Total price: ', 
    '').replaceAll(' THB', '')

println(newTotalPrice)

WebUI.verifyEqual(Integer.parseInt(userTotalPrice.replaceAll(',', '')) + Integer.parseInt(oldTotalPrice.replaceAll(',', 
            '')), Integer.parseInt(newTotalPrice.replaceAll(',', '')))

WebUI.closeBrowser()

