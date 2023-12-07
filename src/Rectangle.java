import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập chiều rộng");
        width = sc.nextFloat();
        System.out.println("nhập chiều cao");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("diện tích : " + area);
    }
}
