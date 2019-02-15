import java.util.ArrayList;
import java.util.Scanner;

public class javaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter students(Enter exit when done)");
		ArrayList<String> names=new ArrayList<String>( );
		ArrayList<String> cses=new ArrayList<String>( );
		ArrayList<Double> marks=new ArrayList<Double>( );
		int n=1;
		double SUM = 0;
		double AVG = 0;
		while (true) {
			System.out.println("Enter student"+n+ ":");
			String name = new Scanner(System.in).nextLine();
			int c=1;
			while(c<=3) {
				System.out.println("EnterCourse Unit"+c+":");
				String cse = new java.util.Scanner(System.in).nextLine();
				System.out.println("Enter Marks:");
				Double mark = new java.util.Scanner(System.in).nextDouble();
				SUM=SUM+mark;
				if(name.toLowerCase().equals("exit"))
					break;
				else
					names.add(name);
					cses.add(cse);
					marks.add(mark);
				
			c++;
		}
		
			System.out.println("SUM = "+SUM);
			AVG=SUM/3;
			System.out.println("AVG = "+AVG);
			if(AVG>=85){
				System.out.println("GRADE=A");
			}else {
				if(AVG>=75) {
					System.out.println("GRADE=B");
				}else {
					if(AVG>=65) {
						System.out.println("GRADE=C");
					}else {
						if(AVG<=49) {
							System.out.println("GRADE=F");
						}
					}
				}
			}
				
		n++;
	}
	}

	}


