package app.shigenawa.ass.imagealbum

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context: Context) :
       RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    val items:MutableList<ImageData> = mutableListOf()

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageView: ImageView =view.findViewById(R.id.imageView)
        val imageView3:ImageView=view.findViewById(R.id.imageView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.item_imge_data_cell,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=items[position]
        holder.imageView.setImageResource(item.leftImage)
        holder.imageView3.setImageResource(item.rightImage)
    }
    fun addAll(items:List<ImageData>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}