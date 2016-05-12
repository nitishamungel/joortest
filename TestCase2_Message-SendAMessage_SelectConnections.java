package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2MessageSendAMessageSelectConnections {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://staging.joordev.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCase2MessageSendAMessageSelectConnections() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("qatest1");
    driver.findElement(By.id("login-pw")).clear();
    driver.findElement(By.id("login-pw")).sendKeys("qatest1");
    driver.findElement(By.xpath("//input[@value='Sign In']")).click();
    driver.findElement(By.linkText("Messages")).click();
    driver.findElement(By.linkText("Send a Message")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Select Connections".equals(driver.findElement(By.xpath("//form[@id='MessageSendForm']/span/div/label[2]")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Select Connections", driver.findElement(By.xpath("//form[@id='MessageSendForm']/span/div/label[2]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Subject".equals(driver.findElement(By.cssSelector("span.text-3.uppercase > label")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Subject", driver.findElement(By.cssSelector("span.text-3.uppercase > label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("MessageSubject")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("", driver.findElement(By.id("MessageSubject")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Message".equals(driver.findElement(By.xpath("//form[@id='MessageSendForm']/div[4]/span/label")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Message", driver.findElement(By.xpath("//form[@id='MessageSendForm']/div[4]/span/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("MessageBody")).getAttribute("value"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("", driver.findElement(By.id("MessageBody")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Attach an image (optional) (.jpg or .png, 4MB max)".equals(driver.findElement(By.cssSelector("div.input.file > span.text-3.uppercase > label")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Attach an image (optional) (.jpg or .png, 4MB max)", driver.findElement(By.cssSelector("div.input.file > span.text-3.uppercase > label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("".equals(driver.findElement(By.id("MessageAttachmentUpload")).getAttribute("value"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("", driver.findElement(By.id("MessageAttachmentUpload")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.linkText("Send"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Send", driver.findElement(By.linkText("Send")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("MessageSendToSelectConnections")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("Recipient(s) Use the autocomplete to add recipients.".equals(driver.findElement(By.cssSelector("label.text-3.uppercase")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("Use the autocomplete to add recipients.", driver.findElement(By.cssSelector("span.regularcase.j-message-recipients")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Send")).click();
    assertEquals("Your message could not be sent.  Please check your recipients list and try again.", closeAlertAndGetItsText());
    driver.findElement(By.name("recipient")).clear();
    driver.findElement(By.name("recipient")).sendKeys("abc");
    driver.findElement(By.linkText("Send")).click();
    assertEquals("Your message could not be sent.  Please check your recipients list and try again.", closeAlertAndGetItsText());
    driver.findElement(By.name("recipient")).clear();
    driver.findElement(By.name("recipient")).sendKeys("joor ( NMD ) - New York, NY");
    driver.findElement(By.id("MessageAttachmentUpload")).clear();
    driver.findElement(By.id("MessageAttachmentUpload")).sendKeys("C:\\Users\\nitu\\Desktop\\QATest(1).pdf");
    driver.findElement(By.linkText("Send")).click();
    assertEquals("Unknown file extension", closeAlertAndGetItsText());
    driver.findElement(By.id("MessageAttachmentUpload")).clear();
    driver.findElement(By.id("MessageAttachmentUpload")).sendKeys("C:\\Users\\nitu\\Desktop\\joor1.jpg");
    driver.findElement(By.linkText("Send")).click();
    driver.findElement(By.linkText("Messages")).click();
    driver.findElement(By.linkText("Send a Message")).click();
    driver.findElement(By.id("MessageSendToAllConnections")).click();
    driver.findElement(By.id("MessageAttachmentUpload")).clear();
    driver.findElement(By.id("MessageAttachmentUpload")).sendKeys("C:\\Users\\nitu\\Desktop\\joor2.png");
    driver.findElement(By.linkText("Send")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Close\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
    try {
      assertEquals("Regress Java", driver.findElement(By.cssSelector("div.designer_dropdown_name")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Logout", driver.findElement(By.linkText("Logout")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Logout")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
