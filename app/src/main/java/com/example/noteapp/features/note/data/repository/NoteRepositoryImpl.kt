package com.example.noteapp.features.note.data.repository

import com.example.noteapp.features.note.data.source.NoteDao
import com.example.noteapp.features.note.domain.model.Note
import com.example.noteapp.features.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

    override suspend fun getNote(id: Int): Note? {
        return noteDao.getNote(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}