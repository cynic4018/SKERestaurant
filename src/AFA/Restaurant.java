package AFA;

import java.util.Scanner;

public class Restaurant {

			static Scanner a = new Scanner(System.in);
			static	int choice=0;
			static  String sc;
			static	int quan;
			static	int quan2;
			static	int quan3;
			static	int quan4;
			static	int quan5;
			static	int quan6;
			static	int cp=0;
			static	int cch=0;
			static	int cc=0;  
			static	int spizza=0;
			static	int schick=0;
			static	int scoke=0;
			static 	int csk=0;
			static 	int csc=0;
			static 	int cstt=0;
			static  int sketchup=0;
			static  int schilly=0;
			static  int startare=0;

			
			public static int Pizza(){
				spizza = cp*250;
				return spizza;
			}
			public static int Chickens(){
				schick = cch*120;
				return schick;
			}
			public static int Coke(){
				scoke = cc*45;
				return scoke;
			}
			public static int ketchup(){
				sketchup = csk*10;
				return sketchup;
			}
			public static int chilly(){
				schilly = csc*10;
				return schilly;
			}
			public static int tartare(){
				startare = cstt*25;
				return startare;
			}

			public static void Cal(){
				int ppizza = Pizza();
				int pchick = Chickens();
				int pcoke = Coke();
				int pchilly = chilly();
				int pketchup = ketchup();
				int ptartare = tartare();
				if(ppizza!=0)
				{
					System.out.printf("|%-18s|%9d|%11d|\n","Pizza",cp,ppizza);
				}
				if(pchick!=0)
				{
					System.out.printf("|%-18s|%9d|%11d|\n","Chickens",cch,pchick);
				}
				if(pcoke!=0)
				{
					System.out.printf("|%-18s|%9d|%11d|\n","Coke",cc,pcoke);
				}
				if(pketchup!=0)
				{
					System.out.printf("|%-18s|%9d|%11d|\n","Ketchup",csk,pketchup);
				}
				if(pchilly!=0)
				{
					System.out.printf("|%-18s|%9d|%11d|\n","Chilly",csc,pchilly);
				}
				if(ptartare!=0)
				{
					System.out.printf("|%-18s|%9d|%11d|\n","Tartare",cstt,ptartare);
				}
				System.out.println("+----------------------------+-----------+");
				System.out.printf("|%-28s|%11d|\n","Total",pcoke+pchick+ppizza+ptartare+pketchup+pchilly);
				System.out.println("+----------------------------+-----------+");
			}
			public static void saurce(){
				System.out.println("**********[ Saurce ]**********");
				System.out.printf("a.) Ketchup\t %d Bath.\n",10);
				System.out.printf("b.) Chilli\t %d Bath.\n",10);
				System.out.printf("c.) tartare\t %d Bath.\n",25);
				System.out.printf("d.)   - \t %d Bath.\n",0);
				System.out.println("");
			}
			public static void sker(){
				System.out.println("==========[ optin ]==========");
				System.out.printf("1.) Pizza\t %d Bath.\n",250);
				System.out.printf("2.) Chickens\t %d Bath.\n",120);
				System.out.printf("3.) Coke\t %d  Bath.\n",45);
				System.out.println("4.) Saurce");
				System.out.println("5.) Total ");
				System.out.println("6.) Exit ");
				System.out.printf("-----------------------------------------------\n");
				System.out.println("");
			}
			public static void main(String[] args) {		
				System.out.println("--------- Welcome to SKE Restaurant ---------");
				System.out.println("");
				
				do{
							
					if(choice==1)
					{
						System.out.print("Enter Quantity: ");
						quan = a.nextInt();
						cp+=quan;
						spizza = Pizza();
						System.out.println("");
					}
					else if(choice==2)
					{
						System.out.print("Enter Quantity: ");
						quan2 = a.nextInt();
						cch+=quan2;
						schick = Chickens();
						System.out.println("");
					}
					else if(choice==3)
					{
						System.out.print("Enter Quantity: ");
						quan3 = a.nextInt();
						cc+=quan3;
						scoke = Coke();
						System.out.println("");
					}
					else if(choice==4)
					{
						saurce();
						System.out.print("Enter your Saurce: ");
						sc = a.next();
							
							if(sc.equals("a"))
							{
								System.out.print("Enter Quantity: ");
								quan4 = a.nextInt();
								csk+=quan4;
								sketchup = ketchup();
								System.out.println("");
							}
							else if(sc.equals("b"))
							{
								System.out.print("Enter Quantity: ");
								quan5 = a.nextInt();
								csc+=quan5;
								schilly = chilly();
								System.out.println("");
							}
							else if(sc.equals("c"))
							{
								System.out.print("Enter Quantity: ");
								quan6 = a.nextInt();
								cstt+=quan6;
								startare = tartare();
								System.out.println("");
							}
							else if(sc.equals("d"))
							{
								
							}
						
					}
					else if(choice==5)
					{
						System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
						Cal();
						System.out.println("");
					}
					sker();
					System.out.print("Enter your Option: ");
					choice = a.nextInt();
					
				}while(choice!=6);
				System.out.print("===== Thank you =====");
		
				
		}
	}

