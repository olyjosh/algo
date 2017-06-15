/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permuteStuff;

import java.util.ArrayList;

/**
 *
 * @author olyjosh
 */
public class Permute {

    public ArrayList<ArrayList<String>> permute(String[] num) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        permute(num, 0, result);
        return result;
    }

    void permute(String[] num, int start, ArrayList<ArrayList<String>> result) {

        if (start >= num.length) {
            ArrayList<String> item = convertArrayToList(num);
            result.add(item);
        }

        for (int j = start; j <= num.length - 1; j++) {
            swap(num, start, j);
            permute(num, start + 1, result);
            swap(num, start, j);
        }
    }

    private ArrayList<String> convertArrayToList(String[] num) {
        ArrayList<String> item = new ArrayList<String>();
        for (int h = 0; h < num.length; h++) {
            item.add(num[h]);
        }
        return item;
    }

    private void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String x []= {"Arsenal","Barca","Chelsea","Liverpool"};
        ArrayList<ArrayList<String>> permute = new Permute().permute(x);
//        for (ArrayList<String> permute1 : permute) {
//            
//            System.out.println(permute1+", ");
//        }
        for (int i = 0; i < permute.size(); i++) {
            System.out.println(permute.get(i)+", ");
            if((i+1)%3==0)System.out.println("");
        }
        
        System.out.println("size "+permute.size());
    }

}
