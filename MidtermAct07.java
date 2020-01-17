import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct07
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int x = 0, y = 0;

		for (; y < 2; y++) {
			terminal.setCursorPosition(x,y);
			terminal.putCharacter('X');

		for (; x < 20; ++x) {
			terminal.setCursorPosition(x,y);
			terminal.putCharacter('X');
			}
			x = 0;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
