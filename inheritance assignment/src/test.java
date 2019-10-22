import java.util.Scanner;
public class test {

    
    public static void main(String[] args){
        
        //OBJECTS
        Scanner input=new Scanner(System.in);
        Permanent[] p=new Permanent[100];
        temporary[] t=new temporary[100];
        
        
        //INSTANCE VARIABLES
        int choice;
        int choice2;
        int choice3;
        int p_sr=0;
        int t_sr=0;
        String a;
        String b;
        int c;
        String ab;
        String bc;
        int ca;
        String re = "NA";
        
        
        do      //MENU
        {
        System.out.print("\n\n\t\t\u000C\tM U G H A L ~ T O W N\t\u000C\n\n\n");
        System.out.print("\n\t\tWelcome to the Society's Portal ");
        System.out.print(" \n\n\t\t\tpress 1 - Registration");
        System.out.print("\n\t\t\tpress 2 - Expiry Check");
        System.out.print("\n\t\t\tpress 3 - Next day");
        System.out.print("\n\t\t\tpress 4 - Members of Society");
        System.out.println("\n\t\t\tpress 5 - Exit");
        System.out.print("\n\t\t\tpress desired button : ");
        choice=input.nextInt();
            
        
            
        //NESTED SWITCHES
        switch (choice)
        {
            case 1:
            {
                System.out.print("\n\n\tWelcome to Registration System");
                System.out.print("\n\tWhat type of membership do you want?");
                System.out.print("\n\t\t\tPress 1 - Permanent .");
                System.out.print("\n\t\t\tPress 2 - temporary .\n\t\t\t");
                choice2=input.nextInt();
                switch (choice2)
                {
                    
                    case 1:
                    {
                        p_sr=p_sr+1;
                        p[p_sr]=new Permanent();
                        System.out.print("\n\n\t\tWe are glad you chose Permanent membership system.");
                         System.out.print("\n\n\t\tYour registration number is "+p_sr+"\n");
                         System.out.print("\t\t\tEnter your name : ");
                                a=input.next();
                         p[p_sr].set_name(a);
                          System.out.print("\t\t\tEnter you address : ");
                          b=input.next();
                         p[p_sr].set_address(b);
                         
                         do{
                             
                           System.out.print("\t\tPay Rs. 10000/- fee for permanent membership : ");
                           c=input.nextInt();
                           p[p_sr].set_fee(c);
                         
                         }while(c<10000);
                         
                         p[p_sr].sfee();
                    }
                    break;
                    case 2:
                    {
                        t_sr=t_sr+1;
                          t[t_sr] =new temporary();
                         System.out.print("\n\n\t\tWelcome to Temporary membership system.\n");
                         System.out.print("\n\n\t\tYour registration number is "+t_sr+"\n");
                         System.out.print("\t\t\tEnter your name : ");
                          ab=input.next();
                         t[t_sr].set_name(ab);
                          System.out.print("\t\t\tEnter you address : ");
                           bc=input.next();
                        t[t_sr].set_address(bc);
                        do
                        {
                           System.out.print("\t\tPay Rs:10000/- For Temporary Membership : ");
                           ca=input.nextInt();
                        t[t_sr].set_fee(ca);
                        }while(ca<10000);
                        t[t_sr].set_t_days(90);
                    }
                    break;
                }  
            }  
            break;
            case 2:
            {
                System.out.print("\nwhich type of member are you :");
                System.out.print("\n\t\tPress 1 - Permanent ");
                System.out.print("\n\t\tPress 2 - Temporary ");
                choice3=input.nextInt();
                switch(choice3)
                {
                case 1:
                {
                    System.out.print("You are Permanent Member ");
                
            
                System.out.print("Enter your registration number");
                int reg=input.nextInt();
                if(p[reg].get_p_day()<=0)
                {
                    System.out.print("\nyour subscription has been expired kindly renew it");
                    p[reg].sfee();
                }
                else
                {
                    System.out.print("\nyour remaining days of subscription are : "+p[reg].get_p_day());
                }
                }
                break;
                case 2:
                {
                    System.out.print("You are Temporary Member ");
                
            
                System.out.print("Enter your registration number");
                int reg=input.nextInt();
                if(p[reg].get_p_day()<0)
                {
                    System.out.print("\nyour Membership has been expired kindly renew it \n");
                }
                else
                {
                    System.out.print("\nyour remaining days of subscription are : "+t[reg].get_t_day());
                }
                }   
                
            }
                
                
                
                }
            break;
            case 3:
            {
                int p_day; //permatnent member days
                int t_day; //temporary member days
                int day=0;
                String cc ;
                
                do
                {
                for(int k=1;k<=p_sr;k++)
                {                       //for permanent member's remaining days
                    p_day=p[k].get_p_day();
                    p_day=p_day-30;
                    p[k].set_p_days(p_day);  
                    if(p[k].get_p_day()<0)
                    {
                    p[k].set_p_days(0);
                    //calling expiry function;
                    p[k].p_exp(k);
                    }}
                    for(int l=1;l<=t_sr;l++)
                {                       //for temporary member's remaining days
                    t_day=t[l].get_t_day();
                      t_day=t_day-30;
                    t[l].set_t_days(t_day);  
                    if(t_day<=0)
                    {
                    t[l].set_t_days(0);
                    
                    //calling expiry function
                    t[l].t_exp(l);
                    }
                }
                System.out.print("");
                System.out.print("");
                
                day=day+30;
                System.out.println("\t\t=-=-=-=-==-=-=Day#"+day+" Passed=-=-=--=-=-=");
                System.out.print("press y for next day \nOR\npress N for main menu");
                cc=input.next();
                
                
                
            }while("y".equals(cc)||"Y".equals(cc));
             
            
            }
            break;
            case 4:
            {
                
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\tCurrent Date : 01/10/2019\n\n\n\n\n");
                System.out.print("\n\t\t\t\tPERMANENT MEMBERS :\n\n\t\tReg no.\t\tName\t\tAddress\t\tMembership type\t\tSubscription Status\n");
                for(int i=1;i<=p_sr;i++)
                {
                    
             
             p[i].show(i);
              
             }
                System.out.print("\n----------------------------------------------------------------------------------------------------------------------------------------------------------\n\n\n");
             
              System.out.print("\n\t\t\t\tTEMPORARY MEMBERS :\n\n\t\tReg no.\t\tName\t\tAddress\t\tMembership type\t\tmembership Status\t\tExpiry Date\n");
              for(int j=1;j<=t_sr;j++)
                {
                    
             
             t[j].show(j);
             
             }
                System.out.print("\n----------------------------------------------------------------------------------------------------------------------------------------------------------\n\n\n");
                
            }
            
            break;
            case 5:
            {
                System.out.print("\nThanks for visiting the Portal ");
                System.out.print("\nHoping Your visit soon again");   
            }
            break;
            default:
                    {
                    System.out.print("\nPlease choose between 1-5");    
                    }
        }
        if(choice!=5)
        {
          System.out.print("\n\t\t\t\tpress Y for main menu\n\t\t\t\t\t OR \n\t\t\t\tpress N to exit"); 
          re=input.next();
        }
        }while("y".equals(re) || "Y".equals(re));
    }
        
} 