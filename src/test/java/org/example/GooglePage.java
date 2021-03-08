package org.example;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebDriver;

@Location("https://www.google.com")
public class GooglePage {

    @Drone
    WebDriver driver;

    public String getTitle() {
        return driver.getTitle();
    }
}
