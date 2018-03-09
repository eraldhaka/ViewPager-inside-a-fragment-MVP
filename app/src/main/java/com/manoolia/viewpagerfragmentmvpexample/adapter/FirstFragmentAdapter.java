package com.manoolia.viewpagerfragmentmvpexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.manoolia.viewpagerfragmentmvpexample.R;
import com.manoolia.viewpagerfragmentmvpexample.fragments.firstFragmentMVP.model.ListElements;

import java.util.List;

/**
 * Created by Erald on 3/9/2018.
 */

public class FirstFragmentAdapter extends RecyclerView.Adapter<FirstFragmentAdapter.ViewHolder> {

    //private Context mContext;
    //private String[] mList;

    private List<ListElements> feedItemList;
    private Context mContext;


    public FirstFragmentAdapter(Context context, List<ListElements> feedItemList) {
        this.feedItemList = feedItemList;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.adapter_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //holder.titleTextView.setText(mList[position]);
        final ListElements feedItem = feedItemList.get(position);

        holder.name.setText(feedItem.getName());

        Glide.with(mContext)
                .load(feedItem.getImage())
                .into(holder.image);
    }


    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textView);
            image = (ImageView) itemView.findViewById(R.id.imageView);

        }
    }
}
