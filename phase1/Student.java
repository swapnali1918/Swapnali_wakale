package core.programs.assissted.project;

public class Student {

		String name;
		int age;
		char section;
		char gender;
		int sub1,sub2,sub3;
		int SM;
		
		public Student(String n,int a,char s,char g,int m1,int m2,int m3)
		{
			name=n;
			age=a;
			section=s;
			gender=g;
			sub1=m1;
			sub2=m2;
			sub3=m3;
		}
		 public int marks(){
		        return sub1+sub2+sub3;
		    }
		    public float percentage(){
		        return (marks()*100)/300;
		    }
		    public static void main(String[] args) {
		        Student s1 = new Student("Yogita", 24, 'A','F', 77,85,75);
		        Student s2 = new Student("Sakshi", 29, 'B','F', 50,60,65);
		        Student s3 = new Student("Nisha", 21, 'A','F', 90,89,96);
		        Student s4 = new Student("Shrey", 24, 'B','M', 79,98,87);
		        
		        System.out.println("Total Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
		        System.out.println("Total Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
		        System.out.println("Total Marks of student s2 "+ s3.marks() + " Percentage of student s2 " + s3.percentage());
		        System.out.println("Total Marks of student s2 "+ s4.marks() + " Percentage of student s2 " + s4.percentage());
		}

	}
