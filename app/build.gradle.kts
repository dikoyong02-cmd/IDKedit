plugins {
        alias(libs.plugins.android.application)
            alias(libs.plugins.kotlin.android)
}

android {
        namespace = "com.idkedit.app"
            compileSdk = 34

                defaultConfig {
                            applicationId = "com.idkedit.app"
                                    minSdk = 24
                                            targetSdk = 34
                                                    versionCode = 1
                                                            versionName = "1.0"
                                                                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                    buildTypes {
                                release {
                                                isMinifyEnabled = false
                                                            proguardFiles(
                                                                                getDefaultProguardFile("proguard-android-optimize.txt"),
                                                                                                "proguard-rules.pro"
                                                            )
                                }
                    }
                        compileOptions {
                                    sourceCompatibility = JavaVersion.VERSION_17
                                            targetCompatibility = JavaVersion.VERSION_17
                        }
                            kotlinOptions {
                                        jvmTarget = "17"
                            }
                                buildFeatures {
                                            compose = true
                                }
}

dependencies {
        implementation(project(":core"))
            implementation(project(":feature"))
                implementation(libs.androidx.core.ktx)
                    implementation(libs.androidx.lifecycle.runtime.ktx)
                        implementation(libs.androidx.activity.compose)
}

}
                                }
                            }
                        }
                                                            )
                                }
                    }
                }
}
}