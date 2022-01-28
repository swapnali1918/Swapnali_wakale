package core.programs.assissted.project;

public class DiffMethod {
public int add(int a,int b) {
	int z=a+b;
	return z;
}
public static void main(String[] args) {

	DiffMethod b=new DiffMethod();
	int ans= b.add(10,3);
	System.out.println("Addition is : "+ans);
	}
}

