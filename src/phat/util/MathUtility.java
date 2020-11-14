/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phat.util;

/**
 *
 * @author ACER
 */
public class MathUtility {
    //class này fake clss Math của JDK
    //Math của JDK có .abs() .squrt() .sin() .PI
    //chúng toàn là static, vì là thư viện dùng chung
    public static final double PI =3.1415;
    
    //hàm tính giai thừa: n! = 1.2.3.4..n
    //0! = 1! = 1
    //minh ko tính được giai thừa âm
    //21! cực lớn, tràn kiểu long, chứa ko nổi
    //int: tối da 2 tỷ 1 mấy
    //h mà tính giai thừa trong giới hạn đầu vào từ 0..20
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
//        if() // ngay mai bo viet tiep cam vang vi code len Github Xanh Do
        long result =1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
