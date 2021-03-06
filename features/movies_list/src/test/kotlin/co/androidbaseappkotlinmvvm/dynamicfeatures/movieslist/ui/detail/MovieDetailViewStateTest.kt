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

package co.androidbaseappkotlinmvvm.favorite.movieslist.ui.detail

import co.androidbaseappkotlinmvvm.dynamicfeatures.movieslist.ui.detail.MovieDetailViewState
import org.junit.Assert
import org.junit.Test

class MovieDetailViewStateTest {

    lateinit var state: MovieDetailViewState

    @Test
    fun setStateAsLoading_ShouldBeSettled() {
        state = MovieDetailViewState.Loading

        Assert.assertTrue(state.isLoading())
        Assert.assertFalse(state.isError())
        Assert.assertFalse(state.isAddToFavorite())
        Assert.assertFalse(state.isAddedToFavorite())
        Assert.assertFalse(state.isAlreadyAddedToFavorite())
        Assert.assertFalse(state.isDismiss())
    }

    @Test
    fun setStateAsError_ShouldBeSettled() {
        state = MovieDetailViewState.Error

        Assert.assertTrue(state.isError())
        Assert.assertFalse(state.isLoading())
        Assert.assertFalse(state.isAddToFavorite())
        Assert.assertFalse(state.isAddedToFavorite())
        Assert.assertFalse(state.isAlreadyAddedToFavorite())
        Assert.assertFalse(state.isDismiss())
    }

    @Test
    fun setStateAsAddToFavorite_ShouldBeSettled() {
        state = MovieDetailViewState.AddToFavorite

        Assert.assertTrue(state.isAddToFavorite())
        Assert.assertFalse(state.isLoading())
        Assert.assertFalse(state.isError())
        Assert.assertFalse(state.isAddedToFavorite())
        Assert.assertFalse(state.isAlreadyAddedToFavorite())
        Assert.assertFalse(state.isDismiss())
    }

    @Test
    fun setStateAsAddedToFavorite_ShouldBeSettled() {
        state = MovieDetailViewState.AddedToFavorite

        Assert.assertTrue(state.isAddedToFavorite())
        Assert.assertFalse(state.isLoading())
        Assert.assertFalse(state.isError())
        Assert.assertFalse(state.isAddToFavorite())
        Assert.assertFalse(state.isAlreadyAddedToFavorite())
        Assert.assertFalse(state.isDismiss())
    }

    @Test
    fun setStateAsAlreadyAddedToFavorite_ShouldBeSettled() {
        state = MovieDetailViewState.AlreadyAddedToFavorite

        Assert.assertTrue(state.isAlreadyAddedToFavorite())
        Assert.assertFalse(state.isLoading())
        Assert.assertFalse(state.isError())
        Assert.assertFalse(state.isAddToFavorite())
        Assert.assertFalse(state.isAddedToFavorite())
        Assert.assertFalse(state.isDismiss())
    }

    @Test
    fun setStateAsDismiss_ShouldBeSettled() {
        state = MovieDetailViewState.Dismiss

        Assert.assertTrue(state.isDismiss())
        Assert.assertFalse(state.isLoading())
        Assert.assertFalse(state.isError())
        Assert.assertFalse(state.isAddToFavorite())
        Assert.assertFalse(state.isAddedToFavorite())
        Assert.assertFalse(state.isAlreadyAddedToFavorite())
    }
}
