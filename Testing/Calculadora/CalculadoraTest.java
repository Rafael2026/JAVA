import org.junit.*;

public class CalculadoraTest {

  @Test
  //@ParameterizedTest
  //@ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
  public void Given_Calculadora_Object_When_Sumar_Then_Return_Expected_Result() {

    // Arrange
    Calculadora suma = new Calculadora();

    int sumando1 = 4;
    int sumando2 = 6;

    // Act
    int result = suma.sumar(sumando1, sumando2);
    
    // Assert
    Assert.assertEquals(10, result);
  }

  @Test
  public void Given_Calculadora_Object_When_Restar_Then_Return_Expected_Result() {

    // Arrange
    Calculadora resta = new Calculadora();

    // Act
    int result = resta.restar(20, 12);
    
    // Assert
    Assert.assertEquals(8, result);
  }

  @Test
  public void Given_Calculadora_Object_When_Multiplicar_Then_Return_Expected_Result() {

    // Arrange
    Calculadora producto = new Calculadora();

    // Act
    int result = producto.multiplicar(14, 14);
    
    // Assert
    Assert.assertEquals(196, result);
  }

  @Test
  public void Given_Calculadora_Object_When_Dividir_Then_Return_Expected_Result()  throws Exception {

    // Arrange
    Calculadora division = new Calculadora();

    // Act
    int result = division.dividir(72, 24);
    
    // Assert
    Assert.assertEquals(3, result);
    Assert.assertThrows(Exception.class, () -> division.dividir(72, 24));
  }

  @Test
  public void Given_Calculadora_Object_When_DividirDecimal_Then_Return_Expected_Result() throws Exception {

    // Arrange
    Calculadora division = new Calculadora();
    
    // Act&& Assert
    Exception ex = Assert.assertThrows(Exception.class, () -> division.dividir(15.0, 4.0));
    //Assert.assertEquals("You can't divide by zero", ex.getMessage());
  }

  @Test
  public void Given_Calculadora_Object_When_IntegerRange_Then_Return_Expected_Result() throws Exception {

    // Arrange
    Calculadora division = new Calculadora();
    
    // Act && Assert
    Exception ex = Assert.assertThrows(Exception.class, () -> division.dividir(2147483647+1, 1));
    //Assert.assertEquals("You can't divide by zero", ex.getMessage());
  }

  @Test
  public void Given_Calculadora_Object_When_DivideByZero_Then_Return_Exception() {

    // Arrange
    Calculadora division = new Calculadora();
    
    // Act && Assert
    Exception ex = Assert.assertThrows(Exception.class, () -> division.dividir(1, 0));
    Assert.assertEquals("You can't divide by zero", ex.getMessage());
  }

  @Test
  public void Given_Calculadora_Object_When_Potencia_Then_Return_Expected_Result() {

    // Arrange
    Calculadora calcularPotencia = new Calculadora();

    // Act
    int result = calcularPotencia.potencia(2, 4);
    
    // Assert
    Assert.assertEquals(16, result);
  }
}
