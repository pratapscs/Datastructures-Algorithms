package com.datastructures.demo;

/*Hashtable - class - was part of the original java.util and is a concrete
 *                    implementation of a Dictionary.
 * 
 * For example, in an address list hash table you could store and sort data based 
 *              on a key such as ZIP code rather than on a person's name.
 */
import java.util.*;

public class HashTableDemo 
{

   @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String args[]) {
      // Create a hash map
      Hashtable balance = new Hashtable();
      java.util.Enumeration names;
      String str;
      double bal;

      balance.put("Zara", new Double(3434.34));
      balance.put("Mahnaz", new Double(123.22));
      balance.put("Ayan", new Double(1378.00));
      balance.put("Daisy", new Double(99.22));
      balance.put("Qadir", new Double(-19.08));

      // Show all balances in hash table.
      names = balance.keys();
      while( names.hasMoreElements()) {
         str = (String) (names.nextElement());
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      // Deposit 1,000 into Zara's account
      bal = ((Double)balance.get("Zara")).doubleValue();
      balance.put("Zara", new Double(bal+1000));
      System.out.println("Zara's new balance: " +
      balance.get("Zara"));
   }
}