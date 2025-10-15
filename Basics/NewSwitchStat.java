public class NewSwitchStat {
    public static void main(String[] args) {
        String day="monday";
        
        switch(day)
        {
            case"saturdar","sunday" -> System.out.println("6am");
                
            case "monday" -> System.out.println("8am");
                
            default -> System.out.println("7am");        }
    }
}
