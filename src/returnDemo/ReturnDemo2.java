package returnDemo;

public class ReturnDemo2 {
	public static String num(int i) {
		if(i==0){
			return "zero";
		} else if(i==1){
			return "one";
		} else if(i==2){
			return "two";
		}
		return "none"; // 삭제시 컴파일 실행되지 않는다.
	}

	public static void main(String[] args) {
		System.out.println(num(1));
	}
}
