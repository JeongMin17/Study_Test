package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		//Exam은 인터페이스로서 등록, NewlecExam은 데이터 구현 객체
		ExamConsole console = new InlineExamConsole(exam);
		//Exam을 console에 출력을 하는데 출력되는 모양이 Inline(한줄에) 출력
		//new를 통해 ExamConsole를 참조해서 물려받는 다는 것을 자동으로 구현
		console.print();
	}
}
