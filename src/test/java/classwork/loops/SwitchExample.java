package classwork.loops;

public class SwitchExample {
    public static void main(String[] args) {
//        int a = 10;
//        switch(a) {
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            case 4:
//                System.out.println(4);
//                break;
//            case 5:
//                System.out.println(5);
//                break;
//            case 6:
//                System.out.println(6);
//                break;
//            default:
//                System.out.println("Неправильный номер");
//        }


//        switch(den) {
//            case "Monday":
//                System.out.println("work until 18");
//                break;
//            case "Tuesday":
//                System.out.println("work until 18");
//                break;
//            case "Wednesday":
//                System.out.println("work until 18");
//                break;
//            case "Thursday":
//                System.out.println("work until 18");
//                break;
//            case "Friday":
//                System.out.println("Drunk evening");
//                break;
//            case "Saturday":
//                System.out.println("Day off");
//                break;
//            case "Sunday":
//                System.out.println("Day off");
//            default:
//                System.out.println("Неправильный номер");
//        }

        String den = "fdfsfsdfs";

        switch(den) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("work until 18");
                break;
            default:
                System.out.println("Неправильный номер");
                break;
            case "Saturday":
                System.out.println("Day off");
                break;
            case "Sunday":
                System.out.println("Day off");
//            default:
//                System.out.println("Неправильный номер");
        }
    }
}
