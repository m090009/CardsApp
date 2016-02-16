package com.tohamy.cardsapp;

import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import java.util.ArrayList;

/**
 * Created by tohamy on 2/13/16.
 */
public class CardsView {
    RecyclerView cardsViewRecyclerView;
    ArrayList<NowCard> nowCards;

    public CardsView(RecyclerView cardsViewRecyclerView, ArrayList<NowCard> nowCards) {
        this.cardsViewRecyclerView = cardsViewRecyclerView;
        this.nowCards = nowCards;
        bindAdapter();
    }

    public void bindAdapter(){
        this.cardsViewRecyclerView.setAdapter(new CardsViewAdapter());
        this.cardsViewRecyclerView
                .setLayoutManager(new LinearLayoutManager(cardsViewRecyclerView.getContext()));
    }

    class CardsViewAdapter extends RecyclerView.Adapter<NowCardViewHolder>{

        @Override
        public NowCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new NowCardViewHolder(View.inflate(parent.getContext(),
                    R.layout.now_card, null));
        }

        @Override
        public void onBindViewHolder(NowCardViewHolder holder, int position) {
            holder.update(nowCards.get(position));
        }

        @Override
        public int getItemCount() {
            return nowCards.size();
        }
    }

    class NowCardViewHolder extends RecyclerView.ViewHolder{
        TextView title, content;
        SimpleDraweeView image;
        public NowCardViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.content = (TextView) itemView.findViewById(R.id.content);
            this.image = (SimpleDraweeView) itemView.findViewById(R.id.image);
        }

        public void update(NowCard card){
            this.title.setText(card.getTitle());
            this.content.setText(card.getContent());
            requestImageResize(1000, 500, Uri.parse(FRESCO_RES+card.getImageUrl()), this.image);
        }

        String FRESCO_RES = "res://com.tohamy.cardsapp/";
        public void requestImageResize(int width, int height, Uri uri, SimpleDraweeView view){
            ResizeOptions imageResizeOption = new ResizeOptions(width/2, height/2);
            ImageRequest imageRequest = ImageRequestBuilder.newBuilderWithSource(uri)
                    .setResizeOptions(imageResizeOption)
                    .setLocalThumbnailPreviewsEnabled(true)
                    .build();
            AbstractDraweeController controller =
                    Fresco.newDraweeControllerBuilder()
                            .setOldController(view.getController())
                            .setImageRequest(imageRequest)
                            .setAutoPlayAnimations(true)
                            .build();
            try {
                view.setController(controller);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
