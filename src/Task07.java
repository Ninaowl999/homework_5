public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание №7");
        int number =5;
        for (int i = 31; i >= 0 ; i--) {
            int bit = (number >> i) & 1;
            System.out.print(bit);
        }
    }
}
