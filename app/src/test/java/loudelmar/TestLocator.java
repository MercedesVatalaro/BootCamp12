package loudelmar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLocator {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Registra')]")
    WebElement btnRegistrarse;

    @BeforeAll
    static void preparacionClase(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void preTests(){
        driver = new ChromeDriver();
        PageFactory.initElements(driver,this);
        driver.get("https://open.spotify.com/");

        //Maximizar page
        driver.manage().window().maximize();
    }

    @Test
    void testEjemploSpotify(){
        //Aqui crearemos el test
        btnRegistrarse.click();
    }

    @AfterEach
    void posTests(){
        //driver.close();
    }
}
