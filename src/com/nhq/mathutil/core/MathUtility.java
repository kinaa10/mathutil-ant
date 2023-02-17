/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhq.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    
    //hàm Factorial là hàm tính n
    //quy ước: n! = 1 x 2 x 3 x 4 x ... xn
    //         1! = 1
    //         ko có giai thừa của số âm
    //thiết kế của hàm tính giai thừa của chúng ta
    ///hàm ko tính giai thừa âm
    //nếu đưa âm giai thừa -> chửi
    //                      ĐẬP VÀO MẶT NGƯỜI SAI 1 CÁI EXCEPTION
    //hàm ko tính 1 cái giai thừa 21 trở lên
    //vì kiểu long chỉ có tối đa 18 số 0
    //mà 21 giai thừa lớn hơn 18 số 0 -> tràn kiểu long
    //CHỬI LUÔN, ko SUPPORT GIAI THỪA ÂM, GIAI THỪA QUÁ BỰ
    //Người QC phải kiẻm tra xem hàm có hành xử đúng như thiết kế hay ko
    // phải test, thử nghiệm các TÌNH HUỐNG XÀI HÀM
    //                       các TEST CASE
    public static long getFactorial(int n) {
        if (n < 0 || n >21)
            throw new IllegalArgumentException("Invalid n. n must be between 0 .. 20");
        
        if (n == 0 || n ==1) 
            return 1;
        
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *=i;
            
        return product;
        
    }
}
