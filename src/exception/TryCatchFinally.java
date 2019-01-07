package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// 예외 처리 코드는 try{} catch(예외클래스 e){} finally{}이다.
		// try에는 예외 발생 가능 코드를, catch에는 예외 처리 코드를, finally에는 항상 실행되는 코드를 넣는다.
		try {
			Class clazz = Class.forName("Java.lang.String2");
			System.out.println("try 구문입니다. 9번째 줄에 막혀서 실행되지 않습니당");
		} 
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		finally {
			System.out.println("어찌됐든 실행되는 구문입니다.");
		}
		
		System.out.println("----------");
		
		// 멀티 catch 및 Exception e
		// 멀티 catch는 | 으로 처리한다. or 구문이랑 똑같다.
		// Exception e는 어떤 예외든 잡아낸다.
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1= Integer.parseInt(data1);
			int value2= Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} 
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 무족하거나 숫자로 변환할 수 없습니다.");
		} 
		catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}
		finally {
			System.out.println("어찌됐든 실행되는 구문입니다.");
		}
	}
}
