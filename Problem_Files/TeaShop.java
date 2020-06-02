/*Hello! Please order me:
  Peppermint Burst
  Cinnamon Silence
  Cosmic Petal
  Strawberry Lotus
  Crimson Tranquility
  Cayenne Twilight
  Thank you! */

import java.util.Scanner;

public class TeaShop {
	public static void main(String[] args) {
		System.out.println("Greetings and salutations, fellow humans and human fellas! Welcome to your favorite most certainly normal tea shop, Devin's Divine Delicacies! I'm your friendly local most definitely 100% human tea shop owner! Brave human, I hereby entrust you with the power to SELECT THE TEAS YOU WOULD LIKE TO DRINK! Very exciting, I know. We just got a snazzy new hexadecimal ordering system from our supporters in Snazzville, Snazzania. Give it a try!");
		Scanner s = new Scanner(System.in);
		String order = s.nextLine();
		s.close();
		System.out.println("An excellent choice! (All choices are excellent here at Devin’s Devine Delicacies)\nYou ordered: " + printArray(process(order)) + ". Here's your digital receipt because here we don’t support the senseless murder of the planet: \"pekoe{" + process(order)[1].replaceAll(" ", "_").toLowerCase() + "_" + order+"}\". Thank you for choosing Devin's Divine Delicacies for all your tea-related needs!");
	}

	static String printArray(String[] arr) {
		String s = "";
		for (int i = 0; i < arr.length - 1; i++) {
			s += arr[i] + ", ";
		}
		s += "and " + arr[arr.length - 1];
		return s;
	}

	static int item = 0;
	static String[] menu = {"Cosmic Petal",
							"Glowing Thrill",
							"Crimson Tranquility",
							"Sugary Passion",
							"Just Coffee (pathetic)",
							"Cinnamon Silence",
							"Strawberry Lotus",
							"Cloudy Whisper",
							"Peppermint Burst",
							"Oasis Berry",
							"Root Remedy",
							"Clover Quencher",
							"Radiance Blend",
							"Cayenne Twilight",
							"Cinder Flower",
							"Brisk Berry"};

	static String[] process(String order) {
		String[] tea = new String[order.length()];
		for (int i = 0; i < order.length(); i++) {
			int c = Integer.parseInt(order.substring(i, i + 1), 16);
			c += ++item - 7;
			c %= menu.length;
			if (c < 0) c += menu.length;
			c = menu.length - c - 1;
			tea[i] = menu[c];
			item += c * i;
		}
		return tea;
	}
}