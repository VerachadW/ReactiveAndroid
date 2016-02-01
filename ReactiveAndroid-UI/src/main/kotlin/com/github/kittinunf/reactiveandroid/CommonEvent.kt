package com.github.kittinunf.reactiveandroid

import android.view.*

/**
 * Created by Kittinun Vantasin on 2/1/16.
 */

data class Padding(val start: Int, val top: Int, val end: Int, val bottom: Int)

data class DragListener(val view: View, val dragEvent: DragEvent)

data class KeyListener(val view: View, val keyCode: Int, val keyEvent: KeyEvent)

data class HoverListener(val view: View, val motionEvent: MotionEvent)

data class TouchListener(val view: View, val motionEvent: MotionEvent)

data class FocusChangeListener(val view: View, val hasFocus: Boolean)

data class LayoutChangeListener(val view: View, val newPadding: Padding, val oldPadding: Padding)

data class ScrollDirection(val x: Int, val y: Int)

data class ScrollChangeListener(val view: View, val direction: ScrollDirection, val oldDirection: ScrollDirection)

data class CreateContextMenuListener(val contextMenu: ContextMenu, val view: View, val menuInfo: ContextMenu.ContextMenuInfo)