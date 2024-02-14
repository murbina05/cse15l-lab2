import java.io.IOException;
import java.net.URI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class ChatHandler implements URLHandler {
  public String chatHistory = "";

  public String handleRequest(URI url) {

    // expect /chat?user=<name>&message=<string>
    if (url.getPath().equals("/add-message")) {
      String[] params = url.getQuery().split("&");
      String[] shouldBeMessage = params[0].split("=");
      String[] shouldBeUser = params[1].split("=");
      this.chatHistory = this.chatHistory + String.format("\n%s: %s", shouldBeUser[1], shouldBeMessage[1]);
      System.out.println(this.chatHistory);
      return this.chatHistory;
    }
    else if (url.getPath().equals("/"))  {
      return "Hello, use add-message to add messagess";
    }
 
    return "404 Not Found";
   }
}

class ChatServer {
  public static void main(String[] args) throws IOException {
    int port = Integer.parseInt(args[0]);
    Server.start(port, new ChatHandler());
  }
}
