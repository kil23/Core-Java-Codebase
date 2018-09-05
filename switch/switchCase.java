import java.lang.*;

class switchCase{

	static int stringInput(String month_str){
		int month_no = 0;
		if(month_str==null){
			System.out.println("Month name cannot be null!");
		}

		switch(month_str.toLowerCase()){
			case "january":
				month_no = 1;
				break;
			case "february":
				month_no = 2;
			case "march":
				month_no = 3;
			case "april":
				month_no = 4;
		}
		return month_no;
	}

	public static void main(String[] args){
		int numdays=0;
		int month = 2;
		int year = 2000;

		switch(month) {
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				numdays = 31;
				break;
			case 4: case 6: 
			case 9: case 11:
				numdays = 30;
				break;
			case 2:
				if(((year%4==0) && !(year%100==0))||(year%400==0))
					numdays = 29;
				else
					numdays = 28;
				break;
			default:
				System.out.println("Invalid month");
				break;
		}
		int month_num = stringInput("april");
		System.out.println("Number of input month is "+month_num);
		System.out.println("Number of days in the month: "+numdays);
	}
}