import java.util.Calendar;
import java.util.Scanner;
 
public class SimpleCalender extends addremainder
{
 	public static void main(String[] args)
{
        Calendar cal = Calendar.getInstance();
        //getting all the information from the Calendar instance
        System.out.println("Date: "+cal.get(Calendar.DAY_OF_MONTH));
        if(cal.get(Calendar.DAY_OF_WEEK)==2)
        System.out.println("Day: Monday");
        else if(cal.get(Calendar.DAY_OF_WEEK)==3)
        System.out.println("Day: Tuesday");
        else if(cal.get(Calendar.DAY_OF_WEEK)==4)
        System.out.println("Day: Wednesday");
        else if(cal.get(Calendar.DAY_OF_WEEK)==5)
        System.out.println("Day: Thursday");
        else if(cal.get(Calendar.DAY_OF_WEEK)==6)
        System.out.println("Day: Friday");
        else if(cal.get(Calendar.DAY_OF_WEEK)==7)
        System.out.println("Day: Saturday");
        else
        System.out.println("Day: Sunday");
        if(cal.get(Calendar.HOUR_OF_DAY)>12)
        {
			 int c=cal.get(Calendar.HOUR_OF_DAY)-12;
        	System.out.println("Time: "
                                +c+":"
                                +cal.get(Calendar.MINUTE)+":"
                                +cal.get(Calendar.SECOND)+" PM");
        }
        else
        System.out.println("Time: "
                                +cal.get(Calendar.HOUR_OF_DAY)+":"
                                +cal.get(Calendar.MINUTE)+":"
                                +cal.get(Calendar.SECOND)+" AM");
        if (cal.get(Calendar.MONTH)==0)
        System.out.println("Month: January");
        else if (cal.get(Calendar.MONTH)==1)
        System.out.println("Month: February");
        else if (cal.get(Calendar.MONTH)==2)
        System.out.println("Month: March");
        else if (cal.get(Calendar.MONTH)==3)
        System.out.println("Month: April");
        else if (cal.get(Calendar.MONTH)==4)
        System.out.println("Month: May");
        else if (cal.get(Calendar.MONTH)==5)
        System.out.println("Month: June");
        else if (cal.get(Calendar.MONTH)==6)
        System.out.println("Month: July");
        else if (cal.get(Calendar.MONTH)==7)
        System.out.println("Month: August");
        else if (cal.get(Calendar.MONTH)==8)
        System.out.println("Month: September");
        else if (cal.get(Calendar.MONTH)==9)
        System.out.println("Month: October");
        else if (cal.get(Calendar.MONTH)==10)
        System.out.println("Month: November");
        else
        System.out.println("Month: December");
        System.out.println("Today is: "+cal.getTime());
        System.out.println("Do you want to add any Remainder:");
        System.out.println("Press: 1 for yes , 2 for no");
        Scanner s=new Scanner (System.in);
        int op = s.nextInt();
        int date,mth;
        switch (op)
        {
                case 1 : adre();
                         break;
                case 2 : break;
                default : System.out.println("Wrong Input");
        }
        System.out.println("Do you want to view any Remainder:");
        System.out.println("Press: 1-yes , 2-no");
        op = s.nextInt();
        switch (op)
        {
                case 1 :System.out.println("Enter the month whose Remainder is to be viewed\nFollow the format of entering the month\nPress:\n1-January\n2-February\n3-March\n4-April\n5-May\n6-June\n7-July\n8-August\n9-September\n10-October\n11-November\n12-December");
                        mth = s.nextInt();
                        seere(mth);
                        break;
                case 2 :break;
                default : System.out.println("Wrong Input");
        }
}
}
 
class addremainder extends data
{
	static void adre()
	{
		Scanner s = new Scanner (System.in);
		int a=1,op;
		while (a==1)
		{
		
		System.out.println("Enter Month and Date");
		mth[i] = s.nextInt();
		date[i] = s.nextInt();
		if(mth[i]==1&&date[i]<32||mth[i]==2&&date[i]<29||mth[i]==3&&date[i]<32||mth[i]==4&&date[i]<31||mth[i]==5&&date[i]<32||mth[i]==6&&date[i]<31||mth[i]==7&&date[i]<32||mth[i]==8&&date[i]<32||mth[i]==9&&date[i]<31||mth[i]==10&&date[i]<31||mth[i]==11&&date[i]<31||mth[i]==12&&date[i]<32)
		{
		        System.out.println("Enter Remainder to be Added:");
		        save[i] = s.nextLine();
		        save[i]+=s.nextLine();
		        System.out.println("Remainder has been Saved.");
		}
		else
		        System.out.println("Invalid Input.");
		System.out.println("Enter 1 for adding another Remainder");
		System.out.println("Enter 2 for to exit");
		op = s.nextInt();
		switch (op)
		{
			case 1 : i++;
			         a=0;
			         adre();
				 break;
			case 2 : a=0;
                		 break;
                	default : System.out.println("Wrong Input");
                	          a=0;
	        }
                }
        }
        static void seere (int mth)
        {
                for (i=0;i<12;i++)
                {
                        if (mth(i)==mth)
                        {
					System.out.println(date[i]);
                                      System.out.println(save[i]);
                                        
					break;
                                }
                                else
                                {
                                        System.out.println("No Reminder is present in this month.");
					break;

                                }
                        
                        
                }
        }
        private static int mth (int i)
        {
             return mth[i];
        }
}

class data 
{
        static int[] date = new int[50];
	static int[] mth = new int[50];
	static String[] save = new String[50];
	static int i=0;
}

