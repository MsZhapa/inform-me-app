package com.example.mszhapa.informmeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MsZhapa on 19/07/2017.
 */

public class InformationAdapter extends ArrayAdapter<Information> {

    String mTitle;
    String mSection;
    String mDate;
    String mAuthor;

    public InformationAdapter(Context context, List<Information> informations) {

        super(context, 0, informations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.information_list_item, parent, false);
        }

        Information currentArticle = getItem(position);


        // Find the TextView with view ID magnitude
        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);
        // Format the magnitude to show 1 decimal place
        titleView.setText(currentArticle.getTitle());

        TextView sectionView = (TextView) listItemView.findViewById(R.id.article_section);
        sectionView.setText(currentArticle.getSection());

        TextView authorView = (TextView) listItemView.findViewById(R.id.article_author);
        authorView.setText(currentArticle.getAuthor());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.article_date);

        dateView.setText(currentArticle.getDate());

        return listItemView;
    }
}
