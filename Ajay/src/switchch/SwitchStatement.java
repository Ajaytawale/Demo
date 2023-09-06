package switchch;

public class SwitchStatement {

	public static void main(String[] args) {

		int age = 65;
		String country = "India";

		switch (country) {

		case "India": {
			System.out.println("you are indian citizen");
			if (age > 18) {
				System.out.println("you are eligible for voting");
			} else {
				System.out.println("your age less than 18 so you are not eligible for vote");
			}
			break;
		}
		default: {
			System.out.println("you are not indian citizen, so you can not vote for india");
		}
		}
		System.out.println("---------------------------------------------------------------------");
		// string array
		String atr[] = { "dh", "ah" };
		System.out.println(atr[1]);
		System.out.println("------------------------------------------------------------------------");
	
		}
	}

