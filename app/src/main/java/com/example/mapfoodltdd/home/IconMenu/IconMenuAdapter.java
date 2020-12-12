package com.example.mapfoodltdd.home.IconMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mapfoodltdd.Order.Tab.Lichsu.MonAnModel;
import com.example.mapfoodltdd.R;

import java.util.ArrayList;

public class IconMenuAdapter extends BaseAdapter {

    Context context;
    ArrayList<IconModel> iconData;
    LayoutInflater layoutInflater;
    IconModel iconmenuModel;

    public IconMenuAdapter(Context context, ArrayList<IconModel> iconData) {
        this.iconData= iconData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return iconData.size();
    }

    @Override
    public Object getItem(int i) {
        return iconData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return iconData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row_iconmenu, null, true);
        }
        //link views
        ImageView imgicon = rowView.findViewById(R.id.imagemenu);
        TextView teniconmenu = rowView.findViewById(R.id.txticonmenu);

        iconmenuModel = iconData.get(position);

        imgicon.setImageResource(iconmenuModel.getIdimgicon());
        teniconmenu.setText(iconmenuModel.getIdtenicon());

        return rowView;
    }
}
