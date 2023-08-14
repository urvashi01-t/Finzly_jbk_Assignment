package Vowel;

import java.util.Scanner;

public class VowelFind {
	public static void main(String srg[]) {


        String input = "education";
        CheckVowel checkvowel=new CheckVowel();
        boolean allVowelsPresent = checkvowel.checkAllVowelsPresent(input);
        
        if (allVowelsPresent) {
            System.out.println("All five vowels are present in."+input);
        } else {
            System.out.println("Not all five vowels are present in." +input);
        }
    }
       
	}

