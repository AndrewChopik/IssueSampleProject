package com.chopik.andrew.issuesampleproject

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println("view created second fragment")
    }

    override fun onStart() {
        super.onStart()

        println("start second fragment")
    }

    override fun onResume() {
        super.onResume()

        println("resume second fragment")
    }

    override fun onPause() {
        super.onPause()

        println("pause second fragment")
    }

    override fun onStop() {
        super.onStop()

        println("stop second fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        println("destroy view second fragment")
    }
}