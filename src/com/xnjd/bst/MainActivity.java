package com.xnjd.bst;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class MainActivity extends SherlockActivity {

	public GridView gridView;
	String[] items;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.setTitle("交大百事通");
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		gridView=(GridView) findViewById(R.id.mainView);
		items=getResources().getStringArray(R.array.items);
		ArrayList<HashMap<String,Object>> listImageItem=new ArrayList<HashMap<String,Object>>();
		for (int i = 0; i <items.length; i++) {
			HashMap<String, Object> map=new HashMap<String, Object>();
			map.put("itemImage", R.drawable.ic_launcher);
			map.put("itemText",items[i]);
			listImageItem.add(map);
			SimpleAdapter aSimpleAdapter=new SimpleAdapter(this,
					listImageItem,
					R.layout.main_item,
					new String[]{"itemImage","itemText"},
					new int[]{R.id.main_item_imageView,R.id.main_item_textView}
					);
			gridView.setAdapter(aSimpleAdapter);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 getSupportMenuInflater().inflate(R.menu.main, menu);    
	     return super.onCreateOptionsMenu(menu);  
		/*
		 * 
		 * add()方法的四个参数，依次是：
		 * 
		 * 1、组别，如果不分组的话就写Menu.NONE,
		 * 
		 * 2、Id，这个很重要，Android根据这个Id来确定不同的菜单
		 * 
		 * 3、顺序，那个菜单现在在前面由这个参数的大小决定
		 * 
		 * 4、文本，菜单的显示文本
		 */

	/*	menu.add(Menu.NONE, Menu.FIRST + 1, 5, "删除").setIcon(

		android.R.drawable.ic_menu_delete);

		// setIcon()方法为菜单设置图标，这里使用的是系统自带的图标，同学们留意一下,以

		// android.R开头的资源是系统提供的，我们自己提供的资源是以R开头的

		menu.add(Menu.NONE, Menu.FIRST + 2, 2, "保存").setIcon(

		android.R.drawable.ic_menu_edit);

		menu.add(Menu.NONE, Menu.FIRST + 3, 6, "帮助").setIcon(

		android.R.drawable.ic_menu_help);

		menu.add(Menu.NONE, Menu.FIRST + 4, 1, "添加").setIcon(

		android.R.drawable.ic_menu_add);

		menu.add(Menu.NONE, Menu.FIRST + 5, 4, "详细").setIcon(

		android.R.drawable.ic_menu_info_details);

		menu.add(Menu.NONE, Menu.FIRST + 6, 3, "发送").setIcon(

		android.R.drawable.ic_menu_send);
		return true;*/
		
	}

}
