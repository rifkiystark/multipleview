package com.bayanaka.multipleview.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bayanaka.multipleview.R;

public class ListViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ListViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tvlist);
    }
}
