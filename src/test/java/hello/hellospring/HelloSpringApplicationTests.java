package hello.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

	public static void main(String[] args) {

		long n = 349614551;				// 자연수 가정
		int[] answer = new int[(int) n];				// 배열 선언
		int i = 0;

		while (true) {                    // 무한 반복
			answer[0] = (int) n % 10;    // i 번째에 n % 10 을 대입, int로 형변환
			n /= 10;                    // n 1의 자리수 제거
			i++;                        // i 1증가
			if (n == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
