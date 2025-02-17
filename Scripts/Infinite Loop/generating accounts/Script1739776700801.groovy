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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

int emailNumber = 6275  // Starting email number
String baseEmail = "wesira"
String emailDomain = "@owlny.com"
String password = "98765432Mo"
boolean infiniteLoop = true

while (infiniteLoop) {
	WebUI.openBrowser('https://open.spotify.com')
	WebUI.maximizeWindow()
	WebUI.delay(2)
	
	// Close cookie pop-up
	WebUI.click(findTestObject('Object Repository/Spotify/Page_Spotify - Web Player Music for everyone/button_Cookie Policy_onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon'))
	
	String email = baseEmail + emailNumber + emailDomain
	println("Current email number: " + emailNumber) // Print the current email number
	
	WebUI.delay(2)
	
	// Click sign-up
WebUI.click(findTestObject('Object Repository/Spotify/Page_Spotify - Web Player Music for everyone/button_Sign up'))
	WebUI.delay(1)
	
	// Fill registration form
	WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_Email address_username'), email)
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Sign up - Spotify/span_Next'))
	WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_Password_new-password'),  password)
	WebUI.click(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/span_Next'))


WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_This name will appear on your profile_displayName'), 'testing')

WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_Learn more_day'), '14')

WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_Learn more_year'), '2000')

WebUI.delay(1)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/select_MonthJanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 'March', false)

WebUI.click(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/span_We use your gender to help personalize our content recommendations and ads for you_Indicator-sc-hjfusp-0 jRuGOG'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/span_Next'))

WebUI.click(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/span_Sign up'))
WebUI.delay(1)
	
	// Search for artist and play song
WebUI.setText(findTestObject('Object Repository/SpotifyPlayList/Page_Spotify - Web Player Music for everyone/input_What do you want to play_Input-sc-1gbx9xe-0 jlbmaj e-9541-baseline e-9541-form-control encore-text-body-medium CVuGEUIxLkNKpMds8AFS R69APjfNV0o9tAbfrWZf'), '3eesh')
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Spotify  Search/span_3eesh'))
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_3eesh  Spotify/button_Follow'))
	WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/Page_3eesh  Spotify/span_Verified Artist_ButtonInner-sc-14ud5tc-0 bYSZls encore-bright-accent-set e-9541-button-icon-only--large e-9541-button-primary__inner'))
	
	WebUI.delay(20)
	
	// Logout
	WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/Page_3eesh  Spotify/Page_3eesh  Spotify/span_T'))
	WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/Page_3eesh  Spotify/Page_3eesh  Spotify/span_Log out'))
	WebUI.delay(2)
	
	// Increment email number
	emailNumber++
}

