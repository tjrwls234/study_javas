import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

public class Main_multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();

        System.out.println(input_first * input_second);
        scanner.close();
    }
}
