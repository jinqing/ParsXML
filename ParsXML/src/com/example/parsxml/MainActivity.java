package com.example.parsxml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import pull.PullBookParser;

import dom.DomBookParser;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		BookParser parser=new PullBookParser();
		try {
			InputStream is = getAssets().open("student.xml");
			List<Book> books=parser.parse(is);
			for (Book book : books) {  
                System.out.println(book.toString());  
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
