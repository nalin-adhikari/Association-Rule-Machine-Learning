/**
 * 
 */
package com.nalin.associationrule.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author nalin
 *
 */
public class Data {

	public static Map<String, Integer> removeOutNumber(Map<String, Integer> rawItemset) {

		Map<String, Integer> itemset = new TreeMap<String, Integer>();

		rawItemset.forEach((k, v) -> {
			if (v > 1) {
				itemset.put(k, v);
			}
		});

		rawItemset = null;

		return itemset;
	}
	
	public static List<String> extractItemset(Map<String, Integer> rawItemset){
		
		List<String> extractedItemset = new ArrayList<String>();
		
		rawItemset.forEach((k,v) -> {
			extractedItemset.add(k);
		});
		
		return extractedItemset;
	}
	
	public static List<List<String>> combineItemsetTwo(List<String> rawItemList){
		
		List<List<String>> itemsetList = new ArrayList<List<String>>();
		List<String> eachItemset;
		
		for(int i=0; i<rawItemList.size()-1; i++){
			
			for(int j=i+1; j<rawItemList.size(); j++){
				
				if(rawItemList.get(i) != rawItemList.get(j)){
					System.out.println(rawItemList.get(i)+","+rawItemList.get(j));
					eachItemset = new ArrayList<String>();
					eachItemset.add(rawItemList.get(i));
					eachItemset.add(rawItemList.get(j));
					itemsetList.add(eachItemset);
				}
			}
		}
		eachItemset= null;
		return itemsetList;
	}
}
