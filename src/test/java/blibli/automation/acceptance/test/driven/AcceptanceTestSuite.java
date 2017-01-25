package blibli.automation.acceptance.test.driven;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    public AcceptanceTestSuite() {
    }

    @Override
    public List<String> storyPaths() {
        List<String> storyList = new ArrayList<>();
        storyList.add("stories/SignUpStory.story");
        storyList.add("stories/ShoppingStory.story");
        storyList.add("stories/CheckoutStory.story");
        return storyList;
    }
}
