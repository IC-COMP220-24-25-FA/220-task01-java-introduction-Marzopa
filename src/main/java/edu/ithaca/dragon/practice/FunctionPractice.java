package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first<0 || second<0 || third<0){
            throw new IllegalArgumentException("Numbers can't be zero!");
        }
        if (third>=second && third>=first){
            return third;
        }
        else if (second>=third && second>=first){
            return second;
        }
        else{
            return first;
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        return (originalPrice * (100-discountPercent)/100) * (100+salesTax)/100;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (fetchedThePaperToday || yearsOld>=30){
            return true;
        }
        else if (daysSinceShoesChewed >= 2*yearsOld && yearsOld<=5){
            return true;
        }
        return false;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.isEmpty()){
            return -1;
        }
        int max = numbers.get(0);
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>max){
                max = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.isEmpty()){
            return -1;
        }
        int max = numbers.get(0);
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>=max){
                max = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
