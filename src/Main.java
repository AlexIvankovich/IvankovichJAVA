import com.homework.hw1.*;
import com.homework.hw2.DifferenceOfSumEvenElementsAndSumOddElements;
import com.homework.hw2.FindMinAndMaxVer1;
import com.homework.hw2.FindMinAndMaxVer2;
import com.homework.hw2.NumFibonacci;

public class Main {

    public static void main(String[] agrs) {

//        HW1 Задача 1.1. Гласный алфавит при помощи If
        VowelOrConsonantsIfTest vowelOrConsonantsIf = new VowelOrConsonantsIfTest();
        vowelOrConsonantsIf.vowelAlphabet();
//        HW1 Задача 1.2. Гласный алфавит при помощи Switch
        VowelOrConsonantsSwitchTest vowelOrConsonantsSwitch = new VowelOrConsonantsSwitchTest();
        vowelOrConsonantsSwitch.vowelAlphabet();

//        HW1 Задача 2.
        Season season = new Season();
        season.timeOfTheYear();

//        HW1 Задача 3.
        InputWordBeforeExit inputWordBeforeExit = new InputWordBeforeExit();
        inputWordBeforeExit.wordBeforeExit();

//        HW1 Задача 4.
        CalcSumDivisibleBy3 calcSumDivisibleBy3 = new CalcSumDivisibleBy3();
        calcSumDivisibleBy3.calculateSum();

//        HW2 Задача 1.
        NumFibonacci numFibonacci = new NumFibonacci();
        numFibonacci.numFib();

//        HW2 Задача 2. Вариант 1.
        FindMinAndMaxVer1 findMinAndMax = new FindMinAndMaxVer1();
        findMinAndMax.findMinNMax();
//        Вариант 2
        FindMinAndMaxVer2 findMinAndMaxVer2 = new FindMinAndMaxVer2();
        findMinAndMaxVer2.findMin();
        findMinAndMaxVer2.findMax();

//        HW2 Задача 3.
        DifferenceOfSumEvenElementsAndSumOddElements difOfSumEvenElAndSumOddEl = new DifferenceOfSumEvenElementsAndSumOddElements();
        difOfSumEvenElAndSumOddEl.difOfSumEvenAndSumOdd();

//        HW4
        Person person1 = new Person("Иван", "Иванов");
        System.out.println(person1.personInfo());
    }
}
