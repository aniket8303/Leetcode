import java.util.*;
class Solution{
	public static void main(String[] args) {
		System.out.println(getRow(3));
		System.out.println(getRow(0));
		System.out.println(getRow(1));
	}
	public static List<Integer> getRow(int rowIndex) {
        rowIndex++;
        int a [][] =new int[rowIndex][];
        for(int i = 1; i<=rowIndex ; i++){
            a[i-1] = new int[i];
        } 
        for(int i = 0;i<a.length; i++){
            for(int j = 0; j<a[i].length;j++){
                a[i][j]=1;
            }
        }
        for(int i = 1; i<rowIndex-1 ; i++){
            for(int j = 0; j<a[i].length-1 ; j++){
                a[i+1][j+1] = a[i][j] + a[i][j+1];
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int j = 0; j<a[rowIndex-1].length;j++){
            list.add(a[rowIndex-1][j]);
        }
        return list;
    }
}