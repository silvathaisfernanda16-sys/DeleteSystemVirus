package com.delete.system.virus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.io.File

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                RootGate()
            }
        }
    }
}

/* ================= ROOT CHECK ================= */

fun hasRoot(): Boolean {
    val paths = arrayOf(
        "/system/bin/su",
        "/system/xbin/su",
        "/sbin/su",
        "/system/app/Superuser.apk",
        "/system/app/SuperSU.apk"
    )

    return paths.any { path ->
        File(path).exists()
    }
}

/* ================= UI ================= */

@Composable
fun RootGate() {
    val root = remember { hasRoot() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(if (root) Color(0xFF0F172A) else Color(0xFF2A0F0F)),
        contentAlignment = Alignment.Center
    ) {
        if (root) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "ROOT DETECTADO",
                    color = Color.Green,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "App liberado",
                    color = Color.White
                )
            }
        } else {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "SEM ROOT",
                    color = Color.Red,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "App não funciona",
                    color = Color.White
                )
            }
        }
    }
}
