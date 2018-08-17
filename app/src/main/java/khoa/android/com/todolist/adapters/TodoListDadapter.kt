package khoa.android.com.todolist.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import khoa.android.com.todolist.R
import khoa.android.com.todolist.models.Category
import kotlin.collections.ArrayList

public class TodoListDadapter(var arrayItem: ArrayList<Category>): RecyclerView.Adapter<TodoListDadapter.CategoryItemHolder>() {


    override fun getItemCount(): Int {
        return arrayItem.size
    }

    override fun onBindViewHolder(holder: CategoryItemHolder?, position: Int) {
        holder?.tvName?.text = arrayItem[position].name
        holder?.imgCheck?.setImageResource(R.drawable.check_circle)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CategoryItemHolder {
        val itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_to_do, parent, false)
        return CategoryItemHolder(itemView)
    }


    inner class CategoryItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView
        var imgCheck: ImageView
        var isCheck: Boolean

        init {

            tvName = itemView.findViewById(R.id.txtName) as TextView
            imgCheck = itemView.findViewById(R.id.imgChecked) as ImageView
            isCheck = false;

        }
    }

}

