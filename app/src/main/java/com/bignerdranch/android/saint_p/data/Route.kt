package com.bignerdranch.android.saint_p.data

import androidx.annotation.StringRes
import com.bignerdranch.android.saint_p.R

enum class Route(@StringRes val title: Int) {

    Category(title = R.string.route_category),
    Recommendation(title = R.string.recommendation_category),
    Description(title = R.string.description_category),


}
