package Day4;

import java.util.Scanner;

public class MainCard {

	public static void main(String[] args) {
		MembershipCard memCard=new MembershipCard("hareesha","12E3456","2025/09/08",4);
		PaybackCard payCard=new PaybackCard("hareesha","12E3456","2025/09/08",1000,68789);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 or 2: ");
		int input=sc.nextInt();
		if(input==1) {
			System.out.println(memCard.getHolderName()+", "+memCard.getCardNumber()+", "+memCard.getExpiryDate()+", "+memCard.getRating());
		}
		else {
			System.out.println(payCard.getHolderName()+", "+payCard.getCardNumber()+", "+payCard.getExpiryDate()+", "+payCard.getPointsEarned()+", "+payCard.getTotalAmount());
		}
	}
}