package ru.allaber.intro.internal.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.allaber.intro.R
import ru.allaber.intro.databinding.FragmentIntroBinding
import ru.allaber.navigation.launchDeeplink
import ru.allaber.navigation.links.HomeDeepLink

internal class IntroFragment : Fragment(R.layout.fragment_intro) {

    private val binding by viewBinding(FragmentIntroBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.setOnClickListener {
            launchDeeplink(HomeDeepLink())
        }
    }
}
