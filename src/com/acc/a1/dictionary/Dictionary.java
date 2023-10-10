package com.acc.a1.dictionary;

import java.util.Scanner;

/**
 * This is the base class of this application used to interact with the user via console
 */
public class Dictionary {
	// Constructor to initialize few words in the dictionary
	public Dictionary() {
		DictionaryFeatures.initializeDefaultItems();
	}

	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			Dictionary dictionary = new Dictionary(); // calling the constructor

			//Interacting with the user to get the choice of action they need to perform
			System.out.println("Welcome to the Dictionary !!!");
			System.out.println("1. LookUp/Search a word\n2. Not sure of the word, want us to suggest?\n3. Add new entry/word in the dictionary\n4. Exit\nSelect what you want to perform: ");

			int choice = Integer.parseInt(input.nextLine());
			String word = "";
			switch (choice) {

			case 1:
				System.out.print("Enter the word:");
				word = input.nextLine();
				DictionaryFeatures.lookupTheWordInDictionary(word.toUpperCase());
				break;
			case 2:
				System.out.print("Enter the partial word you know:");
				word = input.nextLine();
				DictionaryFeatures.suggestTheWordFromDictionary(word.toUpperCase());
				break;
			case 3:
				System.out.print("Enter the new word:");
				word = input.nextLine();
				System.out.print("Enter the definition of " + word + ": ");
				String definition = input.nextLine();
				DictionaryFeatures.addNewEntryInDictionary(word.toUpperCase(), definition);
				break;
			case 4:
				System.out.println("Good Bye, See you soon !!!");
				System.exit(0);
			default:
				System.out.println("Invalid input, Please try again with a valid input...");
			}
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}	
	}	
}
