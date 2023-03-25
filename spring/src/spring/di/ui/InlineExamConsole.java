package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;//물려받을 것
	
	

	public InlineExamConsole(Exam exam) { //오른쪽 클릭으로 소스 만들기
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

}
