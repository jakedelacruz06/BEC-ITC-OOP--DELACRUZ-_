public class Enum{
   
    enum Day {
        Monday, Tueday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
       
        Day karon = Day.FRIDAY;

       
        switch (karon) {
            case MONDAY:
                System.out.println("It's Monday, time to start the workweek.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday, another day of work.");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday, midweek hump day.");
                break;
            case THURSDAY:
                System.out.println("It's Thursday, almost there, one more day.");
                break;
            case FRIDAY:
                System.out.println("It's Friday, time to celebrate the weekend coming up!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday, a day to relax and enjoy.");
                break;
            case SUNDAY:
                System.out.println("It's Sunday, a day to prepare for the week ahead.");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }
}