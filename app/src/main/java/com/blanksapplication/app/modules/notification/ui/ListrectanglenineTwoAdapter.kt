package com.blanksapplication.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blanksapplication.app.R
import com.blanksapplication.app.databinding.RowListrectanglenineTwoBinding
import com.blanksapplication.app.modules.notification.`data`.model.ListrectanglenineTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglenineTwoAdapter(
  var list: List<ListrectanglenineTwoRowModel>
) : RecyclerView.Adapter<ListrectanglenineTwoAdapter.RowListrectanglenineTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglenineTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglenine_two,parent,false)
    return RowListrectanglenineTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglenineTwoVH, position: Int) {
    val listrectanglenineTwoRowModel = ListrectanglenineTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglenineTwoRowModel = list[position]
    holder.binding.listrectanglenineTwoRowModel = listrectanglenineTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglenineTwoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListrectanglenineTwoRowModel
    ) {
    }
  }

  inner class RowListrectanglenineTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglenineTwoBinding = RowListrectanglenineTwoBinding.bind(itemView)
  }
}
