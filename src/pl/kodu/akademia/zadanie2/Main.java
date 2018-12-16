package pl.kodu.akademia.zadanie2;

import javax.tools.Diagnostic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Box> boxList = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int readedValue = scanner.nextInt();
            if (readedValue == 0)
                break;

            boxList.add(new Box(readedValue));
        }
        System.out.println(boxList);

        List<Box> joinedBoxList = new ArrayList<>();
        int counter = 0;


        for (int i = 0; i < boxList.size(); i = i + 2) {
            if (boxList.size() > i + 1) {
                Box box1 = boxList.get(i);
                Box box2 = boxList.get(i + 1);
                switch (counter) {
                    case 0:
                        counter = 1;
                        box1.joinDiagonal(box2);
                        joinedBoxList.add(box1);
                        break;
                    case 1:
                        counter = 2;
                        box1.joinVertical(box2);
                        joinedBoxList.add(box1);
                        break;
                    case 2:
                        counter = 0;
                        box1.joinHorizontally(box2);
                        joinedBoxList.add(box1);
                        break;
                }
            } else {
                joinedBoxList.add(boxList.get(i));
            }
        }
        System.out.println(joinedBoxList);
    }
}
