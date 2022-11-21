package com.example.noteapp.Database;

import androidx.core.view.WindowInsetsCompat;

import com.example.noteapp.Models.Notes;

@Dao
public interface MainDAO {

    @Insert(onConflict = REPLACE)
    void insert(Notes notes);

    @Querry("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();

    @Querry("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);

    @Delete
    void delete(Notes notes);

}
