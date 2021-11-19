package com.gsixacademy.android.bikebransys.models
import android.os.Parcel
import android.os.Parcelable

class LatLongData ():Parcelable{
    var latitude:Double?=null
    var longidtude:Double?=null

    constructor(parcel: Parcel) : this() {
        latitude=parcel.readDouble()
        longidtude=parcel.readDouble()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        latitude?.let { parcel.writeDouble(it) }
        longidtude?.let { parcel.writeDouble(it) }
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LatLongData> {
        override fun createFromParcel(parcel: Parcel): LatLongData {
            return LatLongData(parcel)
        }

        override fun newArray(size: Int): Array<LatLongData?> {
            return arrayOfNulls(size)
        }
    }


}



