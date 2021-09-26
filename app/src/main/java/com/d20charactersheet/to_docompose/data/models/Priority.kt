package com.d20charactersheet.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import com.d20charactersheet.to_docompose.ui.theme.HighPriorityColor
import com.d20charactersheet.to_docompose.ui.theme.LowPriorityColor
import com.d20charactersheet.to_docompose.ui.theme.MediumPriorityColor
import com.d20charactersheet.to_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}