
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList();

        myList.add(123);
        myList.add(4);
        myList.add(18);
        myList.add(16);

        List<Integer> myList2 = new ArrayList();
        for ( int i = 0; i<1000; i++) {
            myList2.add(i * 2);

            System.out.println("Rozmiar myList: " + myList.size());
            System.out.println("Rozmiar myList2: " + myList2.size());
        }
            List<Integer> numbers = new ArrayList();
            numbers.addAll(myList);
            numbers.addAll(myList2);

            System.out.println("Rozmiar numbers: " + numbers.size());

            for (Integer i : numbers){
                System.out.println(i);
            }
        }

/*        for(int i = 0; i<myList.size(); i++){

            System.out.println("LIczba: " + myList.get(i));
        }

        for ( Integer i : myList){
            System.out.println("LIczba: " + myList.get(i));
        }*/

/*        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Liczba: " + iterator.next());
        }*/

/*        System.out.println("Rozmiar naszej listy: " + myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.remove(0));
        System.out.println(myList.get(0));

        myList.clear();

        System.out.println(myList.size());
        System.out.println(myList.get(0));*/



/*    ArrayList arrayList = new ArrayList();
    arrayList.add(1);*/

/*        ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Liczba: " + listIterator.next());
        }
        while (listIterator.hasPrevious()){
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println(" LIczba: "  + value + " ma indeks: " + index);

            }*/

/*        Object[] arr1 = myList.toArray();

        Integer[] arr2 = new Integer[myList.size()];
        arr2 = myList.toArray(arr2);

        //Integer[] arr2  - to co wyżej zapisać w jednej tablicy


        System.out.println(arr2[1]);

        for(Integer i : arr2){
            System.out.println(i);
        }*/




        }

