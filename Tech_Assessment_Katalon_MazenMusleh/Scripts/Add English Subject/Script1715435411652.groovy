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

WebUI.mouseOver(findTestObject('Object Repository/Collabse-Expand Menu/Administration Tools_SubMenu'))

WebUI.click(findTestObject('Object Repository/Collabse-Expand Menu/Adminstration_Tab'))

WebUI.click(findTestObject('Add User Page/Parent School_Button'))

WebUI.click(findTestObject('Object Repository/Adminstration Page/Manage Level_Button'))

WebUI.click(findTestObject('Object Repository/Adminstration Page/Edit This School_SubTab'))

WebUI.click(findTestObject('Object Repository/Adminstration Page/Lookups_Tab'))

WebUI.scrollToElement(findTestObject('Adminstration Page/Add Subject_Button'), 0)

WebUI.click(findTestObject('Object Repository/Adminstration Page/Add Subject_Button'))

WebUI.setText(findTestObject('Object Repository/Adminstration Page/Subject Name_TextField'), 'English')

WebUI.click(findTestObject('Object Repository/Adminstration Page/Done_Button'))

WebUI.click(findTestObject('Object Repository/Adminstration Page/Save Subjects_Button'))

WebUI.scrollToPosition(100, 0)

WebUI.click(findTestObject('Object Repository/Adminstration Page/Manage Level_Button'))

WebUI.click(findTestObject('Object Repository/Adminstration Page/Edit This School_SubTab'))

WebUI.click(findTestObject('Object Repository/Adminstration Page/Lookups_Tab'))

WebUI.scrollToElement(findTestObject('Object Repository/Adminstration Page/English Subject_Label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Adminstration Page/English Subject_Label'), 'English')

WebUI.takeElementScreenshotAsCheckpoint('Verify English Subject Added Successfully', findTestObject('Adminstration Page/English Subject_Label'))

WebUI.scrollToElement(findTestObject('Object Repository/Adminstration Page/Cancel Saving_Button'), 0)

WebUI.click(findTestObject('Object Repository/Adminstration Page/Cancel Saving_Button'))

