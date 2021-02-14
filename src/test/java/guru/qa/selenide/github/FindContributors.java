package guru.qa.selenide.github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindContributors {

  @Test
  void firstContributorShouldBeSolntsev(){

    open("https://github.com/selenide/selenide");

    SelenideElement blockContributers=$(".BorderGrid")
            .$(byText("Contributors"));
    blockContributers.closest("div")
            .$("ul li").hover();
    $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

  }
  
}
