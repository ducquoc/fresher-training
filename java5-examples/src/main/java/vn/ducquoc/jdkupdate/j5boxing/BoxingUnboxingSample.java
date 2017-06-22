package vn.ducquoc.jdkupdate.j5boxing;

/**
 * Sample about new features in Java 5 vs prior versions (Java 1.4-).
 * 
 * @author ducquoc
 * 
 * @see https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 * @see http://docs.oracle.com/javase/1.5.0/docs/guide/language/autoboxing.html
 */
public class BoxingUnboxingSample {

  int primitiveInt = 42;

  Integer objectInt = new Integer(42);

  Integer boxingPrimiToObjInt = 42; // Java 1.4: Integer.valueOf(primitiveInt);

  int unboxingObjToPrimi = new Integer(42); // Java 1.4: objectInt.intValue();

  public static void main(String args[]) {

    BoxingUnboxingSample boxingUnboxingSample = new BoxingUnboxingSample();

    System.out.println("Unboxing benchmark...");
    boxingUnboxingSample.benchmarkSumWithUnboxing();

    System.out.println("No Unboxing benchmark...");
    boxingUnboxingSample.benchmarkSumNoUnboxing();

  }

  private void benchmarkSumWithUnboxing() {
    long tStart = System.nanoTime();

    Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }

    long tEnd = System.nanoTime();
    System.out.println("Sum = " + sum + " (" + (tEnd-tStart)/1e6 + " ms)");
  }

  private void benchmarkSumNoUnboxing() {
    long tStart = System.nanoTime();

    long sum = 0L; // Long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }

    long tEnd = System.nanoTime();
    System.out.println("Sum = " + sum + " (" + (tEnd-tStart)/1e6 + " ms)");
  }

}
