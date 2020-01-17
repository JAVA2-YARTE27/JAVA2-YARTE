import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct06
{
	public static void main(String[] args)throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		terminal.setCursorPosition(1,1);
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.setCursorPosition(1,2);
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.putCharacter('x');
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
