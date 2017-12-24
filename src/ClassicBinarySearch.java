package src;

public class ClassicBinarySearch {

    // if not found, return -1, else return index
    public int binarySearch(int[] array, int target)
    {
        if (array == null || array.length == 0){
            return -1;
        }

        int result = -1;
        int lowerIndex = 0;
        int highIndex = array.length -1;

        while (lowerIndex <= highIndex){
            int midIndex = lowerIndex + (highIndex -lowerIndex)/2;

            if (array[midIndex] == target) {
                result = midIndex;
                break;
            } else if (array[midIndex] < target) {
                // important: +-1, otherwise the index might not change
                // if highIndex and LowerIndex only diff by 1
                lowerIndex = midIndex +1;
            } else {
                // important: +-1, otherwise the index might not change
                // if highIndex and LowerIndex only diff by 1
                highIndex = midIndex -1;
            }
        }

        return result;
    }
}
