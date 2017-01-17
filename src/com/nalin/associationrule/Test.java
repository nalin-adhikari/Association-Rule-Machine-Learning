/**
 * 
 */
package com.nalin.associationrule;

import java.util.Map;

import com.nalin.associationrule.utils.Data;
import com.nalin.associationrule.utils.File;

/**
 * @author nalin
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, Integer> itemset = File.getData("/home/nalin/Desktop/apriori-test.txt");
		
		System.out.println(itemset.toString());
		
		itemset = Data.removeOutNumber(itemset);
		
		System.out.println(itemset.toString());
		
		
	}

}
