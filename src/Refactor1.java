
public class Refactor1 {
    //integer element
    public void FindMaxInt(Integer a, Integer b, Integer c){
        int max = a;
        if((b.compareTo(max))>0)
        {
            max=b;
        }
        if((c.compareTo(max))>0){
            max=c;
        }
        System.out.println("Maximum of "+a+ ","+b+" and "+c+ " is: "+max);
    }

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
        Refactor1 max = new Refactor1();
        Integer a=8,b=5,c=2;
        Float d = 9.5F ,e=6.5F,f=3.3F;
        String g="amit",h="bunny",i="carl";
        System.out.println("********  Integer values  ********");
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        max.FindMaxInt(a,b,c);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        max.FindMaxInt(b,a,c);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        max.FindMaxInt(c,b,a);


        System.out.println("********  Float values  ********");
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        max.FindMaxFloat(d,e,f);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        max.FindMaxFloat(e,d,f);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        max.FindMaxFloat(d,f,d);


        System.out.println("********  String values  ********");
        // test case 1 :- Given Max Number at 1st Position return the Same Number
        max.FindMaxString(i,h,g);
        // test case 2 :- Given Max Number at 2nd Position return the Same Number
        max.FindMaxString(h,i,g);
        // test case 3 :- Given Max Number at 3rd Position return the Same Number
        max.FindMaxString(g,h,i);

    }
}
