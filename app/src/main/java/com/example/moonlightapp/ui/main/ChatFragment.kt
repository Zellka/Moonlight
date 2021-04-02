package com.example.moonlightapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.MessagingAdapter
import com.example.moonlightapp.entity.Message
import com.example.moonlightapp.utils.BotResponse
import com.example.moonlightapp.utils.Constants.RECEIVE_ID
import com.example.moonlightapp.utils.Constants.SEND_ID
import kotlinx.coroutines.*

class ChatFragment : Fragment() {

    private lateinit var btnSend:Button
    private lateinit var enterMes:EditText
    private lateinit var recyclerView: RecyclerView

    private var messagesList = mutableListOf<Message>()

    private lateinit var adapter: MessagingAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_chat, container, false)
        btnSend = root.findViewById(R.id.btn_send)
        enterMes = root.findViewById(R.id.enter_message)
        recyclerView = root.findViewById(R.id.rv_messages)
        recyclerView()

        clickEvents()

        customBotMessage("Привет! Вам нужна помощь?")
        return root
    }

    private fun recyclerView() {
        adapter = MessagingAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    private fun clickEvents() {
        btnSend.setOnClickListener {
            sendMessage()
        }
        enterMes.setOnClickListener {
            GlobalScope.launch {
                delay(100)
                withContext(Dispatchers.Main) {
                    recyclerView.scrollToPosition(adapter.itemCount - 1)

                }
            }
        }
    }
    private fun sendMessage() {
        val message = enterMes.text.toString()

        if (message.isNotEmpty()) {
            messagesList.add(Message(message, SEND_ID))
            enterMes.setText("")

            adapter.insertMessage(Message(message, SEND_ID))
            recyclerView.scrollToPosition(adapter.itemCount - 1)

            botResponse(message)
        }
    }
    private fun botResponse(message: String) {
        GlobalScope.launch {
            delay(2000)
            withContext(Dispatchers.Main) {
                val response = BotResponse.basicResponses(message)
                messagesList.add(Message(response, RECEIVE_ID))
                adapter.insertMessage(Message(response, RECEIVE_ID))
                recyclerView.scrollToPosition(adapter.itemCount - 1)
            }
        }
    }
    override fun onStart() {
        super.onStart()
        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main) {
                recyclerView.scrollToPosition(adapter.itemCount - 1)
            }
        }
    }
    private fun customBotMessage(message: String) {
        GlobalScope.launch {
            delay(100)
            withContext(Dispatchers.Main) {
                messagesList.add(Message(message, RECEIVE_ID))
                adapter.insertMessage(Message(message, RECEIVE_ID))

                recyclerView.scrollToPosition(adapter.itemCount - 1)
            }
        }
    }
}