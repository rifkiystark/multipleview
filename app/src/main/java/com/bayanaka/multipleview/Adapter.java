package com.bayanaka.multipleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bayanaka.multipleview.viewholder.ImageViewHolder;
import com.bayanaka.multipleview.viewholder.ListViewHolder;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {

    private static final int TYPE_IMAGE = 1;
    private static final int TYPE_LIST = 2;

    private ArrayList<DataModel> list;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == TYPE_IMAGE) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
            return new ImageViewHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
            return new ListViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = holder.getItemViewType();
        switch (viewType) {
            case TYPE_IMAGE:
                ImageViewHolder imageViewHolder = (ImageViewHolder) holder;

                break;

            case TYPE_LIST:
                ListViewHolder listViewHolder = (ListViewHolder) holder;
                listViewHolder.textView.setText("Ini adalah " + position);
                break;
        }
    }

    public ArrayList<DataModel> getList() {
        return list;
    }

    public void setList(ArrayList<DataModel> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getTYPE() == TYPE_IMAGE ? TYPE_IMAGE : TYPE_LIST;
    }
}
