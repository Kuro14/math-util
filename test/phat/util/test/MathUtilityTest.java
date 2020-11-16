/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phat.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import static phat.util.MathUtility.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    @Test //@Test biến hàm này thành public static void main()
    // cách đặt tên hàm sẽ nói lên mục tiêu tét hàm. Có nhiều quy tắc đặt tên
    //hàm test
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, getFactorial(6)); //xanh vì mình tính ra như kux thuật
        assertEquals(1, getFactorial(1));
    }
    
    //cần tét coi có ném về ngoại lệ hay ko??
    //nếu dúng là mày ném về ngoại lệ IllegalArgumentException trong
    //tình huống giai thừa -5 thì tao có màu xanh
    
     @Test (expected = SQLException.class)
     public void getFactorial_ThrowsException_IfValidArgument() {
         getFactorial(-5);
         
     }
     //ngoaij leej k phair laf value ko theer ddem ra so sanhs chir cos thể kiểm tra
     //coi nó có xuất hiện hay ko
    
}
