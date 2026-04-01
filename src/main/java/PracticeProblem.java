import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static ArrayList<String> perms (String str) {
		ArrayList<String> sus = new ArrayList<String>();
		theFunction("", str, sus);
		return sus;
	}

	public static void theFunction (String current, String remaining, ArrayList<String> sus) {
		if (remaining.length() == 0) {
			sus.add(current);
			return;
		}
		for (int i = 0; i < remaining.length(); i++) {
			theFunction(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1), sus);
		}
	}

	public static ArrayList<String> permsUnique (String str) {
		ArrayList<String> sus = new ArrayList<String>();
		theFunctionUnique("", str, sus);
		return sus;
	}

	public static void theFunctionUnique (String current, String remaining, ArrayList<String> sus) {
		if (remaining.length() == 0) {
			if (!sus.contains(current)) {
				sus.add(current);
			}
			return;
		}
		for (int i = 0; i < remaining.length(); i++) {
			theFunctionUnique(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1), sus);
		}
	}
}
