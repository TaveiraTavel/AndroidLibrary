package com.example.androidlibrary

import android.os.Build

class Environment {

    // >= API 21 testing Architecture != x86
    fun isx86(): Boolean {
        val processorArchitecture: String
        try {
            processorArchitecture = Build.SUPPORTED_ABIS.firstOrNull().toString()
        } catch(e: Exception) {
            return false
        }

        return processorArchitecture.contains("x86")
    }

}