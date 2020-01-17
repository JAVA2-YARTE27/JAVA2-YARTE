import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct05
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		terminal.setCursorPosition(1,1);
		terminal.putCharacter('X');
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
