package com.locobird00.rvproject

import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var vm = MainViewModel

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v= LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = vm.getTitles()[i]
        viewHolder.itemDetail.text = vm.getDetails()[i]
        viewHolder.itemImage.setImageResource(vm.getImages()[i])
    }

    override fun getItemCount(): Int {
        return vm.getTitles().size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
        }
    }
}