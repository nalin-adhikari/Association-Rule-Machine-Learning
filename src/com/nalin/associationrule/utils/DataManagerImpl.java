/**
 * 
 */
package com.nalin.associationrule.utils;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author nalin
 *
 */
public class DataManagerImpl implements DataManager {

	@Override
	public Map<String, Integer> removeOutNumber(Map<String, Integer> itemset) {

		Map<String, Integer> newItemset = new TreeMap<String, Integer>();

		itemset.forEach((k, v) -> {
			if (v > 1) {
				newItemset.put(k, v);
			}
		});

		itemset = null;

		return newItemset;
	}
}
