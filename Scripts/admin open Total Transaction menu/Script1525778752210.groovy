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

WebUI.setText(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/input_username'), username)

WebUI.setText(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/input_password'), password)

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/button_Login'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/a_Total Transaction'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_1'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_20120 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_2'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Banana Garden Banana Rambut'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_60570 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_3'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_4'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40462 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_5'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_6'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_7'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_8'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_9'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_10'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_Garden Banana Orange Papaya'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/td_40924 THB'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/strong_Total price'))

WebUI.click(findTestObject('admin open Total Transaction menu/Page_ProjectBackend (1)/p_Total price  407620 THB'))

WebUI.closeBrowser()

