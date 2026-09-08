package com.idkedit.core.model

import kotlinx.serialization.Serializable

@Serializable
data class ProjectData(
    val version: String = "1.0",
        val projectId: String,
            val projectName: String,
                val canvas: CanvasConfig,
                    val durationUs: Long,
                        val tracks: List<TrackData>
                        )

                        @Serializable
                        data class CanvasConfig(
                            val width: Int = 1080,
                                val height: Int = 1920,
                                    val fps: Int = 30
                                    )

                                    @Serializable
                                    data class TrackData(
                                        val id: String,
                                            val type: String, // "VIDEO", "AUDIO", "TEXT"
                                                val index: Int,
                                                    val isMuted: Boolean = false,
                                                        val clips: List<ClipData>
                                                        )

                                                        @Serializable
                                                        data class ClipData(
                                                            val id: String,
                                                                val mediaType: String,
                                                                    val sourceUri: String?,
                                                                        val proxyUri: String? = null,
                                                                            val timelineStartUs: Long,
                                                                                val timelineEndUs: Long,
                                                                                    val sourceStartUs: Long,
                                                                                        val sourceEndUs: Long,
                                                                                            val speed: Float = 1.0f,
                                                                                                val volume: Float = 1.0f
                                                                                                )
                                                                                                