package com.example.learnfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_counter.*


class CounterFragment : Fragment(), View.OnClickListener {

    private lateinit var countHandler : CounterInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        countHandler = activity as CounterInterface

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //memanggil xmlnya
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_plus.setOnClickListener(this)
        btn_minus.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view) {
            btn_plus -> {
                countHandler.increment()

            } btn_minus -> {
            println("decrease button called")
            countHandler.decrement()
            }
        }
    }
    companion object {
        @JvmStatic
        fun newInstance() = CounterFragment()
    }

}