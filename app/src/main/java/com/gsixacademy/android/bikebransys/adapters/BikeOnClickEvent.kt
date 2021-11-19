package com.gsixacademy.android.bikebransys.adapters

import com.gsixacademy.android.bikebransys.models.Bikemodel

sealed class BikeOnClickEvent {
    data class onBikeItemClicked(val bikeId : Int?):BikeOnClickEvent()

}
