import java.util.Random;
import java.util.*;
class Cricket extends Thread
{
	public void run()
	{
		int t=0;
		System.out.println(currentThread().getName()+" Batting");
		Random rand = new Random();
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
class testcricket
{
	public static void main(String args[])
	{
	String team1,team2;
	int overs;
		Scanner in=new Scanner(System.in);		
		System.out.println("Enter Team1:\n");
		team1=in.next();
		System.out.println("Enter Team2:\n");
		team2=in.next();
		System.out.println("Enter Overs\n");
		overs=in.nextInt();
		System.out.println("-------------------\n");
		System.out.println(team1+"\t"+"verses"+"\t"+team2+"\t"+"match"); 
		System.out.println("\n india players");
		System.out.println("-------------------");
		System.out.println("ragul");
		System.out.println("tendulgar");
		System.out.println("virat");
		System.out.println("srilanga players\n");
		System.out.println("-------------------------");
		System.out.println("tharanga");
		System.out.println("ravi");
		System.out.println("raja");
		System.out.println("tossing");
		System.out.println("india won the toss");
		System.out.println("india selected to BAT First");
		System.out.println("raja bouling");
		Cricket c=new Cricket();
		c.setName("Tendulkar");
		c.start();
	}
}
