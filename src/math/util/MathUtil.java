/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import static phat.util.MathUtility.PI;
import static phat.util.MathUtility.getFactorial;
//câu lệnh từ JDK 8 (5), khai báo sẵn hàm static,
//ở dưới gọi hàm ko cần chấm

/**
 *
 * @author ACER
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ta test thu ham cua ta
        // dung mat de so sanh ket qua thuc te khi chay va ket qua ta mong oi
        long expected = 120;//ta ong nhana 120 neu goi ham 5! 
        long actual  = getFactorial(5);
        System.out.println("5!: Expected: " + expected + "; Actual: " + actual);
        
        //expected: 720 if tinhs 6!
        System.out.println("6!: " + getFactorial(6));
        
        //expected: 1 if tinh 0!
        System.out.println("0!: " + getFactorial(0));
        
        //expected: IllegalArgumentException if tinh -5!
        System.out.println("-5: " + getFactorial(-5));
        
        //in thử PI coi có giống Math.PI hem?
        System.out.println("PI: " + PI);
    }
    
}

//muon ket luan ham minh ngon thi ta phai nhin bang mat cai ket qua nhin bang ham va so sanh voi ki vong
//làm từng trường hợp chạy hàm - test case
//cách này ổn, nhưng mất sức

//NÂNG CAO: ÙNG MÀU SẮC, XANH, ĐỎ ĐỂ KẾT LUẬN
//TA THẤY XANH, HÀM Ý MỌI TÌNH HUỐNG ỔN
//TA THẤY ĐỎ, THỈ 1 THẰNG MÀU ĐỎ, COI NHƯ HÀM TOANG
//TA XÀI THÊM 1 FRAMEWORK, UNIT TÉT TÊN CHUNG
//JUNIT,NUNIT, TESTING,...