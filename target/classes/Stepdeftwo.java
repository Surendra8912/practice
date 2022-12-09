import io.cucumber.java.en.Given;

public class Stepdeftwo {
    Newwin Popin = new Newwin();
    @Given("handle popups")
    public void handlePopups() {
        Popin.Main();
    }
}
