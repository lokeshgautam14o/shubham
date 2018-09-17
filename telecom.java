import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public class plandetails implements Comparable
    {
        String planname;
        int monthlyrental;
        boolean freeinternet;
        boolean freecalls;
        boolean freesms;
        float callcharge;
        float smscharge;
        float datacharge;
        float roamingcharge;
    }

     public static void main(String []args)
     {
      System.out.println("enter 1 for adding plan details");
       System.out.println("enter 2 for display");
        System.out.println("enter 3 for filtration");
        Scanner scn=new Scanner(System.in);
        int answer=scn.nextInt();
        switch(answer)
        {
            case 1:
                adddetails();
                break;
          
            case 2:
                adddetails();
                break;
                
            case 3:
                adddetails();
                break;
                
            default:
                System.out.print("wrong choice");
        }
     }
     static Arraylist<plandetails> record=new Arraylist<>();
     
     public static void adddetails()
     {
         plandetail plan=new plandeatils();
         
         plan.planname=scn.nextLine();
         plan.monthlyrental=scn.nextInt();
         plan.freeinternet=scn.nextBoolean();
         plan.freecalls=scn.nextBoolean();
         plan.freesms=scn.nextBoolean();
         plan.callcharge=scn.nextFloat();
         plan.smscharge=scn.nextFloat();
         plan.datacharge=scn.nextFloat();
         plan.roamingcharge=scn.nextFloat();
         
         record.add(plan);
         
     }
     public static void display()
     {
         for(plandetails p:record)
         {
             System.out.println(p.planname);
              System.out.println(p.monthlyrental);
               System.out.println(p.freeinternet);
                System.out.println(p.freecalls);
                 System.out.println(p.freesms);
                  System.out.println(p.callcharge);
                   System.out.println(p.smscharge);
                    System.out.println(p.datacharge);
                     System.out.println(p.roamingcharge);
                      System.out.println("/--------------------------------");
         }
     }
     public static void filteration()
     {
          System.out.println("enter 1 monthly rental");
            System.out.println("enter 2 free internet");
                System.out.println("enter 3 free call");
                    System.out.println("enter 4 for free sms ");
                     Scanner scn=new Scanner(System.in);
                     int answer=scn.nextInt();
                     if(answer==1)
                     {
                         System.out.print("enter the less than amount");
                         float con=scn.nextFloat();
                         monthlyrental(con);
                     }
                     else if(answer==2)
                     {
                       System.out.print("enter true or false for free internet");
                         boolean con=scn.nextFloat();
                         freeinternet(con);  
                     }
                     else if(answer==3)
                     {
                          System.out.print("enter true or false for free call");
                         boolean con=scn.nextFloat();
                         freecall(con);  
                     }
                     else  if(answer==4)
                     {
                          System.out.print("enter true or false for free sms");
                         boolean con=scn.nextFloat();
                         freesms(con);  
                     }
                     else
                     {
                         System.out.print("pleasr choose right option");
                     }
                    
     }
     
     public static void monthlyrental(float con)
     {
          for(plandetails p:record)
         {
             if(p.monthlyrental<con)
             {
              System.out.println(p.planname);
              System.out.println(p.monthlyrental);
               System.out.println(p.freeinternet);
                System.out.println(p.freecalls);
                 System.out.println(p.freesms);
                  System.out.println(p.callcharge);
                   System.out.println(p.smscharge);
                    System.out.println(p.datacharge);
                     System.out.println(p.roamingcharge);
                      System.out.println("/--------------------------------");
             }
         }
     }
      public static void freeinternet(float con)
     {
          for(plandetails p:record)
         {
             if(p.freeinternet==con)
             {
             System.out.println(p.planname);
              System.out.println(p.monthlyrental);
               System.out.println(p.freeinternet);
                System.out.println(p.freecalls);
                 System.out.println(p.freesms);
                  System.out.println(p.callcharge);
                   System.out.println(p.smscharge);
                    System.out.println(p.datacharge);
                     System.out.println(p.roamingcharge);
                      System.out.println("/--------------------------------");
          }   }
     }
     public static void freesms(float con)
     {
          for(plandetails p:record)
         {
             if(p.freesms==con)
             {
              System.out.println(p.planname);
              System.out.println(p.monthlyrental);
               System.out.println(p.freeinternet);
                System.out.println(p.freecalls);
                 System.out.println(p.freesms);
                  System.out.println(p.callcharge);
                   System.out.println(p.smscharge);
                    System.out.println(p.datacharge);
                     System.out.println(p.roamingcharge);
                      System.out.println("/--------------------------------");
             }
         }     
     }
     public static void freecalls(float con)
     {
          for(plandetails p:record)
         {
             if(p.freecalls==con)
             {
             System.out.println(p.planname);
              System.out.println(p.monthlyrental);
               System.out.println(p.freeinternet);
                System.out.println(p.freecalls);
                 System.out.println(p.freesms);
                  System.out.println(p.callcharge);
                   System.out.println(p.smscharge);
                    System.out.println(p.datacharge);
                     System.out.println(p.roamingcharge);
                      System.out.println("/--------------------------------");
         }    }
     }
     
}
