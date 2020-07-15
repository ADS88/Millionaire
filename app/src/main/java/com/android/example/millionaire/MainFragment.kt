package com.android.example.millionaire
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.android.example.millionaire.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var navController: NavController
    private var _binding : FragmentMainBinding? = null
    private val viewBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        navController = Navigation.findNavController(view)

        viewBinding.apply {
            playButton.setOnClickListener { navController.navigate(R.id.action_mainFragment_to_gameFragment) }
            instructionsButton.setOnClickListener { navController.navigate(R.id.action_mainFragment_to_instructionFragment) }
            highScoresButton.setOnClickListener { navController.navigate(R.id.action_mainFragment_to_highScoreFragment) }
        }


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
