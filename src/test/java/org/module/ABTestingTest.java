package org.module;

import org.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.pages._HomePage;


@DisplayName("Testing ABTesting Page")
public class ABTestingTest extends BaseTest {
    @Test
    @DisplayName("C001: ABTesting page - Text validation")
    public void testValidationText(){
        String message = new _HomePage(driver).clickABTesting().getText();
        Assertions.assertEquals(
                "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).", message);
    }
}
