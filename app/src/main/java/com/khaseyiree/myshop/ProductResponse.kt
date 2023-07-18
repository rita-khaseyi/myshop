package com.khaseyiree.myshop

data class ProductsResponse(
    var products: List<Product>,
    var total: Int,
    var limit: Int,
    var skip: Int,
)