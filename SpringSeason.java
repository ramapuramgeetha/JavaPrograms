/* takes two int values m and d from the command line 
	and prints true if day d of month m is between March 20 (m = 3, d =20) 
	and June 20 (m = 6, d = 20), 
	false otherwise.
*/

public class SpringSeason
{
	public static void main (String args[])
	{
		boolean Springtime = false;
		int d = Integer.parseInt (args[0]);
		int m = Integer.parseInt (args[1]);
		if (m>0 && m <= 12) 
		{	
			if ( ((m==1 ||m==3 || m==5 || m==7||m==8||m==10||m==12)  && (d>0 && d <= 31))|| 
				(m==2 && (d>0 && d <= 28))||
				((m==4 ||m==6 || m==9 ||m==11) && (d>0 && d <= 30))
			) 
			{		
				if (m > 3 && m < 6) 
				{
					Springtime = true;
					System.out.println ("m>3 or m<6");
				}
				else if ((m==3 && d >=20) || (m==6 && d<=20))
				{
					Springtime = true;
					System.out.println ("m=3 or m=6");
				}
				else Springtime = false;
			
				if (Springtime) System.out.println ("It is Spring");
				else System.out.println ("It is not Spring");
			}
			else System.out.println ("error invalid day for month "+ m + "-" + d);
		}
		else System.out.println ("error invalid month " +m);
	}
}