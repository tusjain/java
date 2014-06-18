package convertVarargsToAnArray;

public class Main {
	  public static void main(String[] args) {
	    printMessage("H", "Y", ", ", "how ", "are ", "you", "?");
	  }

	  public static void printMessage(String... messages) {
	    String[] copiedMessage = messages;
	    for (int i = 0; i < messages.length; i++) {
	      System.out.print(copiedMessage[i]);
	    }
	  }
}