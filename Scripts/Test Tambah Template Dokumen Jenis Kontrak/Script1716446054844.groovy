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

WebUI.navigateToUrl('http://10.7.1.169/')

WebUI.setText(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8'), 
    'admin')

WebUI.takeFullPageScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_141562'), 
    'RAIVpflpDOg=')

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Baru'))

WebUI.takeFullPageScreenshot()

WebUI.selectAllOption(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/select_jenis2                      jenis3  _1c7d25'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_DOKUMEN_text-sm text-color p-2 border_7eae0b'), 
    '17')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_DOKUMEN_text-sm text-color p-2 border_114c4d'), 
    'Dokumen Pribadi')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Test Tambah Template Dokumen Jenis Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.takeFullPageScreenshot()

