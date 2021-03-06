/*
 * Copyright 2020 tecruz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.androidbaseappkotlinmvvm.dynamicfeatures.moviesfavorites.ui.favorite.adapter

import android.view.LayoutInflater
import android.view.View
import androidx.databinding.ViewDataBinding
import co.androidbaseappkotlinmvvm.core.database.moviefavorite.MovieFavorite
import co.androidbaseappkotlinmvvm.dynamicfeatures.moviesfavorites.databinding.ListItemMoviesFavoriteBinding
import co.androidbaseappkotlinmvvm.dynamicfeatures.moviesfavorites.ui.favorite.adapter.holders.MovieFavoriteViewHolder
import io.mockk.*
import io.mockk.impl.annotations.MockK
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieFavoriteViewHolderTest {

    @MockK
    lateinit var view: View
    @MockK
    lateinit var layoutInflater: LayoutInflater
    @MockK(relaxed = true)
    lateinit var binding: ListItemMoviesFavoriteBinding
    lateinit var viewHolder: MovieFavoriteViewHolder

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun createViewHolder_ShouldInitializeCorrectly() {
        mockkStatic(ListItemMoviesFavoriteBinding::class)
        every { (binding as ViewDataBinding).root } returns view
        every { ListItemMoviesFavoriteBinding.inflate(layoutInflater) } returns binding

        viewHolder = MovieFavoriteViewHolder(layoutInflater)

        Assert.assertEquals(binding, viewHolder.binding)
    }

    @Test
    fun bindViewHolder_ShouldBindingDataVariable() {
        mockkStatic(ListItemMoviesFavoriteBinding::class)
        every { (binding as ViewDataBinding).root } returns view
        every { ListItemMoviesFavoriteBinding.inflate(layoutInflater) } returns binding

        val movieFavorite = mockk<MovieFavorite>()
        viewHolder = MovieFavoriteViewHolder(layoutInflater)
        viewHolder.bind(movieFavorite)

        verify { binding.movie = movieFavorite }
        verify { binding.executePendingBindings() }
    }
}
