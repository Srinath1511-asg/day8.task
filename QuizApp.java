package day8.task;

import java.util.*;
class MiniProject {
	
	private String questionText;
	private List<String> options;
	private int correctAnswerIdx;
	
	
	public MiniProject(String questionText,List<String> options,int correctAnsweridx)
	{
		this.questionText=questionText;
		this.options=options;
		this.correctAnswerIdx=correctAnsweridx;
		
	}
	public void displayQuestion() {
		System.out.println(questionText);
		
		for(int i=0;i<options.size();i++) {
			System.out.println((i+1)+ " "+options.get(i));
		}
	}
	public boolean checkAnswer(int answer) {
		return answer==correctAnswerIdx+1;
	}
	

}
public class QuizApp{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		List<MiniProject> quiz=new ArrayList<>();
		quiz.add(new MiniProject("what is the capital of india",
	Arrays.asList("delhi","mumbai","hyderabad","kolkata"),0));
		quiz.add(new MiniProject("strings are immutable in java?",
				Arrays.asList("yes","no","strings are modified in java","none of this"),0));
		quiz.add(new MiniProject("what is the root class of exception?",
				Arrays.asList("throws","throwable","exception","try"),1));
		quiz.add(new MiniProject("which data structure uses lifo?",
				Arrays.asList("queue","stack","tree","graph"),1));
		quiz.add(new MiniProject("which keyword is used to inherit a class in java?",
				Arrays.asList("this","super","implements","extends"),3));
		
		int score=0;
		
		System.out.println("....Welcome to online quiz app.....");
		
		//iterate through quiz
		for(MiniProject q:quiz) {
			q.displayQuestion();
			System.out.println("enter your choice: ");
			int answer=s.nextInt();
			if(q.checkAnswer(answer)) {
				System.out.println("Correct!\n");
				score++;
			}
			else {
				System.out.println("Wrong!\n");
			}
		}
		System.out.println("=====Quiz Completed ====");
		
		System.out.println("your score: "+score +"/"+quiz.size());
		s.close();
	}
	
}