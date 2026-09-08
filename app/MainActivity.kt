package com.idkedit.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.idkedit.feature.timeline.EditorScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
                    setContent {
                                MaterialTheme {
                                                Surface(modifier = Modifier.fillMaxSize()) {
                                                                    EditorScreen(projectData = null)
                                                                                    }
                                                                                                }
                                                                                                        }
                                                                                                            }
                                                                                                            }
                                                                                                            