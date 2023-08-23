import org.junit.*;

public class DigitDegreeTest {
  
  @Test
  public void Given_DigitDegree_Object_When_getDigitDegree_Then_Return_SecondDegree() {

    // Arrange
    DigitDegree digDegree = new DigitDegree();
    
    // Act
    int result = digDegree.getDigitDegree(5527);

    // Assert
    Assert.assertEquals(2, result);
  }

  @Test
  public void Given_DigitDegree_Object_When_getDigitDegree_Then_Return_FirstDegree() {

    // Arrange
    DigitDegree digDegree = new DigitDegree();
    
    // Act
    int result = digDegree.getDigitDegree(58);

    // Assert
    Assert.assertEquals(1, result);
  }
}
