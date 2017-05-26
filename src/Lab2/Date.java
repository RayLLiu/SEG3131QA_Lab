package Lab2;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(){

    }
    public Date(int a,int b,int c){
    	this.year =a;
    	this.month=b;
    	this.day=c;
    }
    
    public Date nextDate(Date currentD){
        Date result=new Date();


        if ( currentD.getYear() < 0 ){
            throw new IllegalArgumentException( "Year Number Must Be Greater Than 0" );
        }
        else{

            if ( (currentD.getMonth() < 0) || (currentD.getMonth() > 13) ){

                throw new IllegalArgumentException( "Month Number Must Be Greater Than 0 and Less Than 13" );
            } 
            else{

                if((currentD.getDay() < 0 ) || (currentD.getDay() > 32) ){

                    throw new IllegalArgumentException( "Day Number Must Be Greater Than 0 and Less than 32" );
                }
                else{
                    switch (currentD.getMonth()) {
                        case 1:  //"January";
                            if (currentD.getDay() == 31){
                                result.setMonth(2);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                result.setMonth(1);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }

                            break;
                        case 2:  //monthString = "February";
                            if (currentD.getDay() < 28){
                                result.setMonth(2);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }else{
                                boolean leap = checkLeapYear(currentD);
                                if(leap){
                                    if(currentD.getDay()==29){
                                        result.setMonth(3);
                                        result.setDay(1);
                                        result.setYear(currentD.getYear());
                                    }else{
                                        if(currentD.getDay()==28){
                                            result.setMonth(2);
                                            result.setDay(currentD.getDay()+1);	
                                            result.setYear(currentD.getYear());
                                        }else{
                                            if ((currentD.getDay()==30) || (currentD.getDay()==31)){
                                                throw new IllegalArgumentException( "Day Number Must Be Less than 30 in a leap year" );
                                            }
                                        }
                                    }
                                }else{
                                    if(currentD.getDay()>28){
                                        throw new IllegalArgumentException( "Day Number Must Be Less than 29 in a non leap year" );
                                    }else{
                                        result.setMonth(3);
                                        result.setDay(1);
                                        result.setYear(currentD.getYear());
                                    }
                                }
                            }
                            break;
                        case 3:  //monthString = "March";
                            if (currentD.getDay() == 31){
                                result.setMonth(4);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                result.setMonth(3);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }
                            break;
                        case 4:  //monthString = "April";
                            if (currentD.getDay() == 30){
                                result.setMonth(5);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                if (currentD.getDay() == 31){
                                    throw new IllegalArgumentException( "Day Number Must Be Less than 31 in April" );
                                }
                                else{
                                    result.setMonth(4);
                                    result.setDay(currentD.getDay()+1);
                                    result.setYear(currentD.getYear());
                                }
                            }
                            break;
                        case 5:  //monthString = "May";
                            if (currentD.getDay() == 31){
                                result.setMonth(6);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                result.setMonth(5);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }
                            break;
                        case 6:  //monthString = "June";
                            if (currentD.getDay() == 30){
                                result.setMonth(7);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                if (currentD.getDay() == 31){
                                    throw new IllegalArgumentException( "Day Number Must Be Less than 31 in June" );
                                }
                                else{
                                    result.setMonth(6);
                                    result.setDay(currentD.getDay()+1);
                                    result.setYear(currentD.getYear());
                                }
                            }
                            break;
                        case 7:  //monthString = "July";
                            if (currentD.getDay() == 31){
                                result.setMonth(8);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                result.setMonth(7);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }
                            break;
                        case 8:  //monthString = "August";
                            if (currentD.getDay() == 31){
                                result.setMonth(9);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                result.setMonth(8);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }
                            break;
                        case 9:  //monthString = "September";
                            if (currentD.getDay() == 30){
                                result.setMonth(10);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                if (currentD.getDay() == 31){
                                    throw new IllegalArgumentException( "Day Number Must Be Less than 31 in September" );
                                }
                                else{
                                    result.setMonth(9);
                                    result.setDay(currentD.getDay()+1);
                                    result.setYear(currentD.getYear());
                                }
                            }
                            break;
                        case 10: //monthString = "October";
                            if (currentD.getDay() == 31){
                                result.setMonth(11);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                result.setMonth(10);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }
                            break;
                        case 11: //monthString = "November";
                            if (currentD.getDay() == 30){
                                result.setMonth(12);
                                result.setDay(1);
                                result.setYear(currentD.getYear());
                            }else{
                                if (currentD.getDay() == 31){
                                    throw new IllegalArgumentException( "Day Number Must Be Less than 31 in November" );
                                }
                                else{
                                    result.setYear(currentD.getYear());
                                    result.setMonth(11);
                                    result.setDay(currentD.getDay()+1);
                                    result.setYear(currentD.getYear());
                                }
                            }
                            break;
                        case 12: //monthString = "December";
                            if (currentD.getDay() == 31){
                                result.setMonth(1);
                                result.setDay(1);
                                result.setYear(currentD.getYear()+1);
                            }else{
                                result.setMonth(12);
                                result.setDay(currentD.getDay()+1);
                                result.setYear(currentD.getYear());
                            }
                            break;
                        default: System.out.println("never ever ever");
                            break;
                    }
                }
            }
        }
        return result;
    }



    public boolean checkLeapYear(Date currentD){
        int year = currentD.getYear();
        if(year%4==0&&!(year%100==0)||year%400==0){
            return true;
        }else{
            return false;
        }
    }

    /**
	 * @return the year
	 */
    public int getYear() {
        return year;
    }

    /**
	 * @param year the year to set
	 */
    public void setYear(int year) {
        this.year = year;
    }


    /**
	 * @return the month
	 */
    public int getMonth() {
        return month;
    }

    /**
	 * @param month the month to set
	 */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
	 * @return the day
	 */
    public int getDay() {
        return day;
    }

    /**
	 * @param day the day to set
	 */
    public void setDay(int day) {
        this.day = day;
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
