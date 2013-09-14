package com.br.adapter;

import com.br.activitys.R;
 
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class MenuAdapter extends BaseAdapter {
        //Lista de pessoas!
	private String[] options;
	private LayoutInflater mInflater;
	private ViewHolder holder;
 
	public static final Integer[] images = { R.drawable.action_search,
        R.drawable.social_icon, R.drawable.password_icon, R.drawable.create_rote, R.drawable.logout_icon, R.drawable.car };
	
	
	static class ViewHolder{
		private TextView option;
		private ImageView img;
	}
 
 
	public MenuAdapter(Context context, String[] options) {
		mInflater = LayoutInflater.from(context);
		this.options = options;
	}
 
	@Override
	public int getCount() {
		return options.length;
	}
 
	@Override
	public Object getItem(int index) {
		return options[index];
	}
 
	@Override
	public long getItemId(int index) {
		return index;
	}
 
	@Override
	public View getView(int posicao, View convertView, ViewGroup arg2) {
 
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.drawer_list_item, null);
			holder = new ViewHolder();
 
			holder.option = (TextView) convertView.findViewById(R.id.txtMenuOption);
			holder.img = (ImageView) convertView.findViewById(R.id.menuImg);
 
			convertView.setTag(holder);
 
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
 
 
 
		holder.option.setText(options[posicao]);
		holder.img.setImageResource(images[posicao]);
 
		return convertView;
	}
 
}