package com.example.android.canberraattractions;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // Resource ID for the background colour for this list of words
    private int mColorResourceId;

    // New constructor
    public WordAdapter(Activity context, ArrayList<Word> nameForArrayOfWordObjects, int activityColour) {
        // the zero means we're initially not passing a view as it will be passed later???
        super(context, 0, nameForArrayOfWordObjects);
        mColorResourceId = activityColour;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the name from the current Word object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getName());

        // Find the address in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the address from the current Word object and
        // set this text on the address TextView
        addressTextView.setText(currentWord.getAddress());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact);
        // Get the contact from the current Word object and
        // set this text on the number TextView
        contactTextView.setText(currentWord.getContact());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website);
        // Get the website from the current Word object and
        // set this text on the number TextView
        websiteTextView.setText(currentWord.getmWebsite());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        // Set the theme colour for the list item
        View textContainer = listItemView.findViewById(R.id.word_item);

        // find the colour that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and two ImageViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
