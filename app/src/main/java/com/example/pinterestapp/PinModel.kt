package com.example.pinterestapp

data class PinModel(
    val total :Int,
    val hits:List<ImageModel>,
    val totalHits:Int
        )

data class ImageModel (
    val largeImageURL:String
        )
