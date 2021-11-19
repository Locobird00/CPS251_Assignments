package com.locobird00.rviproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var vm = MainViewModel
    var data = Data.newInstance()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v= LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = data.titles[vm.cardItems[i][0]]
        viewHolder.itemDetail.text = data.details[vm.cardItems[i][1]]
        viewHolder.itemImage.setImageResource(data.images[vm.cardItems[i][2]])
    }

    override fun getItemCount(): Int {
        return vm.cardItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)

            itemView.setOnClickListener{v: View ->

                var position: Int = adapterPosition

                var titleSelected = vm.cardItems[position][0]
                var detailSelected = vm.cardItems[position][1]
                var imageSelected = vm.cardItems[position][2]

                val i = Intent(v.context, MainActivity2::class.java)

                i.putExtra("title", titleSelected)
                i.putExtra("details", detailSelected)
                i.putExtra("image", imageSelected)

                startActivity(v.context, i, null)
            }
        }
    }
}