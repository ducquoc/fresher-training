package vn.ducquoc.jdkupdate.util;

public class Base64Sample {

    private static final int MAX = 1_000_000;
    private static final int COUNT = 10;

    public static void main(String args[]) {

        Base64Sample sample = new Base64Sample();

        byte[] randomBytes = new byte[MAX];
        new java.util.Random().nextBytes(randomBytes);

        System.out.println("\n *** Java 4 base64 Sun misc");
        for (int i = 0; i < COUNT; i++) {
            sample.j4EncodeBase64(randomBytes);
        }

        System.out.println("\n *** Java 8 base64 Java util");
        for (int i = 0; i < COUNT; i++) {
            sample.j8EncodeBase64(randomBytes);
        }

    }

    private byte[] j4EncodeBase64(byte[] randomBytes) {
        sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();

        long tStart = System.nanoTime();

        String result = encoder.encode(randomBytes);

        long tEnd = System.nanoTime();
        System.out.println("Time elapsed: " + (tEnd - tStart) / 1e6 + " ms");

        return result.getBytes();
    }

    private byte[] j8EncodeBase64(byte[] randomBytes) {
        java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
        long tStart = System.nanoTime();

        byte[] result = encoder.encode(randomBytes);

        long tEnd = System.nanoTime();
        System.out.println("Time elapsed: " + (tEnd - tStart) / 1e6 + " ms");

        return result;
    }

}
