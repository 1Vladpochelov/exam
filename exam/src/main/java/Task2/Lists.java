package Task2;

import java.util.*;

public class Lists {

    static Cars auto1 = new Cars(true, 2021, 2, 160000);
    static Cars auto2 = new Cars(true, 2021, 3, 220000);
    static Cars auto3 = new Cars(false, 2021, 1, 180000);
    static Cars auto4 = new Cars(true, 2020, 3, 150000);
    static Cars auto5 = new Cars(false, 2020, 1, 90000);
    static Cars auto6 = new Cars(false, 2020, 2, 150000);
    static Cars auto7 = new Cars(true, 2019, 3, 105000);
    static Cars auto8 = new Cars(false, 2019, 3, 120000);
    static Cars auto9 = new Cars(false, 2019, 2, 120000);
    static Cars auto10 = new Cars(false, 2019, 1, 80000);
    static Cars auto11 = new Cars(true, 2020, 1, 120000);

    private static final List<Cars> carList = new LinkedList<>(Arrays.asList(auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9, auto10));

    private static void getCarList(){
        System.out.println("Początkowa lista Cars bez sortowania: ");
        printCarListAfterSomeModification(carList);
        printSortedCars();
    }

    private static void printSortedCars() {

        Collections.sort(carList);
        System.out.println();
        System.out.println("Cars po sortowaniu");
        printCarListAfterSomeModification(carList);
        System.out.println("Pozycji na liście: " + carList.size());
    }

    public static void printCarsToValueAndLevelOfEquipment(Double maxValue, Integer levelOfEquipment){

        getCarList();
        List<Cars> carListFilter = new LinkedList<>();
        for (Cars car    : carList) {
            if(car.getValue() <= maxValue && Objects.equals(car.getLevelOfEquipment(), levelOfEquipment)){
                carListFilter.add(car);
            }
        }
        Collections.reverse(carListFilter);
        System.out.println();
        System.out.println("Przefiltrowana lista wg wartości max: " + maxValue + " i poziomie wyposażenia: " + levelOfEquipment);
        printCarListAfterSomeModification(carListFilter);
    }

    public static void addCarsToList() {
        //todo
        getCarList();
        carList.add(auto11);

        System.out.println();
        System.out.println("Dodałem auta");
        printCarListAfterSomeModification(carList);
        printSortedCars();
    }

    public static void removeCarFromList() {
        //todo
        getCarList();
        carList.remove(auto2);
        carList.remove(auto6);
        System.out.println();
        System.out.println("Usunąłęm 2 auta z listy");
        printCarListAfterSomeModification(carList);
    }

    private static void printCarListAfterSomeModification(List<Cars> lista){

        for (Cars car : lista) {
            System.out.println(car);
        }
    }

}

