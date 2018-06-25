package net.kzn.onlineshoppingfront;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

@Component
public class hello
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public String helloworld() throws IOException
	{
		String t=br.readLine();
		return t;
	}

}
