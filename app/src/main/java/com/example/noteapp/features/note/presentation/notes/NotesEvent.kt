package com.example.noteapp.features.note.presentation.notes

import com.example.noteapp.features.note.domain.model.Note
import com.example.noteapp.features.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
