class Main {
  public static void main(String[] args) 
	{
		int fib1=0;
		int fib2=0;
		int fib3=1;
		for(int i=0;i<40;i++)
		{
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			fib3=fib1+fib2;
		}
    
  }
}