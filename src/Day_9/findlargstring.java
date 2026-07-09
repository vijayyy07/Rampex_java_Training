package Day_9;

public class findlargstring {
    public static void main(String[] args) {
        String[] arr = { "Ramya", "Kishore", "Sanya", "Priya" };

        String largest = arr[0];
        for (String word : arr) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest string by length: " + largest);
    }
}