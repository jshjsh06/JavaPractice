package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// ���� ó�� �ڵ�� try{} catch(����Ŭ���� e){} finally{}�̴�.
		// try���� ���� �߻� ���� �ڵ带, catch���� ���� ó�� �ڵ带, finally���� �׻� ����Ǵ� �ڵ带 �ִ´�.
		try {
			Class clazz = Class.forName("Java.lang.String2");
			System.out.println("try �����Դϴ�. 9��° �ٿ� ������ ������� �ʽ��ϴ�");
		} 
		catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		finally {
			System.out.println("����Ƶ� ����Ǵ� �����Դϴ�.");
		}
		
		System.out.println("----------");
		
		// ��Ƽ catch �� Exception e
		// ��Ƽ catch�� | ���� ó���Ѵ�. or �����̶� �Ȱ���.
		// Exception e�� � ���ܵ� ��Ƴ���.
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1= Integer.parseInt(data1);
			int value2= Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} 
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("���� �Ű����� ���� �����ϰų� ���ڷ� ��ȯ�� �� �����ϴ�.");
		} 
		catch(Exception e) {
			System.out.println("�� �� ���� ���� �߻�");
		}
		finally {
			System.out.println("����Ƶ� ����Ǵ� �����Դϴ�.");
		}
	}
}
