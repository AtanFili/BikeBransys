package com.gsixacademy.android.bikebransys.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.drawToBitmap
import androidx.recyclerview.widget.RecyclerView
import com.gsixacademy.android.bikebransys.R
import com.gsixacademy.android.bikebransys.models.Bikemodel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.bike_list.view.*

class BikeAdapter (
    var bikelist:ArrayList<Bikemodel>,
    val onBikeItemClicked:(BikeOnClickEvent)->Unit
        ):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.bike_list,parent,false))

    }

    override fun getItemCount(): Int {
        return bikelist.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(bikelist[position], position)

    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(bikemodel: Bikemodel, position: Int) {
            itemView.bike_name_text_view.text=bikemodel.name
            itemView.city_Textview.text=bikemodel.city
            itemView.cityCountryCodeText_view.text=bikemodel.country
            itemView.locationText_view.text=bikemodel.location.toString()




        }
    }




}


