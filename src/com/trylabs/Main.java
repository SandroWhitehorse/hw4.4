package com.trylabs;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	float numbers[]=new float[100];
	Random random=new Random(System.currentTimeMillis());
	float z=0.5f;
	boolean number=false;
	int temp=0;
	int count=0;
	for (int i=0;i<numbers.length; i++)
        {
          numbers[i]=random.nextFloat()-z;//положительными и отрицательными числами заполняется массив
            System.out.println(numbers[i]);
            if (numbers[i]>0) {temp ++; System.out.println("Всего положительных чисел подряд: "+temp);}
            else {
                if (temp > count) {
                    count = temp;
                    temp = 0;
                }
                else temp=0;
            }
            System.out.println("Максимальное количество положительных чисел следующих подряд: "+count);
        }


    }
}
