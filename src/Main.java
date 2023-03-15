import java.util.Arrays;

public class Main {
   static Book[] books = new Book[5];

    public static void main(String[] args) {
   strings();
   books();

    }
    public static void strings(){
        String s1 = new String("atrtbcdef");
        String s2 = "atrtbcdef";
        String s3 = "atrtbcdef";
        String s4 = "";
        System.out.println(s1==s2);
        System.out.println(s3==s2);
        System.out.println(s1.equals(s2));
        char[] arr = s3.toCharArray();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i<arr.length;i++) {
            s4 = s4 + arr[i];
        }
        System.out.println(s4);
    }
    public static void books(){
        books[0] = new Book("Идиот", "Федор Достоевский");
        books[1] = new Book("1984", "Джордж Оруэлл");
        books[2] = new Book("Повелитель мух", "Уильям Голдинг");
        books[3] = new Book("Кэрри", "Стивен Кинг");
        String[] arrStringBooks = new String[5];
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(arrStringBooks[i] = books[i].getTittle() + "\"" + ", " + books[i].getAuthor());
            }
        }
    }

}