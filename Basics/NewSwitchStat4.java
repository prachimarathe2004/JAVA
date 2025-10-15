public class NewSwitchStat4 {
    public static void main(String[] args) {
        String day="saturday";
        String result = " " ;
        result=switch(day)
        {
            case"saturday","sunday" : yield "6am";
                
            case "monday" : yield  "8am";
                
            default  :  yield  "7am";
    };
    System.out.println(result);
}
}
