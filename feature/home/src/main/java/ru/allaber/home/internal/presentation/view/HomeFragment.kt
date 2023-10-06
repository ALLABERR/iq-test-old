package ru.allaber.home.internal.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.allaber.home.R
import ru.allaber.home.databinding.FragmentHomeBinding
import ru.allaber.navigation.launchDeeplink
import ru.allaber.navigation.links.IntroDeepLink

internal class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.setOnClickListener {
            launchDeeplink(IntroDeepLink())
        }
    }
}
