package com.example.visuda.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.visuda.R
import com.example.visuda.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPage(navController: NavHostController) {
    val NIK = remember { mutableStateOf(TextFieldValue()) }
    val NamaLengkap = remember { mutableStateOf(TextFieldValue()) }
    val password = remember { mutableStateOf(TextFieldValue()) }
    val WilayahRT = remember { mutableStateOf(TextFieldValue()) }
    val WilayahRW = remember { mutableStateOf(TextFieldValue()) }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bglogin),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 175.dp),
            contentAlignment = Alignment.Center
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
                LazyColumn(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    item {
                        Text(
                            text = "Daftar Sekarang",
                            style = TextStyle(
                                color = Color(0xFF0A2083),
                                fontSize = 24.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    item {
                        Column {
                            Text(
                                text = "NIK",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Start,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            TextField(
                                placeholder = { Text(text = "Masukkan NIK", style = TextStyle(color = Color.Gray)) },
                                value = NIK.value,
                                onValueChange = { NIK.value = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp)),
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black,
                                ),
                                textStyle = TextStyle(textAlign = TextAlign.Start)
                            )

                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    item {
                        Column {
                            Text(
                                text = "Nama Lengkap",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Start,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            TextField(
                                placeholder = { Text(text = "Masukkan Nama Lengkap", style = TextStyle(color = Color.Gray)) },
                                value = NamaLengkap.value,
                                onValueChange = { NamaLengkap.value = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp)),
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black
                                ),
                                textStyle = TextStyle(textAlign = TextAlign.Start)
                            )

                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    item {
                        Column {
                            Text(
                                text = "Kata Sandi",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Start,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            TextField(
                                placeholder = { Text(text = "Masukkan Kata Sandi", style = TextStyle(color = Color.Gray)) },
                                value = password.value,
                                onValueChange = { password.value = it },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp)),
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black
                                ),
                                textStyle = TextStyle(textAlign = TextAlign.Start)
                            )

                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    item {
                        Column {
                            Text(
                                text = "Wilayah RT",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Start,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            TextField(
                                placeholder = { Text(text = "Masukkan Wilayah RT", style = TextStyle(color = Color.Gray)) },
                                value = WilayahRT.value,
                                onValueChange = { WilayahRT.value = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp)),
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black
                                ),
                                textStyle = TextStyle(textAlign = TextAlign.Start)
                            )

                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    item {
                        Column {
                            Text(
                                text = "Wilayah RW",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Start,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            TextField(
                                placeholder = { Text(text = "Masukkan Wilayah RW", style = TextStyle(color = Color.Gray)) },
                                value = WilayahRW.value,
                                onValueChange = { WilayahRW.value = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp)),
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black
                                ),
                                textStyle = TextStyle(textAlign = TextAlign.Start)
                            )

                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    item {
                        Button(
                            onClick = { navController.navigate(Routes.Login.route) },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0A2083)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                        ) {
                            Text(text = "Daftar", color = Color.White)
                        }

                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    item {
                        ClickableText(
                            text = buildAnnotatedString {
                                append("Sudah punya akun? ")
                                withStyle(style = SpanStyle(color = Color.Blue, fontWeight = FontWeight.Bold)) {
                                    append("Login")
                                }
                                append(" disini")
                            },
                            onClick = {
                                navController.navigate(Routes.Login.route)
                            },
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily.Default,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DaftarPagePreview() {
    val navController = rememberNavController()
    DaftarPage(navController = navController)
}
