package exception;

public class ThrowException {

	public static void main(String[] args) {
		// 메소드를 호출한 곳으로 예외를 떠넘길 수 있다.
		// throws 키워드가 붙어있는 메소드는 반드시 try 블록 내에서 호출되어야 한다.
		// 그리고 catch 블록에서 떠넘겨 받은 예외를 처리해야한다.
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");	
	}
	
}
