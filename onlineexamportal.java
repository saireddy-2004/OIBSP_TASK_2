import java.util.*;
class onlineexamportal
{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("pavan",4838);
		info.put("sai",41594);
		info.put("venkatesh",4834);
		info.put("deepak",4081);
		info.put("aditya",4071);
        info.put("gangadhar",41096);

		String id;
		int pwd;
        System.out.println("**** Welcome to OASIS INFOBYTE ****");
		System.out.println("LOGIN");
		System.out.println("Enter Username:");
		id = sc.next();
		System.out.println("Enter Passoword:");
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nLogin successful!");
			menu();
		}
		else
		{
			System.out.println("\nInvalid Username or Password.\nTry again!!!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter your Choice:");
		System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice!!! Choose correct choice");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter Username:");
		update_id = sc.next();
		System.out.println("Enter Old Password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter New Password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password Changed Successfully!!!");
		}
		else
		{
			System.out.println("User not found.\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		System.out.println("Welcome to Oasis inforbyte quiz !!!");
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q1.Which of the following is NOT an object-oriented programming language?");
			System.out.println("1.java \t2.C++ \t3.python \t4.HTML");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q2.Which data structure is based on the last in, first out (LIFO) principle?");
			System.out.println("1.Queue \t2.Stack \t3.Array \t4.Linkes list ");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q3.What does the acronym SQL stand for?");
			System.out.println("1.Standard Query Language \t2. Structured Query Language \t3.Script Query Language \t4.Simple Query Language");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q4.Which of the following is NOT a fundamental data type in C?");
			System.out.println("1.Int\t2.Float \t3.Char\t4.Double");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q5.Which of the following is NOT a fundamental data type in Python?");
			System.out.println("1.String\t2.Integer\t3.Float\t4.Double");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			System.out.println("-------------------------------------------------------------");
			break;
		}
		System.out.println("Exam Finished!!!");
		System.out.println();
		System.out.println("Your Score is "+score);
		if(score>10)
			System.out.println("Congratulations you passed!!!");
		else
			System.out.println("Better Luck Next Time!!!");
	}
	public static void main(String args[])
	{
		onlineexamportal obj  = new onlineexamportal();
		obj.login();
	}
}