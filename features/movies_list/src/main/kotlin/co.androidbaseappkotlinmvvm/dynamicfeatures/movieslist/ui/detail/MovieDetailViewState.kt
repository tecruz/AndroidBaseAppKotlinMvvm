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

package co.androidbaseappkotlinmvvm.dynamicfeatures.movieslist.ui.detail

import co.androidbaseappkotlinmvvm.commons.ui.base.BaseViewState

/**
 * Different states for [MovieDetailFragment].
 *
 * @see BaseViewState
 */
sealed class MovieDetailViewState : BaseViewState {

    /**
     * Loading movie detail info.
     */
    object Loading : MovieDetailViewState()

    /**
     * Error on loading movie detail info.
     */
    object Error : MovieDetailViewState()

    /**
     * Add current movies to favorite list.
     */
    object AddToFavorite : MovieDetailViewState()

    /**
     * Added current movies to favorite list.
     */
    object AddedToFavorite : MovieDetailViewState()

    /**
     * Already added movies to favorite list.
     */
    object AlreadyAddedToFavorite : MovieDetailViewState()

    /**
     * Dismiss the detail view.
     */
    object Dismiss : MovieDetailViewState()

    // ============================================================================================
    //  Public helpers methods
    // ============================================================================================

    /**
     * Check if current view state is [Loading].
     *
     * @return True if is loading state, otherwise false.
     */
    fun isLoading() = this is Loading

    /**
     * Check if current view state is [Error].
     *
     * @return True if is error state, otherwise false.
     */
    fun isError() = this is Error

    /**
     * Check if current view state is [AddToFavorite].
     *
     * @return True if is add to favorite state, otherwise false.
     */
    fun isAddToFavorite() = this is AddToFavorite

    /**
     * Check if current view state is [AddedToFavorite].
     *
     * @return True if is added to favorite state, otherwise false.
     */
    fun isAddedToFavorite() = this is AddedToFavorite

    /**
     * Check if current view state is [AlreadyAddedToFavorite].
     *
     * @return True if is already added to favorite state, otherwise false.
     */
    fun isAlreadyAddedToFavorite() = this is AlreadyAddedToFavorite

    /**
     * Check if current view state is [Dismiss].
     *
     * @return True if is delete state, otherwise false.
     */
    fun isDismiss() = this is Dismiss
}
