import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    options objUi = new options();
    @Given("Handle dropdowns")
    public void handleDropdowns() {
        objUi.Main();
    }

    @When("select options")
    public void selectOptions() throws InterruptedException {
        objUi.book();
    }


}
