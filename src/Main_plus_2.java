import java.util.Scanner;

/* 
- 문제파악
두 정수 A와 B를 입력받은 다음, A+B를 출력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 줄에 A, B는 (0 < A, B < 10) 따라야 한다.

- 유추 파악
입력 받은 갯수 만큼 입력 받은 두 정수의 합을 출력

- 주요 단어 영문 이름 선정
입력	input
정수	decimal
출력	output
합	    add
*/
public class Main_plus_2 {
    // 두 정수의 합을 구함
    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;

        return output_plus;
    }

    public static void main(String[] args) {
        /*
         * - 테스트 케이스
         * 5
         * 1 + 1 = 2
         * 2 + 3 = 5
         * 3 + 4 = 7
         * ...
         */

        // - 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // 반복
        for (int i = 0; i < input; i++) {
            int input_first = scanner.nextInt();
            int input_second = scanner.nextInt();

            // 처리
            Main_plus_2 main = new Main_plus_2();
            int output_plus = main.plus(input_first, input_second);
            // 출력
            System.out.println(output_plus);
        }
        scanner.close();
    }
}
