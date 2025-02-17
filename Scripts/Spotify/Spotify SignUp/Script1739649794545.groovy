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

WebUI.openBrowser('https://www.google.com/search?')

WebUI.maximizeWindow()

WebUI.delay(2)
// open spotify website
WebUI.navigateToUrl('https://open.spotify.com')
String email  = "wesira7255@owlny.com"


WebUI.delay(1)
// Clicking to signUp and close Cookies 
WebUI.click(findTestObject('Object Repository/Spotify/Page_Spotify - Web Player Music for everyone/button_Cookie Policy_onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon'))

WebUI.click(findTestObject('Object Repository/Spotify/Page_Spotify - Web Player Music for everyone/button_Sign up'))

WebUI.delay(1)
// Steps to signup and login with it

WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_Email address_username'), email)

WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Sign up - Spotify/span_Next'))


WebUI.setText(findTestObject('Object Repository/Spotify/Page_Sign up - Spotify/input_Password_new-password'), '98765432Mo')

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
// search for artist, create playlist and insert in it some songs
WebUI.setText(findTestObject('Object Repository/SpotifyPlayList/Page_Spotify - Web Player Music for everyone/input_What do you want to play_Input-sc-1gbx9xe-0 jlbmaj e-9541-baseline e-9541-form-control encore-text-body-medium CVuGEUIxLkNKpMds8AFS R69APjfNV0o9tAbfrWZf'), '3eesh')
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Spotify  Search/span_3eesh'))
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_3eesh  Spotify/button_Follow'))

WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Lsa Faker  3eesh/Page_3eesh  Spotify/svg_Lsa Faker_Svg-sc-ytk21e-0 dYnaPI e-9541-icon'))
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Lsa Faker  3eesh/Page_3eesh  Spotify/button_Add to playlist'))
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_Lsa Faker  3eesh/Page_3eesh  Spotify/button_New playlist'))
WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/svg_Geet 3aleeky_Svg-sc-ytk21e-0 dYnaPI e-9541-icon'))
WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/button_Add to playlist'))
WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/button_Lsa Faker'))
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_3eesh  Spotify/svg_Kan Nefsy_Svg-sc-ytk21e-0 dYnaPI e-9541-icon'))
WebUI.click(findTestObject('Object Repository/SpotifyPlayList/Page_3eesh  Spotify/button_Add to playlist'))
WebUI.click(findTestObject('Object Repository/lsalsa/Page_3eesh  Spotify/button_Lsa Faker'))
// play the playlist
WebUI.click(findTestObject('Object Repository/lsalsa/Page_Lsa Faker  3eesh/div_Recents_RowButton-sc-xxkq4e-0 fVLjWA'))
WebUI.click(findTestObject('Object Repository/lsalsa/Page_Lsa Faker - playlist by testing  Spotify/span__ButtonInner-sc-14ud5tc-0 bYSZls encore-bright-accent-set e-9541-button-icon-only--large e-9541-button-primary__inner'))

WebUI.delay(50)


