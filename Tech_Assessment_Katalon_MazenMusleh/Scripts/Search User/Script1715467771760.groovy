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

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Search Page/Filter By_Button'))

WebUI.setText(findTestObject('Object Repository/Search Page/Search User_TextField'), findTestData('User Data File').getValue(
        3, 1))

WebUI.click(findTestObject('Object Repository/Search Page/Search_Icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Page/User Name_Label'), findTestData('User Data File').getValue(
        3, 1))

WebUI.verifyElementText(findTestObject('Object Repository/Search Page/User Email_Label'), findTestData('User Data File').getValue(
        4, 1))

WebUI.takeElementScreenshotAsCheckpoint('Name and Email Appear in Table While Search By Name', findTestObject('Search Page/User Name and Email_TextArea'))

WebUI.scrollToPosition(100, 0)

WebUI.setText(findTestObject('Object Repository/Search Page/Search User_TextField'), findTestData('User Data File').getValue(
        4, 1))

WebUI.click(findTestObject('Object Repository/Search Page/Search_Icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Search Page/User Name_Label'), findTestData('User Data File').getValue(
        3, 1))

WebUI.verifyElementText(findTestObject('Object Repository/Search Page/User Email_Label'), findTestData('User Data File').getValue(
        4, 1))

WebUI.takeElementScreenshotAsCheckpoint('Name and Email Appear in Table While Search By Email', findTestObject('Search Page/User Name and Email_TextArea'))

