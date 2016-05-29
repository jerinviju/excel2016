package com.example.jerin.excel2016.pojo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.util.BitSet;

/**
 * Created by jerin on 21/5/16.
 */
public class gallerypojo {
    Drawable image;
    String uploader;
    String nooflikes;
    String uploaderscomment;

    public gallerypojo(Drawable image,String name,String comment){
        this.image=image;
        this.uploader=name;
        this.uploaderscomment=comment;

    }


    public Drawable getImage(){
        return image;
    }
    public void setimage(Drawable image){
        this.image=image;
    }

    public String getUploader(){
        return uploader;
    }
    public void setUploader(String uploader){
        this.uploader=uploader;
    }

   public  String getNooflikes(){
        return nooflikes;
    }
    public  void setnooflikes(String nooflikes){
        this.nooflikes=nooflikes;
    }

    public String getUploaderscomment(){
        return uploaderscomment;
    }
    public void setUploaderscomment(String uploaderscomment){
        this.uploaderscomment=uploaderscomment;
    }

}
