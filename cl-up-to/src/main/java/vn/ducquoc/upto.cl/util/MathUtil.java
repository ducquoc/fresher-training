package vn.ducquoc.upto.cl.util;

import java.util.stream.LongStream;

// @see https://github.com/ducquoc/jutil-dq/blob/master/jutil/src/main/java/vn/ducquoc/jutil/MathUtil.java#L25
public class MathUtil {

    // https://github.com/ducquoc/euler-fun/blob/master/euler/src/main/java/vn/ducquoc/euler/Util.java#L31
    public static boolean isPrime(long number) {
        if (number < 2) return false;
        return LongStream.range(2, (long) Math.sqrt((double) number) + 1).noneMatch(i -> number % i == 0);
    }

}
