package pack;

import java.io.Serializable;


public class Datagram implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String data;
	
	public Datagram(String data)
	{
		if(data.isEmpty())
		{
			data = null;
		}
		
		this.data = data;
	}
	
	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

}
