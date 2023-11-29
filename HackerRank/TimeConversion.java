package HackerRank;

public class TimeConversion {
    public static void main(String[] args) {
        String s = timeConversion("07:05:45PM");
        System.out.println(s);
    }
    public static String timeConversion(String s) {
        // Write your code here
         String[] tArr = s.split(":");
        String AmPm = tArr[2].substring(2);

        int hh,mm,ss;

        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0,2));
        
        String checkPm = "PM", checkAm = "AM";
        if (AmPm.equals(checkAm) && hh == 12) {
            hh = 0;
        }else if (AmPm.equals(checkPm) && hh < 12) {
                hh+=12;   
        }
        String format = String.format("%02d:%02d:%02d",hh,mm,ss);
        return format;
    
        }
    
}
