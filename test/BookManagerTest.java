/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angshuman
 */
public class BookManagerTest {
    public static void main(String[] args){
        // Unit test to check write to csv
        BookManager obj = new BookManager("dtb.csv");
//        obj.saveInfo("Publisher,debanjan,author,ENGLISH,978-1-56619-909-4,213414,/home/angshuman/Pictures/Screenshot_20210104_110819.png,5634243");
        System.out.println(obj.getTotalBooks());
        obj.deleteBook(1);
    }
}