package com.example.noteapp.Adapters;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.Objects;

public class NotesListAdapter {

}
class NotesViewHolder extends RecyclerView.ViewHolder {

    cardView notes_container;
    TextView textView_title, textView_notes, textView_date;
    ImageView imageView_pin;

    public NotesViewHolder(@NonNull view itemView) {
        Super(itemView);
        notes_container = itemView.findViewById(R.id.notes_container);
        textView_title = itemView.findViewById(R.id.textView_title);
        textView_notes = itemView.findViewById(R.id.textView_notes);
        textView_date = itemView.findViewById(R.id.textView_date);
        imageView_pin = itemView.findViewById(R.id.imageView_pin);
    }

    private void Super(view itemView) {
    }

}
