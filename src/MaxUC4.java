
public class MaxUC4 {
    //integer element
    public void FindMaxInt(Integer a, Integer b, Integer c) {
        int max = a;
        if ((b.compareTo(max)) > 0) {
            max = b;
        }
        if ((c.compareTo(max)) > 0) {
            max = c;
        }
        System.out.println("Maximum of " + a + "," + b + " and " + c + " is: " + max);
    }

    //Float numbers
    public void FindMaxFloat(Float a, Float b, Float c) {
        float max = a;
        if ((b.compareTo(max)) > 0) {
            max = b;
        }
        if ((c.compareTo(max)) > 0) {
            max = c;
        }
        System.out.println("Maximum of " + a + "," + b + " and " + c + " is: " + max);
    }
}

