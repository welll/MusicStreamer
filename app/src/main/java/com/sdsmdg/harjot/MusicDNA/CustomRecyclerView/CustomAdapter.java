package com.sdsmdg.harjot.MusicDNA.CustomRecyclerView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sdsmdg.harjot.MusicDNA.Models.UnifiedTrack;
import com.sdsmdg.harjot.MusicDNA.R;
import com.sdsmdg.harjot.MusicDNA.VisualizerView;
import com.sdsmdg.harjot.MusicDNA.imageLoader.ImageLoader;
import com.squareup.picasso.Picasso;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by Harjot on 22-Nov-16.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context ctx;
    SnappyRecyclerView recyclerView;
    List<UnifiedTrack> queue;
    ImageLoader imgLoader;

    public CustomAdapter(Context ctx, SnappyRecyclerView recyclerView, List<UnifiedTrack> queue) {
        this.ctx = ctx;
        this.recyclerView = recyclerView;
        this.queue = queue;
        imgLoader = new ImageLoader(ctx);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_visualizer_element, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        UnifiedTrack ut = queue.get(position);
        holder.albumArt.setAlpha(0.35f);
        if (ut.getType()) {
            holder.albumArt.setImageBitmap(getBitmap(ut.getLocalTrack().getPath()));
        } else {
            Picasso.with(ctx).load(ut.getStreamTrack().getArtworkURL()).into(holder.albumArt);
        }
    }

    @Override
    public int getItemCount() {
        return queue.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView albumArt;

        public ViewHolder(View itemView) {
            super(itemView);
            albumArt = (ImageView) itemView.findViewById(R.id.album_art_container_v);
        }
    }

    public Bitmap getBitmap(String url) {
        try {
            android.media.MediaMetadataRetriever mmr = new MediaMetadataRetriever();
            mmr.setDataSource(url);
            Bitmap bitmap = null;

            byte[] data = mmr.getEmbeddedPicture();

            if (data != null) {
                bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
                return bitmap;
            } else {
                return null;
            }
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
