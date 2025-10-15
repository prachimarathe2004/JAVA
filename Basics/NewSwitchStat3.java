public class NewSwitchStat3 {
    public static void main(String[] args) {
        String day="monday";
        String result = " " ;
        result=switch(day)
        {
            case"saturdar","sunday" -> "6am";
                
            case "monday" -> "8am";
                
            default -> "7am";
    };
    System.out.println(result);
}
}
