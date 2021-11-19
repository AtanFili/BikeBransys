package com.gsixacademy.android.bikebransys.models

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import com.gsixacademy.android.bikebransys.R
import com.gsixacademy.android.bikebransys.adapters.BikeAdapter
import com.gsixacademy.android.bikebransys.api.BikesApi
import com.gsixacademy.android.bikebransys.api.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BikeFragment:Fragment() {

var bikelist:Boolean=false
    val request=ServiceBuilder.buildService(BikesApi::class.java)
    lateinit var bikeAdapter: BikeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.activity_bikes,container,false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val call=request.getBikes()
        call.enqueue(object :Callback<BikeResponce>{

            override fun onResponse(call: Call<BikeResponce>, response: Response<BikeResponce>) {
              if (response.isSuccessful){

                  var bikeResponce=response.body()
                  var bikeList=bikeResponce?.networks
                  if (bikeList!=null){
                      var bikelistAdapter=BikeAdapter(bikeList){}
                  }
              }
            }

            override fun onFailure(call: Call<BikeResponce>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}