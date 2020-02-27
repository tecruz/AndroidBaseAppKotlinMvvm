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

package co.androidbaseappkotlinmvvm.dynamicfeatures.home.ui.di

import androidx.lifecycle.ViewModel
import co.androidbaseappkotlinmvvm.commons.ui.extensions.viewModel
import co.androidbaseappkotlinmvvm.dynamicfeatures.home.di.HomeModule
import co.androidbaseappkotlinmvvm.dynamicfeatures.home.ui.HomeFragment
import co.androidbaseappkotlinmvvm.dynamicfeatures.home.ui.HomeViewModel
import io.mockk.*
import io.mockk.impl.annotations.MockK
import org.hamcrest.CoreMatchers.instanceOf
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class HomeModuleTest {

    @MockK
    lateinit var fragment: HomeFragment
    lateinit var module: HomeModule

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun initializeHomeModule_ShouldSetUpCorrectly() {
        module = HomeModule(fragment)

        assertEquals(fragment, module.fragment)
    }

    @Test
    fun verifyProvidedHomeViewModel() {
        mockkStatic("co.androidbaseappkotlinmvvm.commons.ui.extensions.FragmentExtensionsKt")

        every {
            fragment.viewModel(any(), any<() -> ViewModel>())
        } returns mockk<HomeViewModel>()

        val factoryCaptor = slot<() -> ViewModel>()
        module = HomeModule(fragment)
        module.providesHomeViewModel()

        verify {
            fragment.viewModel(factory = capture(factoryCaptor))
        }

        assertThat(factoryCaptor.captured(), instanceOf(HomeViewModel::class.java))
    }
}
