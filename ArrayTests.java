import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInplace(){
    int[] input = {1,3,3};
    assertArrayEquals(new int[] {3,3,1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversedAgain() {
    int[] input1 = {0,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,0}, input1);
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input1 = {0.0,1.0};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input1),0.0001);
  }
}
