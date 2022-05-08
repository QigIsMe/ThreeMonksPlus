import java.util.Scanner;
public class ThreeMonksPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the first monk:");
        int height1 = sc.nextInt();
        System.out.println("Please enter the height of the second monk:");
        int height2 = sc.nextInt();
        System.out.println("Please enter the height of the third monk:");
        int height3 = sc.nextInt();
        int tempHeight = height1 > height2 ? height1 : height2;
        int maxHeight = tempHeight > height3 ? tempHeight : height3;
        System.out.println("maxHeight:" + maxHeight);
    }
}
