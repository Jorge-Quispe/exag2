package com.example.exag2.service;

import com.example.exag2.model.Libro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EditorialService {
    @GET("listar")
    Call<List<Libro>> getEditorial();

}
