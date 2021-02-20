package com.example.learnfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CounterInterface {
    private lateinit var counterFragment: CounterFragment
    private lateinit var counterShowFragment: ShowCounterFragment
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment_one as CounterFragment
       counterShowFragment = fragment_two as ShowCounterFragment
    }
    //move to second activity
    fun toSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    override fun decrement() {
//        counter = Integer.parseInt(counterValue.text.toString())
        counter--
        counterShowFragment.notif(counter)
    }

    override fun increment() {
//        counter = Integer.parseInt(counterValue.text.toString())
        counter++
       counterShowFragment.notif(counter)
    }
}