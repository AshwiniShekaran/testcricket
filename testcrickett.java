import java.util.Random;
class Cricket extends Thread
{
	public void run()
	{
	 int t=0;
	 System.out.println(currentThread().getName()+" Batting");
	 Random rand=new Random();
	 for(int i=1;i<=6;i++)
	 {
	  int n=rand.nextInt(6);
	  System.out.println(currentThread().getName()+" hits "+n+" runs");
	  t=t+n;
	  try
	  {
	  Thread.sleep(1000);
	  }
	  catch(InterruptedException e)
	  {}
	 }
	System.out.println("India got "+t+" runs");
	}
}
class testcrickett
{
	public static void main(String args[])
	{
 	  Cricket c=new Cricket();
 	  c.setName("tendulkar");
 	  c.start();
	}
}