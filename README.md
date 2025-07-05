# i2internTESTAUT
# SeleniumLoginTest

Bu proje i2i system intern projesi kapsamında  Selenium ve Java kullanarak bir e-ticaret sitesine otomatik giriş yapan basit bir test uygulaması olarak geliştirilmiştir.

---

## Proje Açıklaması

- **Amaç:** Selenium WebDriver kullanarak otomatik test ile `https://www.saucedemo.com/` sitesine giriş yapmak.
- **Teknolojiler:** Java, Selenium WebDriver, WebDriverManager, Apache Commons IO
- **Yapılanlar:**
  - ChromeDriver kurulumu `WebDriverManager` ile otomatik yapıldı.
  - Kullanıcı adı ve şifre alanlarına otomatik değer girildi.
  - Login butonuna tıklanarak giriş işlemi gerçekleştirildi.
  - Girişin başarılı olup olmadığı URL kontrolü ile doğrulandı.
  - Başarılı giriş sonrası ekran görüntüsü alındı ve proje klasörüne `login_screenshot.png` olarak kaydedildi.
  - Programın hemen kapanmaması için kullanıcıdan **Enter** tuşuna basması beklendi.

