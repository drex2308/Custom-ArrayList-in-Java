/**
 * Program for my own Array implementations.
 */
public class MyArray {
    /**
     * Instance varable for my class array.
     */
    private String[] classArray;
    /**
     * Instance variable to count the size of the array, i.e., number of words.
     */
    private int numberOfWords;
    /**
     * Constant variable for default array size.
     */
    private static final int DEFAULT_ARRAY_SIZE = 10;
    /**
     * No-Args constructor for my class.
     * Time Complexity: O(1)
     */
    public MyArray() {
        classArray = new String[DEFAULT_ARRAY_SIZE];
        numberOfWords = 0;
    }
    /**
     * Constructor for specific array size intialization.
     * Time Complexity: O(n)
     * @param initialCapacity specifies the intial length by user.
     */
    public MyArray(int initialCapacity) {
        classArray = new String[initialCapacity];
        numberOfWords = 0;
    }
    /**
     * Instance method to add word to array.
     * Time Complexity: O(n)
     * @param text specifies the word to be added to array.
     */
    public void add(String text) {

        if (!validateWord(text)) {
            return;
        }

        if (classArray.length == size()) {
            increaseCapacity();
        }
        classArray[size()] = text;
        numberOfWords++;
        return;
    }
    /**
     * Instance method to search a word in the array.
     * Time Complexity: O(n)
     * @param key specifies the word to be searched.
     * @return true if found, false otherwise.
     */
    public boolean search(String key) {
        if (key == null) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (classArray[i].equals(key)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Instance method to return number of words in array.
     * Time Complexity: O(1)
     * @return number of words.
     */
    public int size() {
        return numberOfWords;
    }
    /**
     * Instance method to check the current capacity of the array.
     * Time Complexity: O(1)
     * @return current capacity.
     */
    public int getCapacity() {
        return classArray.length;
    }
    /**
     * Instance method to display the array, only words.
     * Time Complexity: O(n)
     */
    public void display() {
        for (int i = 0; i < size(); i++) {
            System.out.print(classArray[i] + " ");
        }
        System.out.println();
    }
    /**
     * Instance method to remove duplicates in my array.
     * Time Complexity: O(n^3)
     */
    public void removeDups() {
        for (int i = 0; i < size(); i++) {
            String check = classArray[i];
            int k = getIndex(check, i + 1);
            while (k > 0) {
                classArray[k] = null;
                numberOfWords--;
                adjustArray(k);
                k = getIndex(check, k);
            }
        }
    }
    /**
     * Helper method to valdidate the word.
     * @param text specifies the length of the text.
     * Time Complexity: O(1)
     * @return true if it is all alphabets either case, false otherwise.
     */
    private boolean validateWord(String text) {
        if (text == null || text.equals("")) {
            return false;
        }
        return text.matches("^[a-zA-Z]+$");
    }
    /**
     * Helper method to double the size of array as it reaches its complexity.
     * Time Complexity: O(n)
     */
    private void increaseCapacity() {
        String[] temp = classArray;
        if (size() == 0) {
            classArray = new String[1];
            return;
        }
        classArray = new String[2 * classArray.length];
        for (int i = 0; i < temp.length; i++) {
            classArray[i] = temp[i];
        }
    }
    /**
     * Helper method to fill the hole created when deleting duplicate.
     * Time Complexity: O(n)
     * @param index specfies the position of hole created as we delete duplicate.
     */
    private void adjustArray(int index) {
        for (int i = index; i < size(); i++) {
        classArray[i] = classArray[i + 1];
        classArray[i + 1] = null;
        }
    }
    /**
     * Helper method to get the index of the specific text in array.
     * Time Complexity: O(n)
     * @param str specifies the text to be searched.
     * @param startIndex specifies index we start the search from.
     * @return position if found, -1 otherwise
     */
    private int getIndex(String str, int startIndex) {
        for (int i = startIndex; i < size(); i++) {
            if (classArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
