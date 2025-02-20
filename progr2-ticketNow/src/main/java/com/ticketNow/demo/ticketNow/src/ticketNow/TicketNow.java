package ticketNow;

import java.util.Scanner;
import ticketNow.User;
import ticketNow.Post;

public class TicketNow {
	private static User u = new User();  
	public void openingScreen() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please press 1 for login \n 2 for register");
		int ans1 = inp.nextInt();
			if (ans1 == 1) {
				u.login(ans1);
			} else if(ans1 ==2) {
				u.register(ans1);
			}		
		mainCourse();
	}

	public static void mainCourse () {
		System.out.println("Press 1 to view latest posts,2 to add a new post, 3 to log out");
		Scanner inp = new Scanner(System.in);
		Post p = new Post(u.getUsername());
		int ans2 = inp.nextInt();
		if (ans2 == 1) {
			p.viewPosts();
			mainCourse();
		} else if (ans2 == 2) {
			p.addPost(u.getUsername());
			mainCourse();
		} else if (ans2 == 3) {
			System.out.println("See you later");
			System.exit(0);
		}
	}
}

