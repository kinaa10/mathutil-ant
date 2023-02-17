package com.nhq.mathutil.core.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nhq.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //ta sẽ test tiếp getF() với n cà chớn ( n<0 hoặc n>21)
    //THIẾT KẾ HÀM GETF() NHƯ SAU
    //NẾU ĐƯA n tử tế 0..20 thì hàm tính ngon
    //nếu đưa n < 0 , n> 21 -> hàm ném ra ngoại lệ
    //tên là Illegal Argument Exception
    //JUnit 4 ko có hàm assertEqual() cho Exceprion
    //JUnit 5 có hàm assertThrow()
    //dùng chiêu ko phải assertE()
     //để đo lường , lắng nghe xem cí ngoại lệ hay ko
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumetThrowsException() {
        MathUtility.getFactorial(-2);
    }
    //ta se viet test case kiem tra ham F() chay dung hay ko neu dua dau vao tu te
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: test F() with n = 0
        //Expeceted value: 1, kiem tra 0! co la 1
        //                      check if 0! == 1 or not
        int n= 0;
        long expected =1;
        long actual = MathUtility.getFactorial(n); //goi ham ma tinh
        
        Assert.assertEquals(expected, actual);
        //xanh neu 2 tk = nhau, do neu 2 tk khac nhau 
        
        //Test case #2: test F() with n = 1
        //Expeceted value: 1, kiem tra 1! co la 1
        //                      check if 1! == 1 or not
        n= 1;
        expected =1;
        actual = MathUtility.getFactorial(n); //goi ham ma tinh
        
        Assert.assertEquals(expected, actual);
        
        //Test case #3: test F() with n = 2
        //Expeceted value: 2, kiem tra 2! co la 2
        //                      check if 2! == 2 or not
        
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        
        //Test case #4: test F() with n = 3
        //Expeceted value: 6, kiem tra 3! co la 6
        //                      check if 3! == 6 or not
        
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        
        //Test case #5: test F() with n = 5
        //Expeceted value: 120, kiem tra 5! co la 120
        //                      check if 5! == 120 or not
        
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void testRedGreen() {
        Assert.assertEquals(96, 96);
    }
    
}
