package com.android.example.millionaire


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.play_button).setOnClickListener (this)
        view.findViewById<Button>(R.id.instructions_button).setOnClickListener (this)
        view.findViewById<Button>(R.id.high_scores_button).setOnClickListener (this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.play_button -> navController.navigate(R.id.action_mainFragment_to_gameFragment)
            R.id.instructions_button -> navController.navigate(R.id.action_mainFragment_to_instructionFragment)
            R.id.high_scores_button -> navController.navigate(R.id.action_mainFragment_to_highScoreFragment)
        }
    }


}
