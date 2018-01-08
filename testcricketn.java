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
			System.out.println("Ball\t "+ i+currentThread().getName()+" hits "+n+" runs");
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
class testcricketn
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
		System.out.println("\nIndia players");
		System.out.println("-------------------");
		System.out.println("Ragul");
		System.out.println("Tendulkar");
		System.out.println("Virat");
		System.out.println("Srilanka players\n");
		System.out.println("-------------------------");
		System.out.println("Tharanga");
		System.out.println("Ravi");
		System.out.println("Raja");
		System.out.println("Tossing");
		System.out.println("India won the toss");
		System.out.println("India selected to BAT First");
		System.out.println("Raja bowling");
		Cricket c=new Cricket();
		c.setName("Tendulkar");
		c.start();
	}
}
