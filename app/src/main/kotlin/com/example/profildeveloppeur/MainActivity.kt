package com.example.profildeveloppeur

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.profildeveloppeur.ui.theme.ProfilDeveloppeurTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilDeveloppeurTheme {
                DeveloperProfileScreen(
                    profile = sampleDeveloperProfile(),
                    onContactClick = {
                        // Action de contact à implémenter plus tard
                    },
                    onProjectClick = {
                        // Action sur un projet à implémenter plus tard
                    }
                )
            }
        }
    }
}
