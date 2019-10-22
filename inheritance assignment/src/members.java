import java.util.Scanner;

public class members {
    
    Scanner inputt=new Scanner(System.in);
    
    
    private String name;
    private String address;
    private int fee;
    
    public void set_name(String a)
    {
        name=a;
    }
    public void set_address(String b)
    {
        address=b;
    }
    public void set_fee(int c)
    {
        fee=c;
    }
    public String get_name()
    {
        return name;
    }
    public String get_address()
    {
        return address;
    }
    public int get_fee()
    {
        return fee;
          
    }
    members()
    {
        name="Null";
        address="Null";
        fee=000;
        
    }
    members(String a,String b,int c)
    {
        name=a;
        address=b;
        fee=c;
    }
void expiry_date(int date)
    {int d=1,m=10,y=2019,c;
    for(c=0;c<=date;c++)
    { if(d<=31){
        d++;
        }
    if(d>31)
    { d=1;
      m=m+1;
    }
   if(m>=13)
   {m=1;
    y=y+1;
   }

    }
  System.out.print(d+"/"+m+"/"+y); 
    }
    
}
