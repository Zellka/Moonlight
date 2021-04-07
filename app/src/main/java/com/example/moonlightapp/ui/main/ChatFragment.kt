package com.example.moonlightapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moonlightapp.R
import com.example.moonlightapp.adapter.MessagingAdapter
import com.example.moonlightapp.entity.Message
import com.example.moonlightapp.utils.BotResponse
import kotlinx.coroutines.*

class ChatFragment : Fragment() {

    private lateinit var btnSend: ImageButton
    private lateinit var enterMes: EditText
    private lateinit var recyclerView: RecyclerView

    private var messagesList = mutableListOf<Message>()

    private lateinit var adapter: MessagingAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSend = view.findViewById(R.id.btn_send)
        enterMes = view.findViewById(R.id.enter_message)
        recyclerView = view.findViewById(R.id.rv_messages)
        adapter = MessagingAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        clickEvents()
        customBotMessage(getString(R.string.first_mes_bot))
    }

    private fun clickEvents() {
        btnSend.setOnClickListener {
            val message = enterMes.text.toString()

            if (message.isNotEmpty()) {
                messagesList.add(Message(message, Companion.SEND_ID))
                enterMes.setText("")

                adapter.insertMessage(Message(message, Companion.SEND_ID))
                recyclerView.scrollToPosition(adapter.itemCount - 1)

                botResponse(message)
            }
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

    private fun botResponse(message: String) {
        GlobalScope.launch {
            delay(2000)
            withContext(Dispatchers.Main) {
                val response = BotResponse.basicResponses(message)
                messagesList.add(Message(response, Companion.RECEIVE_ID))
                adapter.insertMessage(Message(response, Companion.RECEIVE_ID))
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
                messagesList.add(Message(message, Companion.RECEIVE_ID))
                adapter.insertMessage(Message(message, Companion.RECEIVE_ID))

                recyclerView.scrollToPosition(adapter.itemCount - 1)
            }
        }
    }

    companion object {
        private const val RECEIVE_ID = "RECEIVE_ID"
        private const val SEND_ID = "SEND_ID"
    }
}