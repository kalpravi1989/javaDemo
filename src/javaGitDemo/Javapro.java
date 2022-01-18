package javaGitDemo;

public class Javapro {

	public static void main(String[] args) {
		int i=20;
		int j=30;
		int k=40;
		int l=50;
		if(j>i && j>k && j>l) {
			System.out.println("the greatest number is"+j);
		}else if(i>j && i>k && i>l)
		{
			System.out.println("the greatest number is"+i);
		}else if(k>i && k>j && k>l)
		{
			System.out.println("the greatest number is"+k);
		}else 
		{
			System.out.println("the greatest number is"+l);
		}
	}

}
