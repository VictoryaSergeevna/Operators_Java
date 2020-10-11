package com.company;

public class Main {

    public static void main(String[] args) {
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

        public class Main {

            public static void main(String[] args) throws IOException {
//        1. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего
//        данному числу. (Осуществить проверку корректности ввода чисел).
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        final  int min=1,max=12;
//        System.out.println("Введите номер месяца:");
//
//        String num = reader.readLine();
//
//        int answer=Integer.parseInt(num);
//
//        if(answer<min||answer>max ){
//            System.out.println("Введите число от 1 до 12!");
//        }
//        else{
//            String monthes[]=new String[]{"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
//            System.out.println(monthes[answer-1]);
//        }
//        2. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//        Вывести найденные строки и их длину.
//        final int n=2;
//        String lines[]= new String[n];
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int i=0; i<n; i++) {
//            System.out.println("Введите слово:");
//            lines[i] = reader.readLine();
//        }
//
//        int maxLength = 0;
//        int minLength = lines[0].length();
//        String res1=null;
//        String res2=null;
//        for (int i=0; i<n; i++)
//        {
//            if(lines[i].length()>maxLength || lines[i].length()==maxLength){
//                res1 = lines[i];
//                maxLength=lines[i].length();
//            }
//            if(lines[i].length()<minLength||lines[i].length()==minLength){
//                res2=lines[i];
//                minLength=lines[i].length();
//            }
//        }
//
//        for (int i=0; i<n; i++)
//            System.out.println(lines[i] + " length:" + lines[i].length());
//
//        System.out.println("слово с максимальным количеством символов:["+maxLength+"]" + res1);
//        System.out.println("слово с минимальным количеством символов: ["+minLength+"]" + res2 );
//        3. Создать массив из 12 случайных целых чисел из отрезка [-15;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.
                final int size =12 , min =-15 , max=15;

                int numbers [] = new int [size];
                ThreadLocalRandom random = ThreadLocalRandom.current();

                for (int i=0; i<numbers.length; i++) {
                    numbers[i] = random.nextInt(min, max);
                    System.out.print(numbers[i] + " ");
                }

                int maximum=0;
                int index=-1;

                for (int i=0; i<numbers.length; i++) {
                    if (numbers[i] > maximum) {
                        maximum = numbers[i];
                        index = i;
                    }
                }
                System.out.println("Максимальное число:" +maximum);
                System.out.println("индекс" +index);
            }
        }

    }
}
