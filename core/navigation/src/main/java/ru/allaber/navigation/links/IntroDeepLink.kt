package ru.allaber.navigation.links

import android.net.Uri
import androidx.core.net.toUri
import ru.allaber.navigation.DeepLink

class IntroDeepLink : DeepLink {
    override val uri: Uri get() = "app://allaber_iq_intro".toUri()
}
