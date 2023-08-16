public class App {
//     public static void main(String[] args) {
//     //     String a="coding";
//     // for(int i=2;i<4;i++)
//     // {
//     //     System.out.print(a.substring(i));
// //     // }
// //     String a ="abcd";
// // String b="abcda";
// // System.out.println(a.compareTo(b));

// // String str1="abc";
// // String str2=new String("abc");
// // System.out.println(str1==str2);

// StringBuffer str1=new StringBuffer("");
// for(int i=0;i<5;i++)
// {
//     str1.append((char)('a'+i));
// }
// System.out.println(str1);
// }
// }
public static void  fun(int[][] arr2d)
{

    for(int i=0;i<arr2d.length;i++)
    {
        for(int j=0;j<arr2d[i].length;j++)
        {
            arr2d[i][j]=2*i+j;
        }
    }
}
public static void main(String[] args) 
{ 
    int[][] arr = new int[2][2]; 
    fun(arr);
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(arr[i][j]+" " );
        }
    }
} 
}
      


