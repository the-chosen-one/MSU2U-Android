package com.android.msu2u;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ButtonListAdapter extends ArrayAdapter<ButtonList>{
	Context context;
	private ButtonList[] data = null;
	static int layoutResourceId;
	
	public ButtonListAdapter(Context context, int layoutResourceId, ButtonList[] data){
		super(context, layoutResourceId, data);
        ButtonListAdapter.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data  = data;
        
	}
	
	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ButtonListHolder holder = null;
		
		if(row == null){
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);
			
			holder = new ButtonListHolder();
			holder.imgIcon = (ImageView)row.findViewById(R.id.list_image);
			holder.txtTitle = (TextView)row.findViewById(R.id.title);
			holder.txtSubTitle = (TextView)row.findViewById(R.id.subtitle);
			
			 row.setTag(holder);
		}else{
			holder = (ButtonListHolder)row.getTag();
		}
		
		ButtonList buttonList = data[position];
		holder.txtTitle.setText(buttonList.title);
		holder.txtSubTitle.setText(buttonList.subtitle);
		holder.imgIcon.setImageResource(buttonList.icon);
		
		return row;
			
		
		
	}
	
	 static class ButtonListHolder
	    {
	        ImageView imgIcon;
	        TextView txtTitle;
	        TextView txtSubTitle;
	    }
}