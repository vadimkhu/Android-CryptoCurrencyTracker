package com.example.cracker

import android.content.res.Resources
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item.view.*

class RecyclerViewAdapter(private val result: ResponseDTO,
                          val resources: Resources) : RecyclerView.Adapter<RecyclerViewAdapter.CardViewHolder>() {
    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(result: ResponseDTO, position: Int, resources: Resources) {
            val size = result.data?.size ?: return
            if (position >= size) return
            val items: List<DataDTO> = result.data.filterNotNull()
            if (items.size <= position) return
            val item: DataDTO = items[position]

            val cryptocurrencyId = item.id
            val imgData = "https://s2.coinmarketcap.com/static/img/coins/128x128/$cryptocurrencyId.png"

            itemView.symbol.text = item.symbol
            itemView.name.text = item.name

            Picasso.get().load(imgData).resize(190, 190).into(itemView.image_view)

            itemView.money.text = "%.6f".format(item.quote?.uSD?.price ?: 0) + "$"
            itemView.days.text = "%.2f".format(item.quote?.uSD?.percentChange7d ?: 0) + "%"
            itemView.hours.text = "%.2f".format(item.quote?.uSD?.percentChange24h ?: 0)  + "%"
        }
    }

    override fun getItemCount() = result.data?.size ?: 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.item, parent, false)
        return CardViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) = holder.bind(result, position, resources)
}