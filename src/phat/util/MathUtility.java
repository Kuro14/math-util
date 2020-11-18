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
    public static final double PI = 3.1415;

    //hàm tính giai thừa: n! = 1.2.3.4..n
    //0! = 1! = 1
    //minh ko tính được giai thừa âm
    //21! cực lớn, tràn kiểu long, chứa ko nổi
    //int: tối da 2 tỷ 1 mấy
    //h mà tính giai thừa trong giới hạn đầu vào từ 0..20
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0..20");
////        if() // ngay mai bo viet tiep cam vang vi code len Github Xanh Do
//        long result =1;
//        for(int i=2;i<=n;i++){
//            result*=i;
//        }
//        return result;
//    }
    //viết đệ quy cho hoành tráng
    //gọi lại chính mình với 1 quy mô khác
    //5! =5*4!, bắt tính 5!, khoan, tính 4! rồi tính tiếp
    //4! =4*3!, bắt tính 5!, khoan, tính 3! rồi tính tiếp
    //3! =3*2!, bắt tính 5!, khoan, tính 2! rồi tính tiếp
    //2! =2*1!, bắt tính 5!, khoan, tính 1! rồi tính tiếp
    //đệ quy phải có dimer dừng, ko đi miết à
    // rất dễ bị lặp vô tận new ko có dừng
    //1! = 1, quy ước rồi dừng, hồi ngược lại lên trên ra 5! 
    //kết luận: n! = n * (n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 || n == 1) 
            return 1; // ddieuef kienej dungwf, luif n maxi cungx phai den luc dung

            // n > 1 & n <= 20 rồi, ráp công thức đệ quy
        return n * getFactorial(n - 1);
        

    }

    // Minh minh hoaj khais niemej  Refactoring - tối ưu , chỉnh sửa lại code cho tốt hơn
    //Va minh họa khái niệm Regression Test, tét hồi quy, test lại nhưng gì đã từng TEST xanh, dể check xem code con XANH như trước không
    //sau khi đã sửa code
}
