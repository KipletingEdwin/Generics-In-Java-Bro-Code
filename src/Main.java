//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Generics =    enables types(classes and methods) to be parameters when defining
        //              classes, interfaces and methods
        //              a benefit is to eliminate the need to create multiple visions
        //              of methods or classes fro various data types
        //              Use 1 version for all reference data types

            Integer[] intArray = {1, 2, 3, 4, 5};
            Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
            Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
            String[] stringArray = {"B", "Y", "E"};

            displayArray(intArray);
            displayArray(doubleArray);
             displayArray(charArray);
          displayArray(stringArray);

        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
        System.out.println(getFirstElement(stringArray));



    }

    //Generic method

    public static <T> void displayArray(T[] array){
        for(T x : array){
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    public  static <T> T getFirstElement(T[] array){
        return  array[0];
    }




}