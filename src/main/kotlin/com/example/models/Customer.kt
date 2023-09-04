package com.example.models

import kotlinx.serialization.Serializable

/**
 * @author Girdhar Singh Rathore
 * @date Sunday, September 03, 2023, 6:16 PM
 */
@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

val customerStorage = mutableListOf<Customer>()
