package com.example.noteapp.features.note.domain.use_case

import com.example.noteapp.features.note.domain.model.Note
import com.example.noteapp.features.note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}