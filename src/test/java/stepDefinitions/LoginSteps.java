package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @When("^I clieck login button$")
    public void i_clieck_login_button(){
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
    }

    @Then("^I should login$")
    public void i_should_login(){

    }

}
