//17.题目：求0—7所能组成的奇数个数。
//个位数  1   3   5   7     
//     11  13  15  17   21 23 25 27 。。。。。
//1.当只有一位数时也就是该数的最后一位，奇数个数为4
//2.当该数为两位数时，奇数个数为4*7=28
//3.当该数为三位数时，奇数个数为：4*8*7=224

package com.day3;

public class Dome17 {

	public static void main(String[] args) {
        int count = 0;
        //声明由数字组成的数
        int n = 8;
        //一位数
        count = n/2;
        //两位数
        count += (n-1)*n/2;
        //三位数
        count += (n-1)*n*n/2;
        //四位数
        count += (n-1)*n*n*n/2;
        //五位数
        count += (n-1)*n*n*n*n/2;
        //六位数
        count += (n-1)*n*n*n*n*n/2;
        //七位数
        count += (n-1)*n*n*n*n*n*n/2;
        System.out.println("0-7所能组成的奇数个数："+count);
    }

}
