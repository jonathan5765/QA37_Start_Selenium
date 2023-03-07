import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        List<WebElement> list = wd.findElements(By.cssSelector("div"));
        List<WebElement> list1 = wd.findElements(By.tagName("div"));

        WebElement el = wd.findElement(By.tagName("h1"));
        WebElement el1 = wd.findElement(By.cssSelector("h1"));

        WebElement elem = wd.findElement(By.tagName("a"));
        WebElement elem1 = wd.findElement(By.cssSelector("a"));

        List<WebElement> l = wd.findElements(By.tagName("a"));
        List<WebElement> l1 = wd.findElements(By.cssSelector("a"));

        WebElement f = wd.findElement(By.tagName("form"));
        WebElement f2 = wd.findElement(By.cssSelector("form"));

        WebElement inp = wd.findElement(By.tagName("input"));
        WebElement inp1 = wd.findElement(By.cssSelector("input"));
        WebElement br = wd.findElement(By.tagName("br"));
        WebElement br1 = wd.findElement(By.cssSelector("br"));
        WebElement b = wd.findElement(By.tagName("button"));
        WebElement b1 = wd.findElement(By.cssSelector("button"));

        //by class
        WebElement cont = wd.findElement(By.className("container"));
        WebElement cont1 = wd.findElement(By.cssSelector(".container"));

        WebElement navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbar1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement act = wd.findElement(By.className("active"));
        WebElement act1 = wd.findElement(By.cssSelector(".active"));

        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by id
        WebElement id = wd.findElement(By.id("root"));
        WebElement id1 = wd.findElement(By.cssSelector("#root"));

        //by name
        WebElement nameEmail = wd.findElement(By.name("email"));
        WebElement nameEmail1 = wd.findElement(By.cssSelector("[name='email']"));

        WebElement namePassword = wd.findElement(By.name("password"));
        WebElement namePassword1 = wd.findElement(By.cssSelector("[name='password']"));

        WebElement nameLogin = wd.findElement(By.name("login"));
        WebElement nameLogin1 = wd.findElement(By.cssSelector("[name='login']"));

        WebElement nameReg = wd.findElement(By.name("registration"));
        WebElement nameReg1 = wd.findElement(By.cssSelector("[name='registration']"));

        //by attribute
        //WebElement data = wd.findElement(By.cssSelector("[data-new-gr-c-s-check-loaded='14.1098.0']"));
        WebElement home = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement about = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement log = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement p = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputPassword = wd.findElement(By.cssSelector("[placeholder='Password']"));

        //start
        WebElement inpPsw = wd.findElement(By.cssSelector("[placeholder ^= 'Pa']"));
        //end
        WebElement inpPsw1 = wd.findElement(By.cssSelector("[placeholder $= 'ord']"));
        //center
        WebElement inpPsw2 = wd.findElement(By.cssSelector("[placeholder *= 'ss']"));

       








    }
}
