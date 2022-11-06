package com.example.hellojetpackcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hellojetpackcompose.viewModels.TodosViewModel

@Composable
fun FirstScreen(
    todosViewModel: TodosViewModel = hiltViewModel()
) {

    val todos by todosViewModel.todos.collectAsState()
    todosViewModel.load()

    LazyColumn {
        items(items = todos) { todo ->
            Text(text = todo.text)
        }
    }
}