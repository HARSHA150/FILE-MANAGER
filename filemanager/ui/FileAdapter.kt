package com.example.ui.filemanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.io.File


class FileAdapter(private val context: Context, private val files: List<File>) :
    RecyclerView.Adapter<FileAdapter.FileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileViewHolder {
        val view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return FileViewHolder(view)
    }

    override fun onBindViewHolder(holder: FileViewHolder, position: Int) {
        holder.bind(files[position])
    }

    override fun getItemCount(): Int = files.size

    class FileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(file: File) {
            val textView = itemView.findViewById<TextView>(android.R.id.text1)
            textView.text = file.name
        }
    }
}

