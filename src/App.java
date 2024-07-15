import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayBT BT1 = new ArrayBT();
        int[] array = {5, 1, 6, 7, 8, 3, 10, 15, 21, 2, 2};
        //Bài 1
        System.out.println("Tong cac so chan la: " + BT1.SumEvenNumberArrays(array));
        //Bài 2
        System.out.println("So lon nhat trong mang la: " + BT1.maxInArray(array));
        //Bài 3
        int elementToFind = 2;
        System.out.println("So lan xuat hien cua phan tu " + elementToFind + " la: " + BT1.CountOccurrences(array, elementToFind));
        //Bài 4
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Moi ban nhap them gia tri cho mang");
            int num = scanner.nextInt();
            arrayList.add(num);

            System.out.println("Ban co muon tiep tuc them gia tri cho mang, y/n");
            String input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
        }

        int result = BT1.SumOfSquaresElements(arrayList);
        System.out.println("Tong cac so binh phuong trong mang la: " + result);
    }
}
