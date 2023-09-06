public class CountingStringOccurence {

    public static void main(String[] args) {

        int count = countOccurances("aaanjda", 'a');
        System.out.println(count);
    }

    public static int countOccurances(String word, char character) {

        int count = 0;
        for (int i=0; i<word.length();i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
