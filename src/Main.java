public class Main {
    public static void main(String[] args) {

        isLeapYear(100000);
    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999 ){
            return false;
            
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
            
        } else  {
            return false; // 7 lines failed
            
        }
    }
}

/* if (year < 1 || year > 9999) {
        return false;
    } else if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    } else {
        return false;
    */ //all the lines are correct, code from ChatGPT