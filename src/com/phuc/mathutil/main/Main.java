
package com.phuc.mathutil.main;

import com.phuc.mathutil.core.MathUtil;

/**
 *
 * @author Phuctr
 */
public class Main {
    public static void main(String[] args) {
        // thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hay ko
        // ta phai dua ra cac tinh huong su dung ham trong thuc te
        // vi du: -5 coi tinh dc hok
        //          0 coi tinh dc bnhiu
       //       21 coi tinh dc bnhiu
       //   ==> TEST CASE:  là
       
       long expected = 120;  // tao ki vong ham tra ve 120 neu tinh 5!
       int n = 5;                   // input
       long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + "(expected)");
        System.out.println("5! = " + actual + "(actual)");
       
        
    }
}
