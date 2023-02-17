/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhq.mathutil.main;

import com.nhq.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        System.out.println("aaaas");
        testFactoriaWrongArgumentThrowsException();
        
    }
    
    //Kiem thu xem ham getF() co chui hay ko neu n ca chon
    public static void testFactoriaWrongArgumentThrowsException() {
        //test case #6: test getF() with n = -1
        //Expected value: 1 cau CHUI N NHU C**
        //Thiet ke ham trong tinh huong xuat hien ngoai le
        System.out.println("Test -1!: expected: An Illegal Argument Exception is throw!!! "
                                 + "|actual:???");
        MathUtility.getFactorial(-1);
    }
    
    
    
    //Kiểm thử xem hàm getF() có đc viết đúng như thiết kê hay ko???
    //thiết kế đưa m tử tế 0..20 -> tính đc như kì vọng 
    //          đưa n cà CHỚN < 0 hoặc >20 -> chửi
    // ta phải giả lập các cách xài cả user hoặc của ai đó khác
    //cách xài nghĩa là đưa giá trị nào đó cho hàm -> xem hàm
    //trả về
    //Mỗi cách xài hàm ứng với 1 n thì hàm sẽ chạy với n đó
    //Mỗi cách xài hàm ta gọi là TEST CASE
    //Cú pháp con lạc đà camelCase notation
    //Tên hàm mang luôn ý nghĩa/ mục đích của việc 
    public static void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: Tinh huong xai ham so 1
        //              Test getF() with n = 0;
        //Expected value: 1
        //kiem thu xem ham getF() voi 1 tuc la tinh 1! coi co tra ve 1 ko?
        int n = 0;              //tinh n = 0
        long expectedValue = 1; //hi vong gia tri tra ve 1
        long actualValue = MathUtility.getFactorial(n); //tinh di xem cu the may
        System.out.println("Test" +  n + "!: expected :" + expectedValue 
                                                    + "|actual:" +actualValue);
        
        
        //test case #2: test getF() with n = 1
        //Expected value: 1
        //kiem thu xem ham getF() voi 1 tuc la tinh 1! coi co tra ve 1 ko?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test" +  n + "!: expected :" + expectedValue 
                                                    + "|actual:" +actualValue);
        
        //test case #3: test getF() with n = 2
        //Expected value: 2
        //kiem thu xem ham getF() voi 2 tuc la tinh 2! coi co tra ve 2 ko?
        System.out.println("Test 2!: expected:2"
                                 + "|actual:" + MathUtility.getFactorial(2));
        
        //test case #4: test getF() with n = 3
        //Expected value: 6
        //kiem thu xem ham getF() voi 2 tuc la tinh 3! coi co tra ve 6 ko?
        System.out.println("Test 3!: expected:6"
                                 + "|actual:" + MathUtility.getFactorial(3));
        
        //test case #5: test getF() with n = 5
        //Expected value: 120
        //kiem thu xem ham getF() voi 5 tuc la tinh 5! coi co tra ve 120 ko?
        System.out.println("Test 5!: expected:120"
                                 + "|actual:" + MathUtility.getFactorial(5));
    }

}