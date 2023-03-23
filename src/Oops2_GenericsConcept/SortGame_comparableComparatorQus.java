package Oops2_GenericsConcept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Sanju needs your help! He gets a list of employees with their salary. The maximum salary is 100.

Sanju is supposed to arrange the list in such a manner that the list is sorted in decreasing
order of salary. And if two employees have the same salary, they should be arranged in
lexicographical manner such that the list contains only names of those employees having salary
greater than or equal to a given number x.
Help Sanju prepare the same!

Input Format
On the first line of the standard input, there is an integer x. The next line contans integer N,
denoting the number of employees. N lines follow, which contain a string and an integer,
denoting the name of the employee and his salary.

Sample Input
79
4
Eve 78
Bob 99
Suzy 86
Alice 86

Sample Output
Bob 99
Alice 86
Suzy 86
 */
public class SortGame_comparableComparatorQus {

    int salary ;
    String name;

    public SortGame_comparableComparatorQus(String name , int salary){
        this.name = name;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n= sc.nextInt();
        SortGame_comparableComparatorQus[] emp = new SortGame_comparableComparatorQus[n];
        for (int i = 0; i < emp.length; i++) {
            String s = sc.next();
            int sal = sc.nextInt();
            emp[i]= new SortGame_comparableComparatorQus(s,sal);
        }

        Arrays.sort(emp, new Comparator<SortGame_comparableComparatorQus>() {
            @Override
            public int compare(SortGame_comparableComparatorQus o1, SortGame_comparableComparatorQus o2) {
                if(o1.salary== o2.salary){
                    return o1.name.compareTo(o2.name);
                }
                return o2.salary-o1.salary;
            }
        });

        for (int i = 0; i < n; i++) {
            if(emp[i].salary>=x){
                System.out.println(emp[i].name+ " "+emp[i].salary);
            }
        }

    }
}
