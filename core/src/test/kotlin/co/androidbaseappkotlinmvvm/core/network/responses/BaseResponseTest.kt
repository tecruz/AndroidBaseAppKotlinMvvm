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

package co.androidbaseappkotlinmvvm.core.network.responses

import org.junit.Assert
import org.junit.Test

class BaseResponseTest {

    @Test
    fun createBaseResponse_ShouldAddCorrectAttributes() {
        val code = 200
        val message = "Ok"

        val baseResponse = BaseResponse(
            code = code,
            message = message
        )

        Assert.assertEquals(code, baseResponse.code)
        Assert.assertEquals(message, baseResponse.message)
    }
}
