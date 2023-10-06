package ru.allaber.navigation.links

import android.net.Uri
import androidx.core.net.toUri
import ru.allaber.navigation.DeepLink

class HomeDeepLink : DeepLink {
    override val uri: Uri get() = "app://allaber_iq_home".toUri()
}
