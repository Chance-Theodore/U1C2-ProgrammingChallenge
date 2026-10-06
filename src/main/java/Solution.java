public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return ((t1 + t2 +t3 +t4) / 4);
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        if (roundedAverage >= 65) {
            return true;
        } else {
            return false;
        }
            
            
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (double)(shares * price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        int roundedValue = (int) Math.round(totalStock);
        return roundedValue;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        userDouble = (int)(userDouble * 100);
        int value = (int)userDouble;
            if (userDouble % 10 != 9) {
               value += 1;
            }else {
                value -= 9;
            }
            userDouble -= userDouble % 10;
             if (userDouble % 100 != 90) {
               value += 10;
            }else {
                value -= 90;
            }
            userDouble -= userDouble % 100;
            if (userDouble % 1000 != 900) {
                System.out.println(userDouble % 1000);
               value += 100;
            }else {
                value -= 900;
            }
            userDouble -= userDouble % 1000;
             if (userDouble % 10000 != 9000) {
               value += 1000;
            }else {
                value -= 9000;
            }
            userDouble -= userDouble % 10000;
             if (userDouble % 100000 != 90000) {
               value += 10000;
            }else {
                value -= 90000;
            }
            userDouble = (double) value / 100;
        return userDouble;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(459.89));
        //23.01
    }

}
