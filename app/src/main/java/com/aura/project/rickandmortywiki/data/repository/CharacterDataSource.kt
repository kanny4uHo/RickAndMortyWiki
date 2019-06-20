package com.aura.project.rickandmortywiki.data.repository

import com.aura.project.rickandmortywiki.data.Character
import com.aura.project.rickandmortywiki.data.request.RepoRequest

interface CharacterDataSource {
    suspend fun getCharPage(page: Int): RepoRequest<List<Character>>
    suspend fun insertChars(chars: List<Character>)
    suspend fun clearAll()
    suspend fun getChar(id: Int): RepoRequest<Character>
    suspend fun getChars(ids: List<Int>): RepoRequest<List<Character>>
}