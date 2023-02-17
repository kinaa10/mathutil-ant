/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhq.mathutil.core.test;

import com.nhq.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {

    //chuẩn bị data là mảng 2 chìu kiểu OBJ
    //JUnit tự loop duyệt mảnh tách data ra
    //giúp ta nhồi đồ vào hàm assertEqual()
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        return new Object[][]
                                {{0, 1},
                                {1, 1},
                                {3, 6 },
                                {4, 24},
                                {5, 120},
                                {6, 720}};

    }
    
    //map từng cột của từng dòng vào 2 biến tương ứng n và expected
    @Parameterized.Parameter(value = 1) //em thích cột 1
    public long expected;
    
    @Parameterized.Parameter(value = 0)
    public int n;
    
    //so sánh expected và actual
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        
    }
}
