 class Permanent extends members {
     
   private int s_fee=5000;
   private int pay;
   private int p_days;
   private final String type="Permanent";
   
    public void set_s_fee(int a)
    {
        s_fee=a;
    }
    public void set_pay(int b)
    {
        pay=b;
    }
    public void set_p_days(int c)
    {
       p_days=c;
    }
    public int get_s_fee()
    {
        return s_fee;
    }
    public int get_pay()
    {
        return pay;
    }
    public int get_p_day()
    {
        return p_days;
          
    }
    Permanent()
    {
        s_fee=000;
        pay=000;
        p_days=000;
        
    }
    Permanent(int a,int b,int c)
    {
        s_fee=a;
        pay=b;
        p_days=c;
    }
    
   void sfee()                      //fees function
    {
      int f=s_fee;
        System.out.print("Pay Rs.5000 for one  month Subscription ");
      
        do
        {
             pay=inputt.nextInt();
            if(pay<f)
            {
              System.out.print(" Please enter full amount of RS. "+f);
            }
          
        }while(pay<f);
        p_days=p_days + (1*30);
        
        
    }
  
 void p_exp(int ts)                 //Expiry function 
    {

   if (p_days <=0)
   {
   System.out.println("\t\t\t\tPermanent Member \n\t\t\t\t    Reg no: "+ts);
   System.out.println("\n\t\t     Monthly Subscribtion Status :     ENDED ");
   }
   else
        System.out.println("Your Monthly Subscribtion will be ended in : Days.");
    
     }
    void show(int i)                //display function
    {
        System.out.print("\t\t"+i+"\t\t"+super.get_name()+"\t\t"+super.get_address()+"\t\t"+type+"\t\t"+p_days+" days remaining");
        System.out.println();
    }
    
    
    
}
