
class temporary extends members {
  
   private String exp_date;
   private String type="Temporary";
   private int t_days;
   
    public void set_exp(String a)
    {
        exp_date=a;
    }
   public void set_type(String b)
    {
        type=b;
    }
     public void set_t_days(int c)
    {
       t_days=c;
    }
    
    public String get_exp()
    {
        return exp_date;
    }
    public String get_type()
    {
        return type;
    }
    public int get_t_day()
    {
        return t_days;
          
    }
   
    temporary()
    {
        
    }
   temporary(String a,String b)
   {
       
   }
    
 
 void t_exp(int ts)                         //Expiry Function
    {

   if (t_days <=0)
   {
   System.out.println("\t\t\t\tTemparary Member\n\t\t\t\t    Reg no: "+ts);
   System.out.println("\n\t\t     Membership Status :     ENDED ");
   }
   else
        System.out.println("Your Membership will be ended in : Days.");
    
     }
 
 void show(int j)                           //Display function
  {
      System.out.print("\t\t"+j+"\t\t"+super.get_name()+"\t\t"+super.get_address()+"\t\t"+type+"\t\t"+t_days+" days remaining\t\t");
      super.expiry_date(t_days);
      System.out.println();
      
  }
}
 
