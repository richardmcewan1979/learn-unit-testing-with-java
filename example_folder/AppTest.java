import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    App app;

    @BeforeEach
    void init() {
        App app = new App();
    }

    @Test
    @DisplayName("This is a helpful display name")
    void main() {
    }

    @Test
    void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("fizzBuzzShouldReturnNumberPassedToIt")
    void fizzBuzzShouldReturnNumberPassedToIt() {
        App app = new App();
        Assertions.assertEquals(1, app.fizzBuzz(1));
    }

    @Test
    @DisplayName("fizzBuzzWithNumberLessThanOne")
    void fizzBuzzWithNumberLessThanOne() {
        App app = new App();
        Assertions.assertEquals(-1, app.fizzBuzz(0));
        Assertions.assertEquals(-1, app.fizzBuzz(-1));
        Assertions.assertEquals(-1, app.fizzBuzz(-2));
    }

    @Test
    @DisplayName("fizzIfNumberDivisibleByThreeReturnZero")
    void fizzIfNumberDivisibleByThreeReturnZero() {
        App app = new App();
        Assertions.assertEquals(0, app.fizzBuzz(3));
        Assertions.assertEquals(0, app.fizzBuzz(6));
        Assertions.assertEquals(0, app.fizzBuzz(21));
    }

    @Test
    @DisplayName("buzzIfNumberDivisibleByFiveReturnZero")
    void buzzIfNumberDivisibleByFiveReturnZero() {
        App app = new App();
        Assertions.assertEquals(0, app.fizzBuzz(5));
        Assertions.assertEquals(0, app.fizzBuzz(20));
        Assertions.assertEquals(0, app.fizzBuzz(50));
    }

    @Test
    @DisplayName("fizzBuzzIfNumberDivisibleByBothThreeAndFiveReturnZero")
    void fizzBuzzIfNumberDivisibleByBothThreeAndFiveReturnZero() {
        App app = new App();
        Assertions.assertEquals(-2, app.fizzBuzz(15));
        Assertions.assertEquals(-2, app.fizzBuzz(30));
        Assertions.assertEquals(-2, app.fizzBuzz(60));
    }

    @Test
    @DisplayName("fizzBuzzLessThanOne")
    void fizzBuzzLessThanOne() {
        App app = new App();
        Assertions.assertEquals("invalid value less than one", app.fizzBuzzStringOutPut(-1));
        Assertions.assertEquals("invalid value less than one", app.fizzBuzzStringOutPut(0));
    }

    @Test
    @DisplayName("fizzBuzzOutputStringOnThreeOnly")
    void fizzBuzzOutputStringOnThreeOnly() {
        App app = new App();
        Assertions.assertEquals("fizz", app.fizzBuzzStringOutPut(3));
        Assertions.assertEquals("fizz", app.fizzBuzzStringOutPut(6));
        Assertions.assertNotEquals("fizz", app.fizzBuzzStringOutPut(2));
        Assertions.assertNotEquals("fizz", app.fizzBuzzStringOutPut(15));
    }

    @Test
    @DisplayName("fizzBuzzOutputStringOnFiveOnly")
    void fizzBuzzOutputStringOnFiveOnly() {
        App app = new App();
        Assertions.assertEquals("buzz", app.fizzBuzzStringOutPut(5));
        Assertions.assertEquals("buzz", app.fizzBuzzStringOutPut(10));
        Assertions.assertNotEquals("buzz", app.fizzBuzzStringOutPut(3));
        Assertions.assertNotEquals("buzz", app.fizzBuzzStringOutPut(15));
    }

    @Test
    @DisplayName("fizzBuzzOutputStringOnThreeAndFiveOnly")
    void fizzBuzzOutputStringOnThreeAndFiveOnly() {
        App app = new App();
        Assertions.assertEquals("fizz buzz", app.fizzBuzzStringOutPut(15));
        Assertions.assertEquals("fizz buzz", app.fizzBuzzStringOutPut(30));
        Assertions.assertNotEquals("fizz buzz", app.fizzBuzzStringOutPut(21));
        Assertions.assertNotEquals("fizz buzz", app.fizzBuzzStringOutPut(25));
        Assertions.assertNotEquals("fizz buzz", app.fizzBuzzStringOutPut(20));
        Assertions.assertNotEquals("fizz buzz", app.fizzBuzzStringOutPut(17));
    }

    @Test
    @DisplayName("noFizzBuzzOnNumbersNotDivisibleByThreeOrFive")
    void noFizzBuzzOnNumbersNotDivisibleByThreeOrFive() {
        App app = new App();
        Assertions.assertEquals("1", app.fizzBuzzStringOutPut(1));
        Assertions.assertEquals("7", app.fizzBuzzStringOutPut(7));
        Assertions.assertEquals("11", app.fizzBuzzStringOutPut(11));
        Assertions.assertEquals("101", app.fizzBuzzStringOutPut(101));
    }

    @Test
    @DisplayName("testBoundariesOfForLoop")
    void testBoundariesOfForLoop() {
        App app = new App();
        String output = app.printNumber(0);
        Assertions.assertEquals("invalid value fed to print less than one", output);
    }

    @Test
    @DisplayName("I need to work out how to run parametric test on for loop")
    void iNeedToWorkOutHowToRunParametricTestOnForLoop() {
        org.junit.jupiter.api.Assertions.fail("Not implemented");
    }

}
