package com.example.googleplaystore.Interface

import com.example.googleplaystore.Model.ItemGroup

interface IFirebaseLoadListener {
    fun onFirebaseLoadSuccess(itemGroupList:List<ItemGroup>)
    fun onFirebaseLoadFailed(message:String)
}