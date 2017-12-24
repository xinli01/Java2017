import org.junit.jupiter.api.Test;
import src.ClassicBinarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassicBinarySearchTest {

    @Test
    public void Test_Positive_even_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8,10,12};
        int target = 10;
        int expected = 4;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_Positive_odd_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {1,2,4,6,8,10,12};
        int target = 10;
        int expected = 5;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_TooBigToFind_even_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8};
        int target = 110;
        int expected = -1;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_TooBigToFind_odd_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {1,2,4,6,8};
        int target = 110;
        int expected = -1;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_TooSmallToFind_even_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8};
        int target = -12;
        int expected = -1;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_TooSmallToFind_odd_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {1,2,4,6,8};
        int target = -12;
        int expected = -1;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_NotFound_even_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8};
        int target = 5;
        int expected = -1;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_NotFound_odd_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {1,2,4,6,8};
        int target = 5;
        int expected = -1;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_BoundryLow_even_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8};
        int target = 2;
        int expected = 0;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_BoundryLow_odd_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8, 10};
        int target = 2;
        int expected = 0;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_BoundryHigh_even_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {2,4,6,8};
        int target = 8;
        int expected = 3;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void Test_BoundryHigh_odd_array()
    {
        ClassicBinarySearch sut = new ClassicBinarySearch();

        //Arrange
        int[] input = new int[] {1,2,4,6,8};
        int target = 8;
        int expected = 4;

        int actual = sut.binarySearch(input, target);

        assertEquals(expected, actual);
    }
}
