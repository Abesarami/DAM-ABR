package UD6;

import java.util.ArrayList;
import java.util.Scanner;

public class E1204 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<Integer>(0);
        Scanner sc = new Scanner(System.in);
        Integer numero=0;
        do {
            numero = sc.nextInt();
            if (numero>0)
            arrayList.add(numero);
        }while (numero!=-1);
        System.out.println(arrayList.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==0)
            System.out.println(arrayList.get(i));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)/3==0)
                System.out.println(arrayList.get(i));
        }
    }
}
