import java.util.Scanner;

// baekjoon_8393_analysis.txt
public class Main_plus_num {
    // - 테스트 케이스
    // 3 --> 6
    // 5 --> 15
    // 1 --> 1
    public int sum(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        // 반복값 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        // 합 구함
        Main_plus_num main = new Main_plus_num();
        int output = main.sum(input);

        // 합한 값 출력
        System.out.println(output);
    }
}