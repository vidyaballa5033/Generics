
public class MaxUC2 {
    //Float numbers
    public void FindMaxFloat(Float a, Float b, Float c){
        float max = a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ","+b+" and "+c+ " is: "+max);
    }
    public static void main(String[] args) {
        MaxUC2 max = new MaxUC2();
        Float d = 9.5F ,e=6.5F,f=3.3F;
        System.out.println("********  Float values  ********");
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        max.FindMaxFloat(d,e,f);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        max.FindMaxFloat(e,d,f);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        max.FindMaxFloat(d,f,d);
    }
}
