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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://swinji.azurewebsites.net/Account/Login')

WebUI.setText(findTestObject('Login Page/E-mail Address_TextField'), 'adminmomen@mailinator.com')

WebUI.setEncryptedText(findTestObject('Login Page/Password_TextField'), '+uAi5TIr8h2LixnDdUIaKg==')

WebUI.click(findTestObject('Object Repository/Login Page/Show Password_Icon'))

WebUI.click(findTestObject('Login Page/Remember Me_CheckBox'))

WebUI.click(findTestObject('Object Repository/Login Page/Login_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Home Page (LMS Now)/LMS_Label'), 'LMS')

WebUI.mouseOver(findTestObject('Object Repository/Collabse-Expand Menu/Profile_SubMenu'))

WebUI.verifyElementText(findTestObject('Object Repository/Collabse-Expand Menu/User Name_Label'), 'T.Moomen Admin')

WebUI.takeElementScreenshotAsCheckpoint('User Name Appeared Successfully', findTestObject('Collabse-Expand Menu/User Name_Label'))

WebUI.verifyElementText(findTestObject('Object Repository/Collabse-Expand Menu/Log Out_Button'), 'LOG OUT')

WebUI.takeElementScreenshotAsCheckpoint('Log Out Button Appeard Successfully', findTestObject('Collabse-Expand Menu/Log Out_Button'))

