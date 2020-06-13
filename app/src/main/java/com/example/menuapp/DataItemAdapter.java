package com.example.menuapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.menuapp.model.DataItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataItemAdapter extends ArrayAdapter<DataItem> {
    List<DataItem> mDataItem;
    LayoutInflater mInflator;

    public DataItemAdapter(@NonNull Context context, @NonNull List<DataItem> objects) {
        super(context, R.layout.list_item, objects);

        mDataItem = objects;
        mInflator = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflator.inflate(R.layout.list_item, parent, false);
        }
        TextView tvName =convertView.findViewById(R.id.itemNameText);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        DataItem item = mDataItem.get(position);

        tvName.setText(item.getItemName());
        //imageView.setImageResource(R.drawable.apple_pie);
        InputStream inputStream = null;
        try {
            String imageFile=item.getImage();
            inputStream = getContext().getAssets().open(imageFile);
            Drawable d=Drawable.createFromStream(inputStream,null);
            imageView.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return convertView;
    }
}
