package com.samira;



public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value!";
    public static void main(String[] args) {
System.out.println(getDurationString(61,0));
System.out.println(getDurationString(54564L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59))
           return  INVALID_VALUE_MESSAGE;

        long hours = minutes / 60;
        int remainingMinutes = (int) minutes % 60;
       return hours + "h " + remainingMinutes + "m " + seconds +"s";

    }
    private static String getDurationString(long seconds){
if(seconds < 0)
   return INVALID_VALUE_MESSAGE;

long minutes = seconds / 60;
 int remainderSeconds = (int) seconds % 60;
return getDurationString(minutes, remainderSeconds);


    }

}
