
public class MaxUc3 {
    //string
    public void FindMaxString(String i,String h,String g){
        String max=i;
        if((h.compareTo(max))>0)
        {
            max=h;
        }
        if((g.compareTo(max))>0){
            max=g;
        }
        System.out.println("Maximum of "+i+ ", "+h+" and "+g+ " is: "+max);
    }

    public static void main(String[] args) {
        MaxUc3 max = new MaxUc3();
        String g="amit",h="bunny",i="carl";
        System.out.println("********  String values  ********");
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        max.FindMaxString(i,h,g);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        max.FindMaxString(h,i,g);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        max.FindMaxString(g,h,i);
    }
}
