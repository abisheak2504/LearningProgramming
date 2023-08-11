package grade;

public class gradeAllocation {
    void grade(int score) {
    	if(score>=90) {
    		System.out.println("your grade is A+");
    	}
    	else if(score>=80&&score<90) {
    		System.out.println("your grade is A");
    	}
    	else if(score>=70&&score<80) {
    		System.out.println("your grade is B");
    	}
    	else if(score>=60&&score<70) {
    		System.out.println("your grade is C");
    	}
    	else if(score>=50&&score<60) {
    		System.out.println("your grade is D");
    	}
    	else {
    		System.out.println("you got fail so study again!!!!!!");
    	}
    }
}
