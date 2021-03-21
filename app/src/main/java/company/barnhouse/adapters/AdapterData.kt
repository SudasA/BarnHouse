package company.barnhouse.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import company.barnhouse.R
import company.barnhouse.repo.Houses

class AdapterData : RecyclerView.Adapter<DataViewHolder>() {

    private var houses: List<Houses> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.house_data, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.onBind(houses[position])
    }

    override fun getItemCount(): Int = houses.size

    fun bindData(newData: List<Houses>) {
        houses = newData
    }
}

class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val houseName: TextView = itemView.findViewById(R.id.house_text)
    fun onBind(houses: Houses) {
        houseName.text = houses.houseName
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context

