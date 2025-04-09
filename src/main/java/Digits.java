import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	         digitList = new ArrayList<Integer>();
		if(num==0){digitList.add(0);}
			   while(num>0){
				digitList.add(0,num%10);
				   num = num/10;

			   }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
	if(digitList.size()<=1){return true;}
		int x = digitList.get(0);
		for(int i=1;i<digitList.size();i++){
if(digitList.get(i)<=x){return false;}
			x=digitList.get(i);

		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
