package defineDemo;

public class ForeachDemo {
	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한아람" };
		for (String e : members) {
			System.out.println(e + "이상담을 받았습니다.");
		}
	}
}
//for ~ each 문은 자바 1.5이상부터 된다. 