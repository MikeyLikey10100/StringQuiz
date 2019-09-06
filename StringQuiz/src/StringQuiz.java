import java.util.Scanner;

public class StringQuiz
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				Scanner stringInput = new Scanner (System.in);
				
				System.out.println("Pick two words please");
				
				String words = stringInput.nextLine();
				
				String word1 = words.substring(0, words.indexOf(' ') );
				String word2 = words.substring(words.indexOf(' ') + 1);
				
				System.out.println(word1.toLowerCase() + word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase());
			}

	}
