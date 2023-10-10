package com.acc.a1.dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	
	
	
	
	public Dictionary() {
		DictionaryFeatures.initializeDefaultItems();
	}



	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			Dictionary dictionary = new Dictionary();
			
			System.out.println("Welcome to the Dictionary !!!");
			System.out.println("1. LookUp/Search a word\n2. Not sure of the word, want us to suggest?\n3. Add new entry/word in the dictionary\n4. Exit\nSelect what you want to perform: ");
			
			int choice = input.nextInt();
			String word = "";
			switch(choice) {
				
				case 1:
					System.out.print("Enter the word:");
					word = input.nextLine();
					DictionaryFeatures.lookupTheWordInDictionary(word);
					break;
				case 2:
					System.out.print("Enter the partial word you know:");
					word = input.nextLine();
					DictionaryFeatures.suggestTheWordFromDictionary(word);
					break;
				case 3:
					DictionaryFeatures.addNewEntryInDictionary();
					break;
				case 4:
					System.out.println("Good Bye, See you soon !!!");
					System.exit(0);
				
			}
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
		
	}

	
}
