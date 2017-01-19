package mailExtractor;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.auxilii.msgparser.Message;
import com.auxilii.msgparser.MsgParser;

public class ParserTest {
	
	
	public static void main(String [] args){
		try {
			MsgParser msgp = new MsgParser();
	
			Handler[] handlers = Logger.getLogger("").getHandlers();
			for (int index = 0; index < handlers.length; index++) {
				handlers[index].setLevel(Level.INFO);
			}
			Logger logger = Logger.getLogger(MsgParser.class.getName());
			logger.setLevel(Level.INFO);
			
			Message msg = null;
			
			String testFile = "/Users/naunidhsingh/Documents/workspace/MarginCall/data/sample.msg";
			
			msg = msgp.parseMsg(testFile);
			System.out.println("---------------------------------------");
			System.out.println("Parsed message:\n"+msg.toString());
			System.out.println("---------------------------------------");
			System.out.println(msg.getConvertedBodyHTML());
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
