class Test1
	{
		void m()
			{
				/*for(int i=10; i<-10; i--)
				{	
					int a = 50/i;
					System.out.println(i);
				}*/
				int[] a= new int[5];
				a[5] = 10;
			}
		void n()
			{
				m();
			}
		void p()
			{
				try 
				{
					n();
				}
				catch(Exception e)
				{
					System.out.println("Exception Handled of "+e);
					e.printStackTrace();
				}
			}
	}
class Error1
	{
		public static void main(String args[])
		{
			Test1 t1 = new Test1();
			t1.p();
			System.out.println("Rest of the code!");
		}
	}