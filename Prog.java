import java.io.*;

class Prog
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr =  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int choice = 0;
		do
		{
		System.out.println(" 1.enter any one number \n 2. enter any two number \n 3.Sorting \n 4.string opertion \n 5.sorting of names \n 6.exit");
		 choice = Integer.parseInt(br.readLine());
		
		switch(choice)
		{

		case 1:
		System.out.println("enter the number:");
		int no = Integer.parseInt(br.readLine());

		System.out.println(" 1.find square root of no. \n 2.Sum of digits of no. \n 3. find no is even or odd. \n 4.find number is prime or not. \n 5. find fibonacci series till that number. \n 6.reverse of that no. \n 7.complement of number. \n 8.months & days \n 9.Exponential \n 10.in Words \n 11.Armstrong or not \n 12.Multiplication table \n 13.Binary of ur number ");
		int option = Integer.parseInt(br.readLine());

		switch(option)
		{
			case 1:
			double sq = Math.sqrt(no);
			System.out.println("the squae root of number is " +sq);
			break;
		
			case 2:
			int rem=0,res=0;
			while(no > 0)
			{
				rem = no % 10;
				res = res + rem;
				no = no/10;
			}
				System.out.println("sum of digits of a number is " +res);
				break;

			case 3:
     			if(no % 2==0)
			{
				System.out.println(" is even number");
			}
			else
			{
				System.out.println(" is odd number");
			}
			break;

			case 4:
			for(int i=2;i<no;i++)
			{
				if(no % i == 0)
				{
					System.out.println(" is not a prime number");
					break;
				}
				else
				{
					System.out.println(" is a prime number:");
					break;
				}
			}
			break;


			case 5:
      			int no1=1,no2=1,ans=0;
				System.out.println(no1);
			while(no2 < no)
			{
				System.out.println(no2);
				ans = no1 + no2;
				no1 = no2;
				no2 = ans;
			}
			break;


			case 6:
   			int re=0,result=0;
			while(no > 0)
			{
				re= no % 10;
				result = result * 10 + re;
				no = no/10;
			}
				System.out.println("reverse of the is"+result);
				break;

				case 7:
				
				System.out.println("complement of number is" +(~no));
				break;

				case 8:
				int days= no%30;
				int months=no/30;
				System.out.println(no+"days=" +months+"month & "+days+"days");
				break;
			
				case 9:
				
				System.out.println("the exponential is " +Math.exp(no));
				break;

				case 10:
				int remainder=0,reverse=0;
				while(no>0)
				{
					remainder = no%10;
					reverse = reverse * 10 + remainder;
					no = no/10;
				}
		
				String r="";  //CONTAINS ACTUAL ANS
		
				while(reverse >0)
				{
			
				       remainder=reverse%10;	
					reverse=reverse/10;
			
			
				switch(remainder)
				{
				case 0:
				System.out.println('\n');
				r=r + "ZERO";
				
				break;
			
				case 1:
				r=r + "ONE";
				break;

				case 2:
				r=r + "TWO";
				break;

				case 3:
				r=r + "THREE";
				break;

				case 4:
				r=r + "FOUR";
				break;

				case 5:
				r=r + "FIVE";
				break;

				case 6:
				r=r + "SIX";
				break;

				case 7:
				r=r + "SEVEN";
				break;

				case 8:
				r=r + "EIGHT";
				break;
				
				case 9:
				r=r + "NINE";
				break;

				default:
				r="";
			}

		}
			System.out.println(r);
			
		break;
			
				case 11:
				
				int n = no;
				int check=0,rmdr;	
				while(no > 0)
				{
					rmdr=no %10;
					check=check + (int)Math.pow(rmdr,3);
					no = no/10;
				}
				if(check==n)
				{
					System.out.println(n+" is ARMSTRONG number");
	
				}	
				else
					System.out.println(n+" is  NOT A ARMSTRONG number");
				break;


				case 12:
					System.out.println("***** MULTIPLICATION TABLE OF "+no+ "*****");
					int io;
					int numb = no;
		
					for(io=1; io<=10; io++)
					{
						System.out.println(no+" * "+io+" = " +no*io);
					}System.out.println(" \n " );
				break;


				case 13:
					
					String hex =Integer.toBinaryString(no);
			
					System.out.println( no+ " binary is " +hex);
				break;

				default:
				System.out.println("plz enter valid option");
		}
		break;
	
			case 2:
			
			System.out.println("enter the  2 number:");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());

			System.out.println(" 1.Addition  \n 2.subtraction \n 3.multiplication \n 4.division \n 5.maximum \n 6.minimum \n 7.modulas \n 8.anding \n 9.oring \n 10.xoring \n 11.swap \n 12.power");
			int x = Integer.parseInt(br.readLine());
			switch(x)
			{
				case 1:
				int add = a + b;
				System.out.println("äddition is "+add);
				break;
	
				case 2:
				int sub = a - b;
				System.out.println("subtrcation is "+sub);
				break;
				
				case 3:
				float mul = a * b;
				System.out.println("multplication is " +mul);
				break;
				
				case 4:
				float q = a/b;
				System.out.println("quotient is " +q);
				float r = a - (b*q);
				System.out.println("remainder is "+r);
				break;
				
				case 5:
				int y = a < b ? b : a;
				System.out.println("maximum is "+y);
				break;

				case 6:
				int z = a < b ? a : b;
				System.out.println("minimum is "+z);
				break;

				case 7:
				float m = a % b;
				System.out.println("modulas is "+m);
				break;

				case 8:
				float ba = a & b;
				System.out.println("anding of 2 number "+ba);
				break;
				
				case 9:
				float bo = a | b;
				System.out.println("oring of 2  number is"+bo);
				break;
	
				case 10:
				float xor = a ^ b;
				System.out.println("xoring of 2 number is"+xor);
				break;

				case 11:
				System.out.println("1st number is"+a);
				System.out.println("2nd number is"+b);
	
				int c=a;
				a=b;
				b=c;
				System.out.println("NOW");
				System.out.println("1st number is"+a);
				System.out.println("2nd number is"+b);
				break;
				

				case 12:
				double result = Math.pow(a,b);
				System.out.println("power result is "+result);
					break;

		
				default:
				System.out.println("plz enter valid option");
			}
			break;

			case 3:
				System.out.println("how many number u want");
				int n =Integer.parseInt(br.readLine());

				int arr[] = new int[100];
				int i;
	
		
					System.out.println("enter your numbers ");
					for(i=0; i<n; i++)
					{
						arr[i]=Integer.parseInt(br.readLine());
					}

				System.out.println("1.ASCENDING \n 2.DECENDING");
				int ch=Integer.parseInt(br.readLine());

				switch(ch)
				{
					case 1:
					for(i=0; i<n; i++)
					{
						for(int j=i+1; j<n; j++)
						{
							if(arr[i] > arr[j])
							{
								int t=arr[i];
								arr[i]=arr[j];
								arr[j]=t;
							}
						}
					}
	
			
					System.out.println("\n  \n");	
					for(i=0; i<n; i++)
					{
						System.out.println(arr[i]);
					}
					break;

					case 2:
					for(i=0; i<n; i++)
					{
						for(int j=i+1; j<n; j++)
						{
							if(arr[i] < arr[j])
							{
								int t=arr[i];
								arr[i]=arr[j];
								arr[j]=t;
							}
						}
					}
	
			
					System.out.println("\n  \n");	
					for(i=0; i<n; i++)
					{
						System.out.println(arr[i]);
					}
					break;
				default:
				System.out.println("plz enter valid option");
			}
			break;

			case 4:
				System.out.println("enter the string ");
				String str=br.readLine();

				System.out.println("1.count vowels \n 2.reverse of string ");
				int like=Integer.parseInt(br.readLine());
		
				switch(like)
				{
					case 1:
					int count=0;
					int l=str.length();
					char co;

					for(int im=0;im<l;im++)
					{
						co=str.charAt(im);

						if(co=='a' || co=='A' || co=='e' || co=='E' || co=='i' || co=='I' || co=='o' || co=='O' || co=='u' || co=='U')
						{
							count++;
						}
					}
		
					System.out.println("the number of vowels in string is  "+count);
					break;

					case 2:
					int imo,lo;

					lo=str.length();
					System.out.println(lo);

					System.out.println("the rverse string is ");
					for(imo=lo-1;imo>=0;imo--)
					{
						System.out.print(str.charAt(imo));
					}
					System.out.println("\n ");
					break;
				}	
				break;
			
			case 5:
				System.out.println("how many string you wnt ");
				int np=Integer.parseInt(br.readLine());
				String st[]=new String[np];

				System.out.println("enter the strig to be sorted ");
				for(int ik=0;ik<np;ik++)
				{
					st[ik]=br.readLine();
				}

				System.out.println("sorted list are ");

				for(int im=0;im<np;im++)
				{
					for(int jo=im+1;jo<np;jo++)
					{
						if(st[jo].compareTo(st[im])<0)
						{
							String temp=st[im];
							st[im]=st[jo];
							st[jo]=temp;
						}
					}
				System.out.println(st[im]);
				}
				break;

	
			case 6:
			System.out.println("byee byeeee....");
			break;
	
			default:
				System.out.println("plz enter valid option");
		}
		}while(choice != 6);
	}
}
	









