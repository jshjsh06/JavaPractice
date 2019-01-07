package mvc_model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreView scoreview = new ScoreView();		

	}

}

class ScoreModel{
	private int kor, math, eng;
	private String name;
	
	ScoreModel(String name, int kor, int eng, int math) {
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	public void print() {
		System.out.printf("%s학생의 국어 점수는 %2d, 영어점수는 %2d, 수학점수는 %2d 입니다.\n", this.name, this.kor, this.eng, this.math);
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class ScoreController{
	List<ScoreModel> scoreTable = new ArrayList<ScoreModel>();
	
	public void inputScore(String name, int kor, int eng, int math) {
		scoreTable.add(new ScoreModel(name, kor, eng, math));
		for(int i = 0; i<scoreTable.size(); i++) {
			scoreTable.get(i).print();
		}
	}
	public void korSum() {
		int kor=0;
		int tmp;
		for(int i = 0; i<scoreTable.size(); i++) {
			tmp = scoreTable.get(i).getKor();
			kor = kor + tmp;
		}
		System.out.printf("모든 학생의 국어점수 합은 %d 입니다.", kor);		
	}
}

class ScoreView {
	Scanner sc = new Scanner(System.in);
	String name="";
	int kor, eng, math;
	static int count;
	ScoreView() {
		ScoreController scorecontroller = new ScoreController();
		System.out.println("성적관리 프로그램에 오신 것을 환영합니다.");		
		System.out.println(count+1 + "번째 학생 이름을 입력해주세요.(끝내시려면 end 입력)");
		this.name = sc.next();
		while(!name.equals("end")) {
			count = count + 1;
			System.out.println("국어 성적을 입력해주세요.");
			this.kor = sc.nextInt();
			System.out.println("영어 성적을 입력해주세요.");
			this.eng = sc.nextInt();
			System.out.println("수학 성적을 입력해주세요.");
			this.math = sc.nextInt();
			scorecontroller.inputScore(this.name, this.kor, this.eng, this.math);
			System.out.println("");
			System.out.println(count+1 + "번째 학생 이름을 입력해주세요.(끝내시려면 end 입력)");
			this.name = sc.next();
		}
		scorecontroller.korSum();
		
	}	
}







