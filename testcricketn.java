import java.util.Random;
import java.util.*;
class Cricket extends Thread
{
	
	public void run()
	{
		int t=0,overs;
		String players[]={"Tendulkar","Ganguly","Ravindra Jadeja"};
		String name[]={"Lasith Malinga","Angelo Mathews","Kusal Perera"};
		Scanner in=new Scanner(System.in);
		System.out.println(currentThread().getName()+" Batting");
		Random rand = new Random();
		System.out.println("Enter Overs\n");
		overs=in.nextInt();		
		for(int o=0;o<overs;o++)
		{
		System.out.println(name[o]+"\t bowling\n");
		System.out.println("-------------------------");	
		for(int i=1;i<=6;i++)
		{	int n=rand.nextInt(6);
			int p=rand.nextInt(2);
			int q=rand.nextInt(2);
			if(n==5)
			{
				System.out.println(players[p]+" caught");
				players[q]=players[p];
			}
			else
			{      
				if(players[p]==players[q])
				break;
			System.out.println("Ball\t "+ i+currentThread().getName()+" hits "+n+" runs");
			t=t+n;
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
}
System.out.println("--------------------------");
		if(o==2)
		break;
}
		System.out.println("srilanka plays");
		for(int o=0;o<overs;o++)
		{
		System.out.println(name[o]+"\t bowling\n");
		System.out.println("-------------------------");	
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
		if(o==2)
		{
		break;
		}
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
		System.out.println("-------------------\n");
		System.out.println(team1+"\t"+"verses"+"\t"+team2+"\t"+"match"); 
		System.out.println("\nIndia players");
		System.out.println("-------------------");
		System.out.println("Dhoni");
		System.out.println("Tendulkar");
		System.out.println("Virat");
		System.out.println("Suresh Raina");
		System.out.println("Ganguly");
		System.out.println("Rahane");
		System.out.println("Rohit Sharma");
		System.out.println("Gautam Gambir");
		System.out.println("Ashwin");
		System.out.println("Ravindra Jadeja");
		System.out.println("Yuvraj Singh");
		System.out.println("Rahul");
		System.out.println("------------------------");
		System.out.println("Srilanka players\n");
		System.out.println("-------------------------");
		System.out.println("Lasith Malinga");
		System.out.println("Angelo Mathews");
		System.out.println("Tillakaratne Dilshan");
		System.out.println("Dinesh Chandimal");
		System.out.println("Rangana Herath");
		System.out.println("Upul Tharanga");
		System.out.println("Thisara Perera");
		System.out.println("Kusal Mendis");
		System.out.println("Kusal Perera");
		System.out.println("Suranga Lakmal");
		System.out.println("Nuwan Kulasekara");
		System.out.println("Asela Gunaratne");
		System.out.println("------------------------");
		System.out.println("Tossing");
		System.out.println("India won the toss");
		System.out.println("-------------------------");
		System.out.println("India selected to BAT First");
		System.out.println("Raja bowling");
		Cricket c=new Cricket();
		c.setName("Tendulkar");
		c.start();
	}
}
