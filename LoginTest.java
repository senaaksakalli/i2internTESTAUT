package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class LoginTest {
    public static void main(String[] args) {
        // Otomatik chromedriver kurulumu
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {
            // Test edilecek site (gerçek çalışan demo site)
            driver.get("https://www.saucedemo.com/");

            // Kullanıcı adı ve şifre gir
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            // Login butonuna tıkla
            driver.findElement(By.id("login-button")).click();

            // Başarılı giriş kontrolü
            if (driver.getCurrentUrl().contains("inventory.html")) {
                System.out.println("Giriş başarılı!");
            } else {
                System.out.println("Giriş başarısız.");
            }

            // 8 saniye bekle ki ekran görüntüsü alabilelim veya sayfayı görebilelim
            Thread.sleep(8000);

            // Ekran görüntüsü al
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("login_screenshot.png"));
            System.out.println("Ekran görüntüsü kaydedildi.");

            // Program bitmeden önce enter'a basılmasını bekleyelim (isteğe bağlı)
            System.out.println("Test tamamlandı, kapatmak için Enter'a basınız...");
            System.in.read();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Test sonunda tarayıcıyı kapat
            driver.quit();
        }
    }
}
