package com.ejrope.kotlintrainingapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class ItemAdapter(val items: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}