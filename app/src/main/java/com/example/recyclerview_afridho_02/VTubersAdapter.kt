package com.example.recyclerview_afridho_02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VTubersAdapter(private val context: Context, private val vtubers: List<VTubers>, val listener: (VTubers) -> Unit)
    : RecyclerView.Adapter<VTubersAdapter.VTubersViewHolder>(){

    class VTubersViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgVtubers = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameVtubers = view.findViewById<TextView>(R.id.tv_item_name)
        val descVtubers = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(vtubers: VTubers, listener: (VTubers) -> Unit){
            imgVtubers.setImageResource(vtubers.imgVtubers)
            nameVtubers.text = vtubers.nameVtubers
            descVtubers.text = vtubers.descVtubers
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VTubersViewHolder {
        return VTubersViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_vtubers, parent, false)
        )
    }

    override fun onBindViewHolder(holder: VTubersViewHolder, position: Int) {
        holder.bindView(vtubers[position], listener)
    }

    override fun getItemCount(): Int = vtubers.size
    }
