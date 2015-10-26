import java.io.OutputStream;


public interface HttpResponse {
	int getStatusCode();
	void setStatusCode(int code);
	String getContentType();
	void setContentType();						
	OutputStream getOutputStream();

}
