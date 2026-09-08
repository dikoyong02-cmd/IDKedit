package com.idkedit.core.timeline

import kotlin.math.abs

object SnapHelper {
    private const val DEFAULT_SNAP_THRESHOLD_US = 150_000L

        fun calculateSnapPositionUs(
                targetStartUs: Long,
                        targetDurationUs: Long,
                                snapPointsUs: List<Long>,
                                        playheadUs: Long? = null,
                                                thresholdUs: Long = DEFAULT_SNAP_THRESHOLD_US
                                                    ): Long {
                                                            val targetEndUs = targetStartUs + targetDurationUs
                                                                    val candidates = snapPointsUs.toMutableList()
                                                                            
                                                                                    playheadUs?.let { candidates.add(it) }

                                                                                            var minDistance = Long.MAX_VALUE
                                                                                                    var bestSnappedStartUs = targetStartUs

                                                                                                            for (point in candidates) {
                                                                                                                        val startDistance = abs(point - targetStartUs)
                                                                                                                                    if (startDistance <= thresholdUs && startDistance < minDistance) {
                                                                                                                                                    minDistance = startDistance
                                                                                                                                                                    bestSnappedStartUs = point
                                                                                                                                                                                }

                                                                                                                                                                                            val endDistance = abs(point - targetEndUs)
                                                                                                                                                                                                        if (endDistance <= thresholdUs && endDistance < minDistance) {
                                                                                                                                                                                                                        minDistance = endDistance
                                                                                                                                                                                                                                        bestSnappedStartUs = point - targetDurationUs
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                    return bestSnappedStartUs
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        