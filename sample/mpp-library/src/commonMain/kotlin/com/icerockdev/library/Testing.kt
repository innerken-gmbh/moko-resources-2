/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package com.icerockdev.library

import dev.icerock.moko.resources.DrawableResource
import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.resources.desc.desc

object Testing {
    fun getStrings(): List<StringDesc> {
        return listOf(
            MR.strings.test.desc(),
            MR.strings.test2.desc(),
            MR.strings.test3.desc(),
            MR.strings.common_name.desc(),
            "some raw string".desc(),
            MR.plurals.test_plural.desc(0),
            MR.plurals.test_plural.desc(1),
            MR.plurals.test_plural.desc(2),
            MR.plurals.test_plural.desc(3)
        )
    }

    fun getDrawable(): DrawableResource {
        return MR.drawables.test_drawable
    }
}