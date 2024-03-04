package com.phuc.mathutil.test.core;

import com.phuc.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    //ÐÂY LÀ CLASS SE SD CAC HAM CUA THU VIEN/FRAMEWORK JUNIT
    //de kiem tra/ kiem tra code chinh- ham tinh giaiThua()  ben core..MathUtil
    // co nhieu quy tac dat ten ham kiem thu
    // nhung thuong la se noi len purpose cua cac case/ tinh huong kiem thu
    // tinh huong xai ham theo kieu thanh cong va that bai !!!
    //ham duoi day la tinh huong test ham chay thanh cong, tra ve ngon
    // ta se xai ham kieu well
    //@Test JUnit se phoi hop voi JVM de chay ham nay
    //@Test phia hau truong chinh la public static void main()
    //  
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

        //so sanh expected vs .actual dung xanh xanh do do
        Assert.assertEquals(expected, actual);

        //gop them vai case thanh cong
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));

        //ham giup so sanh 2 gia tri nao do co giong nhau hay ko
        //neu giong nhau -> throw mau xanh la cay -> code ngon
        //neu KO GIONG NHAU -> throw mau do-> code ko ngon
    }

    //hàm getF() ta thiet ke có 2 tình huong xu lí
    //1. dua data tu te [0...20] -> tinh dung dc n! - done
    //2. dua data cà chon, âm > 20; thiet ke cua hàm là ném ra ngoai le
    //TAO KY VONG NGOAI LE XUAT HIEN KHI N < 0 || N > 20 
    // rat mong ngoai le xuat hien vs n cà chon này
    
    //neu ham nhan vao n<0 hoac n>29 va ham nem ra ngoai le
    //ham chay dung nhu thiet ke
    
    
    //assertEquals ko dung de so sanh 2 ngoai le
    //      equals() la bang nhau hay ko tren value!!!
    @Test(expected = NumberFormatException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {

    }
}
