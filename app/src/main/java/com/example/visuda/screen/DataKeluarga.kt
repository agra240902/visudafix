package com.example.visuda.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.visuda.R
import com.example.visuda.navigation.Routes
import com.example.visuda.ui.theme.biru

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataKeluargaPage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(biru)
    ) {
        Column(
            modifier = Modifier
                .background(biru)
                .padding(top = 30.dp, bottom = 30.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color(0xFF0A2083))
                    .padding(vertical = 16.dp)
            ) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Data Keluarga",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .background(biru),
            contentAlignment = Alignment.TopCenter
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()

            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Column {
                    Card(
                        onClick = { navController.navigate(Routes.TambahData.route) },
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = biru,
                        ), modifier = Modifier.padding(start = 18.dp)
                    ) {
                        Text(
                            text = "Tambah Data",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFE7EBFD)
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp, horizontal = 18.dp)
                            .shadow(8.dp, shape = RoundedCornerShape(16.dp))
                    ) {
                        Row {
                            Text(
                                text = "Data Kepala Keluarga",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.SemiBold
                                ), modifier = Modifier.padding(start = 10.dp, bottom = 4.dp, top = 30.dp, end = 116.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(56.dp)
                            )
                        }
                        Text(
                            text = "Nama : Dew Jirawat",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Medium
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tanggal Lahir : 30 Oktober 2000",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Medium
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tempat Lahir : Batam",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Medium
                            ), modifier = Modifier.padding(start = 10.dp, bottom = 8.dp,)
                        )
                        Row {
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ),
                                modifier = Modifier.padding(start = 32.dp, top = 4.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(start = 50.dp, bottom = 8.dp, top = 8.dp, end = 50.dp)
                                ) {
                                    Text(
                                        text = "Edit",
                                        style = TextStyle(
                                            color = Color(0xFF0A2083),
                                            fontSize = 13.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium
                                        )
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_edit),
                                        contentDescription = null,
                                        tint = Color(0xFF0A2083),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 40.dp, bottom = 8.dp, top = 4.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(start = 50.dp, bottom = 8.dp, top = 8.dp, end = 50.dp)
                                ) {
                                    Text(
                                        text = "Detail",
                                        style = TextStyle(
                                            color = Color(0xFF0A2083),
                                            fontSize = 13.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium
                                        )
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_forward),
                                        contentDescription = null,
                                        tint = Color(0xFF0A2083),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                        }

                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFE7EBFD)
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp, horizontal = 18.dp)
                            .shadow(8.dp, shape = RoundedCornerShape(16.dp))
                    ){
                        Row {
                            Text(
                                text = "Data Istri",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.SemiBold
                                ), modifier = Modifier.padding(start = 10.dp, bottom = 4.dp, top = 30.dp, end = 206.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(56.dp)
                            )
                        }
                        Text(
                            text = "Nama : Dew Jirawat",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Medium
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tanggal Lahir : 30 Oktober 2000",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Medium
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tempat Lahir : Batam",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Medium,
                            ), modifier = Modifier.padding(start = 10.dp, bottom = 8.dp,)
                        )
                        Row {
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 32.dp, top = 4.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(start = 50.dp, bottom = 8.dp, top = 8.dp, end = 50.dp)
                                ) {
                                    Text(
                                        text = "Edit",
                                        style = TextStyle(
                                            color = Color(0xFF0A2083),
                                            fontSize = 13.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium
                                        )
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_edit),
                                        contentDescription = null,
                                        tint = Color(0xFF0A2083),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 40.dp, bottom = 8.dp, top = 4.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(start = 50.dp, bottom = 8.dp, top = 8.dp, end = 50.dp)
                                ) {
                                    Text(
                                        text = "Detail",
                                        style = TextStyle(
                                            color = Color(0xFF0A2083),
                                            fontSize = 13.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium
                                        )
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_forward),
                                        contentDescription = null,
                                        tint = Color(0xFF0A2083),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DataKeluargaPagePreview() {
    val navController = rememberNavController()
    DataKeluargaPage(navController = navController)
}
