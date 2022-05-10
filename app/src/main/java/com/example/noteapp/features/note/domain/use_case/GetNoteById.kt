package com.example.noteapp.features.note.domain.use_case

import com.example.noteapp.features.note.domain.model.Note
import com.example.noteapp.features.note.domain.repository.NoteRepository

class GetNoteById(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNote(id)
    }
}