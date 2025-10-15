public class NewSwitchStat2 {
    public static void main(String[] args) {
        String day="monday";
        String result = " " ;
        switch(day)
        {
            case"saturdar","sunday" -> result="6am";
                
            case "monday" -> result="8am";
                
            default -> result="7am";
    }
    System.out.println(result);
}
}
