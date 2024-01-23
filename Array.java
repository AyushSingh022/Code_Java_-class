import java.util.*;

class ArrayListExample {
   static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else{
            return(n*fact(n-1));
        }
    }
       public static void main(String[] args)
	{
        int n = 5;
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
		for (int i = 1; i <= n; i++) {
			arr1.add(i);
			arr2.add(i);
		}
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
        ArrayList movies=new ArrayList();
        movies.add("Avengers ");
        movies.add("Enndgame ");
        int n1=12;
        int abc=12;
        if(abc==n1);
        System.out.println(abc);
        int fun=fact(11);
        System.out.println(fun);


	}
}
