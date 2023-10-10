/**
 * 
 */
package com.acc.a1.dictionary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class DictionaryFeatures {
	private static HashMap<String, String> dictionaryItems = new HashMap<>();
	
	public static void lookupTheWordInDictionary(String lookupWord) {
		
		try {
			if (dictionaryItems.containsKey(lookupWord)) {
				System.out.println("Definition: " + dictionaryItems.get(lookupWord));
			} else
				System.out.println("The entered word is not found in the dictionary");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

	public static void suggestTheWordFromDictionary(String lookupWord) {
	
		Set <String> keysList = new HashSet<>();
		Set <String> suggestions = new HashSet<>();
		keysList = dictionaryItems.keySet();
		
		for(String s: keysList) {
			if(s.startsWith(lookupWord))
				suggestions.add(s);
		}
		
		if (!suggestions.isEmpty())
			System.out.println("Suggested words: "+ suggestions.toString().replace("[", "").replace("]", ""));
		else
			System.out.println("No words found in the dictionary matching the letters you have entered");
		
	}

	public static void addNewEntryInDictionary() {
		// TODO Auto-generated method stub
		
	}
	
	public static void initializeDefaultItems() {
		
		dictionaryItems.put("COMPUTER", "A machine that can be programmed to carry out sequences of arithmetic or logical operations");
		dictionaryItems.put("DEVELOPER", "A person or thing that develops something");
		dictionaryItems.put("HARDWARE", "It refers to tools, machinery, and other durable equipment");
		dictionaryItems.put("SOFTWARE", "The programs and other operating information used by a computer.");
		dictionaryItems.put("SCIENCE", "The systematic study of the structure and behavior of the physical and natural world through observation, experimentation, and the testing of theories against the evidence obtained");
		dictionaryItems.put("JUMP", "Push oneself off a surface and into the air by using the muscles in one's legs and feet");
		dictionaryItems.put("LISTEN", "Give one's attention to a sound");
		dictionaryItems.put("READ", "Look at and comprehend the meaning of by mentally interpreting the characters or symbols of which it is composed");
		dictionaryItems.put("SHOUT", "Utter a loud call or cry, typically as an expression of a strong emotion");
		dictionaryItems.put("SLEEP", "A condition of body and mind that typically recurs for several hours every night, in which the eyes are closed, the postural muscles relaxed, the activity of the brain altered, and consciousness of the surroundings practically suspended");
		dictionaryItems.put("COMPLIMENT", "A polite expression of praise or admiration");
		dictionaryItems.put("COMPASSION", "A sympathetic pity and concern for the sufferings or misfortunes of others");
		dictionaryItems.put("HARDWORK", "A great deal of effort or endurance");
	}

}
