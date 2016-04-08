package com.example.admin.loadimageasync;

import android.os.AsyncTask;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by admin on 4/8/2016.
 */
public class ImageLoader extends AsyncTask<Void, Void, Void> {
    private  ImageView mImageView;
    private MainActivity mMainActivity;
    private Picasso mPicasso;

    public ImageLoader(MainActivity mMa, ImageView mIv){
        mImageView = mIv;
        mMainActivity = mMa;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        mPicasso.with(mMainActivity);
    }

    @Override
    protected Void doInBackground(Void... params) {

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
//        mPicasso.load("http://i.imgur.com/DvpvklR.png").into(mImageView);
        Picasso.with(mMainActivity).load("http://i.imgur.com/DvpvklR.png").into(mImageView);
    }
}
