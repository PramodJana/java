package inheritance;

public class AskMe implements SharedConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q= new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}

	static void answer(int result) {
		switch(result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		}
	}
}
