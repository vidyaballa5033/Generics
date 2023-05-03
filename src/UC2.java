
public class UC2<T> {

    private T[] inputArray;
    public UC2(T[] inputArray) {
        this.inputArray = inputArray;
    }
    public void toPrint(){
        UC2.toPrint(this.inputArray);
    }
    public static <E> void toPrint(E[] inputArray)
    {
        for(E element : inputArray)
        {
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] intArray ={1,2,3,4,5};
        Double [] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Character [] charArray={'H','E','L','L','O'};
        new UC2(intArray).toPrint();
        UC2.toPrint(doubleArray);
        UC2.toPrint(charArray);
    }
}

//SAMPLE CODES FOR GENERICS