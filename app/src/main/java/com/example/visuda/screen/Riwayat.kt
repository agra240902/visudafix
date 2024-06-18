package com.example.visuda.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RiwayatPage(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF0A2083))
    ) {
        TopAppBar(
            title = {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Riwayat Pengajuan", style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp))
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color(0xFF0A2083),
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),
            actions = {
                IconButton(onClick = { /* Handle search icon press */ }) {
                    Icon(Icons.Filled.Search, contentDescription = "Search")
                }
            }
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF0A2083))

        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier.fillMaxSize()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Section(title = "Hari Ini")
                    SubmissionCard(
                        title = "Surat Pengantar RT/RW",
                        date = "17/01/2024",
                        status = "Dibatalkan",
                        statusColor = Color.Red
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Section(title = "Bulan Lalu")
                    SubmissionCard(
                        title = "Surat Pengantar RT/RW",
                        date = "17/01/2024",
                        status = "Selesai",
                        statusColor = Color.Green
                    )
                }
            }
        }
    }
}

@Composable
fun Section(title: String) {
    Text(
        text = title,
        style = TextStyle(
            color = Color(0xFF0A2083),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(bottom = 8.dp)
    )
}

@Composable
fun SubmissionCard(title: String, date: String, status: String, statusColor: Color) {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = title,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(
                    text = date,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .background(statusColor, CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = status,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RiwayatPagePreview() {
    val navController = rememberNavController()
    RiwayatPage(navController = navController)
}