package com.test.gmail.page;

import org.openqa.selenium.WebDriver;


/**
 * Created by sgop11 on 4/26/2016.
 */
public class GmailLoginPage {
    private Webdriver driver;
    private static final String USER_NAME_INPUT = By.id("Email");
    private static final String USER_PWD_INPUT = By.id("Passwd");
    private static final String SIGN_IN_BUTTON = By.id("signIn");

    private static final String gmailUrl = "https://www.gmail.com";

    public GmailLoginPage(WebDriver driver)
    {
        this.driver = driver;
    }


}
