package MehodRefrenceQus5;

import java.util.Scanner;

public class Ifact {
    public static int fact(int n){
        int fact=1;
        if(n<0)
            return 0;
        else for(int i=1;i<=n;i++){
            fact=fact*i;
        }
       return fact;
    }

}
