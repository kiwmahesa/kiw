package com.example.demo.basic;

public class Bprima {

    public Integer[] fprima(){
        Integer hasil[] = new Integer[4];
        int jumlaharray = 0;
        for(int i = 1; i<=10; i++)
        {
         int check = 0;

                for(int j = 1; j<=i; j++)
                {
                    if(i % j == 0)
                    {
                        check += 1;
                    }
                }
                if(check == 2) {
                    hasil[jumlaharray] = i;
                    jumlaharray += 1;
                }
        }
        return hasil;
    }
}
