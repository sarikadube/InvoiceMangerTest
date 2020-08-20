package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public WebDriver driver;
    @Given("^The web page url \"([^\"]*)\"$")
    public void the_web_page_url(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);

    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String username){
        driver.findElement(By.id("inputEmail")).sendKeys(username);

    }

    @When("^I  enter password  \"([^\"]*)\"$")
    public void i_enter_password(String password){
        driver.findElement(By.id("inputPassword")).sendKeys(password);
    }

    @When("^I click login button$")
    public void i_clieck_login_button(){
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^i enter url \"([^\"]*)\"$")
    public void i_enter_url(String url)  {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @When("^user cliks on the drop down \"([^\"]*)\"$")
    public void user_cliks_on_the_drop_down(String cusromer)  {
       driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[4]/a")).click();
        // Click List custmor
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"customers_index\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Click on + add user

        //Thread.sleep(5000);
        //driver.quit();


    }


//    @When("^user clicks on \"([^\"]*)\"$")
//    public void user_clicks_on(String arg1)  {
//        driver.findElement(By.id("customers_index")).click();
//
//
//    }

    @When("^add user for firt customer$")
    public void add_user_for_firt_customer()  {

        driver.findElement(By.xpath("//*[@id=\"fileData\"]/tbody/tr[1]/td[7]/center/div/a[2]/i")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^user enter first name \"([^\"]*)\"$")
    public void user_enter_first_name(String firstname)  {
        driver.findElement(By.id("first_name")).sendKeys(firstname);


    }

    @When("^user enter last name \"([^\"]*)\"$")
    public void user_enter_last_name(String lastname)  {
        driver.findElement(By.id("last_name")).sendKeys(lastname);

    }

    @When("^user enter phone number\"([^\"]*)\"$")
    public void user_enter_phone_number(String phonenumber)  {
        driver.findElement(By.id("phone")).sendKeys(phonenumber);

    }

    @When("^user enter email id \"([^\"]*)\"$")
    public void user_enter_email_id(String emailid)  {
        driver.findElement(By.id("email")).sendKeys(emailid);
    }

    @When("^user enter password \"([^\"]*)\"$")
    public void user_enter_password(String password)  {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("^user confirm password\"([^\"]*)\"$")
    public void user_confirm_password(String confirmpassword)  {
        driver.findElement(By.id("password_confirm")).sendKeys(confirmpassword);

    }
    @When("^user click on Add User$")
    public void user_click_on_Add_User()  {
        driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/input")).click();


    }

}
