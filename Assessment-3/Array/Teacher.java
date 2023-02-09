package Array;

	public class Teacher {
	    private String teacherName;
	    private String subject;
	    private double salary;
	    
	    public Teacher(String teacherName, String subject, double salary) {
	        this.teacherName = teacherName;
	        this.subject = subject;
	        this.salary = salary;
	    }
	    
	    public String getTeacherName() {
	        return teacherName;
	    }
	    
	    public String getSubject() {
	        return subject;
	    }
	    
	    public double getSalary() {
	        return salary;
	    }
	}

	 class Tester {
	    public static void main(String[] args) {
	        Teacher[] teachers = new Teacher[4];
	        teachers[0] = new Teacher("John Doe", "Mathematics", 6000);
	        teachers[1] = new Teacher("Jane Doe", "Physics", 7000);
	        teachers[2] = new Teacher("Jim Smith", "Biology", 8000);
	        teachers[3] = new Teacher("Samantha Smith", "Chemistry", 9000);
	        
	        for (Teacher teacher : teachers) {
	            System.out.println("Name: " + teacher.getTeacherName());
	            System.out.println("Subject: " + teacher.getSubject());
	            System.out.println("Salary: " + teacher.getSalary());
	        }
	    }
	}


