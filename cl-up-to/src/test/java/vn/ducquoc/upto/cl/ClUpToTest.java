package vn.ducquoc.upto.cl;

//import vn.ducquoc.upto.cl.ClUpTo;
import vn.ducquoc.upto.cl.helper.CliHelper;
//import vn.ducquoc.upto.cl.util.MathUtil;

@org.junit.runner.RunWith(org.junit.runners.BlockJUnit4ClassRunner.class)
public class ClUpToTest {

    @org.junit.Test
    public void testPNumberUpTo() throws Exception {
        ClUpTo target = new ClUpTo();
        org.junit.Assert.assertEquals(target.pnUpTo(2), 2);
        org.junit.Assert.assertEquals(target.pnUpTo(10), 7);
        org.junit.Assert.assertEquals(target.pnUpTo(23), 23);

        org.junit.Assert.assertEquals(target.pnUpTo(ClUpTo.FORTY_EIGHT), 47);
        org.junit.Assert.assertEquals(target.pnUpTo(ClUpTo.FIFTY_SEVEN), 53);
        org.junit.Assert.assertEquals(target.pnUpTo(ClUpTo.SIXTY_NINE), 67);

        org.junit.Assert.assertTrue(target.pnUpTo(160) == 157);
    }

    @org.junit.Test
    public void testHelper() throws Exception {
        org.junit.Assert.assertNotNull(CliHelper.usage());

        org.junit.Assert.assertTrue(CliHelper.banner().length() > 100);

        org.junit.Assert.assertFalse(CliHelper.bannerV2().length() < 120);
    }

    @org.junit.Test
    public void testMain() throws Exception {
        ClUpTo target = new ClUpTo();
        java.io.InputStream input = new java.io.ByteArrayInputStream("X".getBytes(), 0, "X".getBytes().length);
        System.setIn(input);
        target.main(new String[]{"" + ClUpTo.SIXTY_NINE});
    }
}
