import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		/*
		0의 개수는 10의 배수가 얼마나 있는지에 따라 결정됨
		10은 2,5로 구성됨
		고로 2,5의 개수를 구하면됨
		2는 2,4,8 등등 5보다 많이 나오므로 5의 제곱 개수만 구하면됨
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long result = 0;
		for (long i = 5; i <= N; i *= 5) {
		    result += N / i;
		}		
		System.out.println(result);
	}
}