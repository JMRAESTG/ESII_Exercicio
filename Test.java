import static junit.framework.TestCase.assertEquals;

public class Test
{
    private BinString binString;

    //@BeforeEach
    void setUp()
    {
        binString = new BinString();
    }

    //@Test
    void tesSumFunction()
    {
        int expected = 0;
        assertEquals(expected, binString.sum(""),"\"\" should be 0");
        expected = 100;
        assertEquals(expected, binString.sum("d"), " d should be 100");
        expected = 265;
        assertEquals(expected, binString.sum("Add"), "Add should be 265");
    }

    //@Test
    void testBinariseFunction()
    {
        String expected = "101";
        assertEquals(expected, binString.binarise(5), "5 should be 101");

        expected = "11111100";
        assertEquals(expected, binString.binarise(252), "252 should be 11111100");

    }

    //@Test
    void testTotalConverion()
    {

    }
}
