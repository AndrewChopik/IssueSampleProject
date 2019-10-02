package com.chopik.andrew.issuesampleproject

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println("view created first fragment")
    }

    override fun onStart() {
        super.onStart()

        println("start first fragment")
    }

    override fun onResume() {
        super.onResume()

        println("resume first fragment")
    }

    override fun onPause() {
        super.onPause()

        println("pause first fragment")
    }

    override fun onStop() {
        super.onStop()

        println("stop first fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        println("destroy view first fragment")
    }
}