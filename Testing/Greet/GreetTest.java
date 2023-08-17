import org.junit.*;
public class GreetTest {
  @Test
  public void Given_Greet_Object_When_Says_Then_Return_Expected_Result(){

    // Arrange
    Greet gre = new Greet();
    
    // Act
    String result = gre.says();
    // Assert
    Assert.assertEquals("Hello", result);
  }
}