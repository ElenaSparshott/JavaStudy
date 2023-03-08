public class MyClass {
    public static void checkNumber(int number) {
        if(number == 0) {
            System.out.println("zero");
        }else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }



    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking == true && hourOfDay <8 || hourOfDay >22){
            return true;
        }else{
            return false;
        }
    }




    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }else if (year % 4 != 0) {
            return false;
        }else if (year % 400 == 0) {
            return true;
        }else if (year % 100 == 0) {
            return false;
        }else {
            return true;
        }
    }


}





