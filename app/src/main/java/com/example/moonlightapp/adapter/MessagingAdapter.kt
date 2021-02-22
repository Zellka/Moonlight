package com.example.moonlightapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.utils.Constants.RECEIVE_ID
import com.example.moonlightapp.utils.Constants.SEND_ID
import com.example.moonlightapp.R
import kotlinx.android.synthetic.main.message_item.view.*
import com.example.moonlightapp.entity.Message

class MessagingAdapter : RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {

    var messagesList = mutableListOf<Message>()

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder =
        MessageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.message_item, parent, false)
        )

    override fun getItemCount(): Int = messagesList.size

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messagesList[position]

        when (currentMessage.id) {
            SEND_ID -> {
                holder.itemView.your_message.apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
                holder.itemView.bot_message.visibility = View.GONE
                holder.itemView.bot_message_time.visibility = View.GONE
                holder.itemView.your_message_time.text = currentMessage.time
            }
            RECEIVE_ID -> {
                holder.itemView.bot_message.apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
                holder.itemView.your_message.visibility = View.GONE
                holder.itemView.your_message_time.visibility = View.GONE
                holder.itemView.bot_message_time.text = currentMessage.time
            }
        }
    }

    fun insertMessage(message: Message) {
        this.messagesList.add(message)
        notifyItemInserted(messagesList.size)
    }
}