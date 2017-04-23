package returnDemo;

public class ReturnDemo {
	public static int one() {
        return 1;
        return 2; // 컴파일이 되지않는다. 리턴은 메소드를 종료시키는 역활도 한다.
        return 3;
    }
 
    public static void main(String[] args) {
        System.out.println(one());
    }
}
