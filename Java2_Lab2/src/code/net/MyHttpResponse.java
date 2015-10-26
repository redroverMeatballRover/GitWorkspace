package code.net;

import java.io.IOException;
import java.io.OutputStream;

import edu.neumont.servlet.*;

public class MyHttpResponse implements HttpResponse {

//	public static void main(String[] args) {
//
//	}

	@Override
	public int getStatusCode() {
		return 0;
	}

	@Override
	public void setStatusCode(int code) {

	}

	@Override
	public String getContentType() {
		return null;
	}

	@Override
	public void setContentType(String contentType) {
		
	}

	@Override
	public OutputStream getOutputStream() {
		return null;
	}

	@Override
	public void flush() throws IOException {
		
	}

}
