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

WebUI.mouseOver(findTestObject('Collabse-Expand Menu/Administration Tools_SubMenu'))

WebUI.click(findTestObject('Collabse-Expand Menu/Adminstration_Tab'))

WebUI.click(findTestObject('Object Repository/Add User Page/Parent School_Button'))

WebUI.click(findTestObject('Object Repository/Add User Page/Add Users_List'))

WebUI.click(findTestObject('Object Repository/Add User Page/Add User_Button'))

WebUI.setText(findTestObject('Object Repository/Add User Page/User FirstName_TextField'), findTestData('User Data File').getValue(
        1, 1))

WebUI.setText(findTestObject('Object Repository/Add User Page/User LastName_TextField'), findTestData('User Data File').getValue(
        2, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add User Page/Languages_List'), 'string:en', true)

WebUI.setText(findTestObject('Object Repository/Add User Page/User Email_TextField'), findTestData('User Data File').getValue(
        4, 1))

WebUI.click(findTestObject('Object Repository/Add User Page/Set Password_RadioButton'))

WebUI.setEncryptedText(findTestObject('Object Repository/Add User Page/User Password_TextField'), '+uAi5TIr8h2LixnDdUIaKg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Add User Page/User Confirm Password_TextField'), '+uAi5TIr8h2LixnDdUIaKg==')

WebUI.click(findTestObject('Object Repository/Add User Page/Show Password_Icon'))

WebUI.click(findTestObject('Object Repository/Add User Page/Select Subject_Button'))

WebUI.click(findTestObject('Object Repository/Add User Page/English Subject_Option'))

WebUI.setText(findTestObject('Object Repository/Add User Page/Emergency Number_TextField'), '0123456789')

WebUI.setText(findTestObject('Object Repository/Add User Page/Text_TextArea'), 'Test Add User')

WebUI.scrollToElement(findTestObject('Object Repository/Add User Page/Select List_Button'), 0)

WebUI.click(findTestObject('Object Repository/Add User Page/Select List_Button'))

WebUI.click(findTestObject('Object Repository/Add User Page/L1_Option'))

WebUI.click(findTestObject('Object Repository/Add User Page/L2_Option'))

WebUI.click(findTestObject('Object Repository/Add User Page/English Date_DatePicker'))

WebUI.click(findTestObject('Object Repository/Add User Page/Selected Date_Button'))

WebUI.scrollToElement(findTestObject('Object Repository/Add User Page/Save_Button'), 0)

WebUI.click(findTestObject('Object Repository/Add User Page/Save_Button'))

WebUI.verifyElementText(findTestObject('Home Page (LMS Now)/Success Popup_Message1'), 'Successfully is added')

WebUI.takeElementScreenshotAsCheckpoint('Successfully is added Message Appeared', findTestObject('Home Page (LMS Now)/Success Popup_Message1'))

WebUI.verifyElementText(findTestObject('Home Page (LMS Now)/Success Popup_Message2'), 'User is added successfully')

WebUI.takeElementScreenshotAsCheckpoint('User is added successfully Message Appeared', findTestObject('Home Page (LMS Now)/Success Popup_Message2'))

