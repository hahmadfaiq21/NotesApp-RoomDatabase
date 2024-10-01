package com.github.hahmadfaiq21.noteapp.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.github.hahmadfaiq21.noteapp.database.Note
import com.github.hahmadfaiq21.noteapp.repository.NoteRepository

class AddUpdateNoteViewModel(application: Application) : ViewModel() {

    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }

    fun update(note: Note) {
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }

}