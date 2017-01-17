/**
 * 
 */
package com.nalin.associationrule.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nalin
 *
 */
public class FileManagerImpl implements FileManager {

	private BufferedReader br;
	private FileReader fr;
	private Map<String, Integer> itemset;

	@Override
	public void getData(String filePath) {

		String line;
		String[] items;

		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		br = new BufferedReader(fr);

		itemset = new HashMap<String, Integer>();

		try {
			while ((line = br.readLine()) != null) {
				items = line.split(",");
				for (String item : items) {
					if (itemset.containsKey(item)) {
						int count = itemset.get(item);
						itemset.remove(item);
						itemset.put(item, ++count);
					} else {
						itemset.put(item, 1);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
