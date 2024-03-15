public class PermutationSansTiers {

  public static void swap(byte a, byte b) {
    a = (byte) (a ^ b);
    b = (byte) (a ^ b);
    a = (byte) (a ^ b);
  }

  @Test // This can be kept if you plan to use JUnit later
  public void testSwap() {
    byte a = 99;
    byte b = 101;

    swap(a, b); // Call the swap function

    assertEquals(101, a);
    assertEquals(99, b);
  }
}
