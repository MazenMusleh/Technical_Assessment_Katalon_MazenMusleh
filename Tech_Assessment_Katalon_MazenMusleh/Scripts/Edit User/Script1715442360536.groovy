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

WebUI.click(findTestObject('Object Repository/Edit User Page/Manage Activate Users_Button'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Edit User_Button'))

WebUI.verifyElementText(findTestObject('Edit User Page/Edit User_Label'), 'Edit User')

WebUI.takeElementScreenshotAsCheckpoint('Window displayed in edit mode', findTestObject('Edit User Page/Edit User_Label'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit User Page/User Name_Label'), findTestData('User Data File').getValue(
        3, 1))

WebUI.verifyElementText(findTestObject('Object Repository/Edit User Page/User Email_Label'), findTestData('User Data File').getValue(
        4, 1))

WebUI.click(findTestObject('Object Repository/Edit User Page/Add Role_Button'))

WebUI.click(findTestObject('Object Repository/Edit User Page/School Name_List'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Parent School_Option'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit User Page/Roles_List'), 'Co Teacher', false)

WebUI.scrollToElement(findTestObject('Object Repository/Edit User Page/Select Subject_Button'), 0)

WebUI.click(findTestObject('Object Repository/Edit User Page/Select Subject_Button'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Mathematics_Option'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Add Role_Area'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Save Role_button'))

WebUI.verifyElementPresent(findTestObject('Edit User Page/Co Teacher Role_Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit User Page/Save User Edit_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Home Page (LMS Now)/Success Popup_Message1'), 'Successfully is updated')

WebUI.verifyElementText(findTestObject('Object Repository/Home Page (LMS Now)/Success Popup_Message2'), 'User is updated successfully')

WebUI.click(findTestObject('Object Repository/Edit User Page/Manage Activate Users_Button'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Edit User_Button'))

WebUI.verifyElementPresent(findTestObject('Edit User Page/Co Teacher Role_Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeElementScreenshotAsCheckpoint('Co Teacher Added Successfully', findTestObject('Edit User Page/Co Teacher Role_Label'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit User Page/Cancel_Button'))

WebUI.click(findTestObject('Object Repository/Edit User Page/Popup Ok_Button'))

