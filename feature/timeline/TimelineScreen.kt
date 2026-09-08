package com.idkedit.feature.timeline

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.idkedit.core.model.ProjectData

@Composable
fun TimelineScreen(
    projectData: ProjectData?,
        modifier: Modifier = Modifier
        ) {
            Box(
                    modifier = modifier
                                .fillMaxWidth()
                                            .height(200.dp)
                                                        .background(Color(0xFF1E1E1E)),
                                                                contentAlignment = Alignment.Center
                                                                    ) {
                                                                            if (projectData == null || projectData.tracks.isEmpty()) {
                                                                                        Text(
                                                                                                        text = "미디어를 추가하여 편집을 시작하세요",
                                                                                                                        color = Color.Gray
                                                                                                                                    )
                                                                                                                                            } else {
                                                                                                                                                        Text(
                                                                                                                                                                        text = "총 트랙 수: ${projectData.tracks.size}",
                                                                                                                                                                                        color = Color.White
                                                                                                                                                                                                    )
                                                                                                                                                                                                            }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                