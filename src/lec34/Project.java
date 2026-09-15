package lec34;

public class Project {

	static int m = 30;
	int n = 20;
	
	static {
	
m = m+10;

	}
	
	{
		
		m++;
		n++;
	}
	public Project() {
	
	
		this(4);

	}
	
public Project(int a ) {
		n = n+a;
	
	}
}
