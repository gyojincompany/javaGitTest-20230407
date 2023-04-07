package exer;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		
		if(score < 50) {
			System.out.println("첫번째 조건의 결과가 참입니다!!");//주석
			//System.out.println("첫번째 조건의 결과가 참입니다!!");			
		} else if(score < 60) {
			System.out.println("두번째 조건의 결과가 참입니다!!");
		} else if(score < 70) {
			System.out.println("세번째 조건의 결과가 참입니다!!");
		} else if(score < 80) {
			System.out.println("네번째 조건의 결과가 참입니다!!");//80미만 조건 추가
		} else if(score < 90) {
			System.out.println("다섯번째 조건의 결과가 참입니다!!");
		} else {
			System.out.println("모든 조건의 결과가 거짓입니다!!");
		}
		
		
	}

}
