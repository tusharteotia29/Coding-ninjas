import java.util.ArrayList;
import java.util.*;

public class App {
    
         static int findcol(int arr[][],int i,int j){
        int mul =0;
        for(int k=0;k<4;k++){
            mul += arr[i][k]*arr[j][k];
        }
        return mul;
    }
    
    static int findrow(int arr[][],int i,int j){
        int mul =0;
        for(int k=0;k<4;k++){
            mul += arr[k][i]*arr[k][j];
        }
        return mul;
    }
    
    static void findr(int arr[][]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=2;i<4;i++){
            int pos =-1;
            int max = 0;
            for(int j=0;j<=list.size();j++){
                int ene = 0;
                if(j==0){
                    ene = 2*findrow(arr,list.get(j),i);
                }
                else if(j==list.size()){
                    ene = 2*findrow(arr,list.get(j-1),i);
                }else{
                    ene = 2*findrow(arr,list.get(j-1),i)+2*findrow(arr,list.get(j),i)-2*findrow(arr,list.get(j-1),list.get(j));
                }
                
                if(max<ene){
                    pos = j;
                    max = ene;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<list.size();j++){
                if(j==pos){
                    temp.add(i);
                }
                temp.add(list.get(j));
            }
            if(list.size()==pos){
                temp.add(i);
            }
            list = temp;
        }
        
        System.out.print("row    ");
        
        for(int i:list){
            System.out.print(list.get(i)+" ");
            
        }
        
        System.out.println();
    }
    
    static void findc (int arr[][]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=2;i<4;i++){
            int pos =-1;
            int max = 0;
            for(int j=0;j<=list.size();j++){
                int ene = 0;
                if(j==0){
                    ene = 2*findcol(arr,list.get(j),i);
                }
                else if(j==list.size()){
                    ene = 2*findcol(arr,list.get(j-1),i);
                }else{
                    ene = 2*findcol(arr,list.get(j-1),i)+2*findcol(arr,list.get(j),i)-2*findcol(arr,list.get(j-1),list.get(j));
                }
                
                if(max<ene){
                    pos = j;
                    max = ene;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<list.size();j++){
                if(j==pos){
                    temp.add(i);
                }
                temp.add(list.get(j));
            }
            if(list.size()==pos){
                temp.add(i);
            }
            list = temp;
        }
        
        System.out.print("column     ");
        
        for(int i:list){
            System.out.print(list.get(i)+" ");
            
        }
        
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int arr[][]= {{12,15,4,3},{15,6,17,2},{4,17,5,10},{3,2,10,9}};
        findc(arr);
        findr(arr);
    }
    
}

