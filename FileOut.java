import java.io.FileOutputStream;
import java.io.FileInputStream;
class FileOut
	{
		public static void main(String args[])
		{
			try
			{
				FileOutputStream fout = new FileOutputStream("D:\\test.txt");
				for(int i = 0; i<=10; i++)
				{
					fout.write(100);
					
				}
				fout.close();
				System.out.println("Success....");
				FileInputStream fead = new FileInputStream("D:\\test.txt");
				for(int i = 0; i<=10; i++)
				{
					int a = fead.read();
					System.out.println((char)a);
				}				
				fead.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
