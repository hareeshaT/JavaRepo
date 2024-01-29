package com.service;

public class Arithmetic {
	public void add() {
		System.out.println("Add");
	}
	public String add1() {
		return "return Add";
	}
	public void food(String var) {
		var = "chapathi";
		System.out.println(var);
	}
	public int quantity(int var) {
		var*=2;
		return var;
	}
	public int money(int a,int b) {
		return( a+b);
	}
	public void money2(int a,int b) {
		System.out.println(a+b);
	}
	
	public float money3(int a) {
		return a;
	}
	
	public double money4(float a, double b) {
		return a*b;
	}
	
	public char gender(String name) {
		return 'M';
	}
	
	public boolean large(int a, int b) {
		if(a>b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int array(int[] oddseries) {
		int sum=0;
		for (int i = 0; i < oddseries.length; i++) {
			sum+=oddseries[i];
		}
		return sum; 
	}
	
	public int sizearray(int n) {
		int sum=0;
		int[] var=new int[n];
		for (int i = 0; i < n; i++) {
		    var[i] =  i * 10;
		    sum+=var[i];
		}
		return sum;
	}
	
	public int chararray(char[] chars) {
		int cnt=0;
		for (int i = 0; i < chars.length; i++) {
			cnt++;
		}
		return cnt;
	}
	
	public int[] stringarray(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			arrays[i]+=10;
		}
		return arrays;
	}
	
	public char[] vowel(String word,char[] vowels) {
		char[] newarr= new char[word.length()];
		int cnt=0;
		for(int i=0;i<word.length();i++) {
			for(int j = 0; j < vowels.length; j++) {
				if(word.charAt(i)==vowels[j]) {
					cnt++;
					newarr[i]=word.charAt(i);
				}
			}
		}
		System.out.println(cnt);
		return newarr;
	}
	
	public static void countCharacterOccurrences(String word) {
        int[] charFrequency = new int[26]; // Assuming only lowercase letters

        for (char c : word.toCharArray()) {
            char cLower = Character.toLowerCase(c);
            if (cLower >= 'a' && cLower <= 'z') { // Exclude non-letter characters
//            	System.out.println(cLower);
//              System.out.println(++charFrequency[cLower - 'a']);
            	charFrequency[cLower - 'a']++;
            }
        }
        for (int i = 0; i < charFrequency.length; i++) {
        	//System.out.println(charFrequency[i]);
            if (charFrequency[i] > 0) {
                char c = (char) ('a' + i);
                //System.out.println(charFrequency[i]);
                System.out.println("'" + c + "': " + charFrequency[i]);
            }
        }
    }
	
	
	public int[] evenodd(int[] numarr) {
		int[] cntarray=new int[2];
		int evencnt=0;
		int oddcnt=0;
		for(int i=0;i<numarr.length;i++) {
			if(numarr[i]%2==0) {
				//System.out.println(numarr[i]);
				evencnt++;
			}
			else {
				//System.out.println(numarr[i]);
				oddcnt++;
			}
		}
		cntarray[0]=evencnt;
		cntarray[1]=oddcnt;
		
		return cntarray;
	}
	
}
