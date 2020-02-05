class Main {
  public static void main(String[] args) 
	{
		int fib1=0;
		int fib2=1;
		for(int i=0;i<40;i++)
		{
			int temp = fib1+fib2;
			System.out.println(temp);
			fib1=fib2;
			fib2=temp;
		}
    
  }
}