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

WebUI.click(findTestObject('Object Repository/Collabse-Expand Menu/Roles Permissions_SubMenu'))

WebUI.click(findTestObject('Object Repository/Roles and Permissions Page/Create Custom Role_Button'))

WebUI.setText(findTestObject('Object Repository/Roles and Permissions Page/Role Name_TextField'), 'Co Teacher')

WebUI.setText(findTestObject('Object Repository/Roles and Permissions Page/Role Description_TextArea'), 'Limited Permissions')

WebUI.selectOptionByValue(findTestObject('Object Repository/Roles and Permissions Page/Select Role Category_List'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Roles and Permissions Page/Select Role Level_List'), 
    '2: 3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Roles and Permissions Page/Copy Permissions From_List'), 
    '3: 570', true)

WebUI.click(findTestObject('Object Repository/Roles and Permissions Page/Sub Schools Permissions_CheckBox'))

WebUI.click(findTestObject('Object Repository/Roles and Permissions Page/Next_Button'))

WebUI.click(findTestObject('Object Repository/Roles and Permissions Page/Save_Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Roles and Permissions Page/Custom Role Added Successfully_Message'), 
    'custom role added successfully')

WebUI.takeElementScreenshotAsCheckpoint('Custom Role Added Successfully Message', findTestObject('Roles and Permissions Page/Custom Role Added Successfully_Message'))

WebUI.scrollToElement(findTestObject('Object Repository/Roles and Permissions Page/Co Teacher_Label'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Roles and Permissions Page/Co Teacher_Label'), 'Co Teacher')

WebUI.takeElementScreenshotAsCheckpoint('Co Teacher Added Successfully', findTestObject('Roles and Permissions Page/Co Teacher_Label'))

