package com.idkedit.core.common

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.transformer.Composition
import androidx.media3.transformer.EditedMediaItem
import androidx.media3.transformer.ExportException
import androidx.media3.transformer.ExportResult
import androidx.media3.transformer.Transformer

class ProxyGenerator(private val context: Context) {

    interface ProxyCallback {
            fun onSuccess(outputPath: String)
                    fun onError(exception: Exception)
                        }

                            fun generateProxy(
                                    inputUri: String,
                                            outputPath: String,
                                                    callback: ProxyCallback
                                                        ) {
                                                                try {
                                                                            val mediaItem = MediaItem.fromUri(inputUri)
                                                                                        val editedMediaItem = EditedMediaItem.Builder(mediaItem)
                                                                                                        .setRemoveAudio(false)
                                                                                                                        .build()

                                                                                                                                    val transformer = Transformer.Builder(context)
                                                                                                                                                    .addListener(object : Transformer.Listener {
                                                                                                                                                                        override fun onCompleted(composition: Composition, exportResult: ExportResult) {
                                                                                                                                                                                                callback.onSuccess(outputPath)
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                        override fun onError(
                                                                                                                                                                                                                                                                composition: Composition,
                                                                                                                                                                                                                                                                                        exportResult: ExportResult,
                                                                                                                                                                                                                                                                                                                exportException: ExportException
                                                                                                                                                                                                                                                                                                                                    ) {
                                                                                                                                                                                                                                                                                                                                                            callback.onError(exportException)
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                })
                                                                                                                                                                                                                                                                                                                                                                                                                .build()

                                                                                                                                                                                                                                                                                                                                                                                                                            transformer.start(editedMediaItem, outputPath)
                                                                                                                                                                                                                                                                                                                                                                                                                                    } catch (e: Exception) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                callback.onError(e)
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            