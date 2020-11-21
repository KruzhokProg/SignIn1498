package com.example.signin1498.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Nature implements Parcelable{

    private String name;
    private String desc;
    private Integer image;
    // + 2 Integer

    public Nature(String name, String desc, Integer image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }


    protected Nature(Parcel in) {
        name = in.readString();
        desc = in.readString();
        if (in.readByte() == 0) {
            image = null;
        } else {
            image = in.readInt();
        }
    }

    public static final Creator<Nature> CREATOR = new Creator<Nature>() {
        @Override
        public Nature createFromParcel(Parcel in) {
            return new Nature(in);
        }

        @Override
        public Nature[] newArray(int size) {
            return new Nature[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(desc);
        if (image == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(image);
        }
    }
}
