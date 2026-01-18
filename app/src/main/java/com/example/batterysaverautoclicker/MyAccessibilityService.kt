package com.example.batterysaverautoclicker

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.util.Log

class MyAccessibilityService : AccessibilityService() {
    
    companion object {
        var startMonitoring = false
    }
    
    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        if (!startMonitoring) return
        
        val rootNode = rootInActiveWindow ?: return
        findAndClickButton(rootNode)
    }

    private fun findAndClickButton(node: AccessibilityNodeInfo) {
        // Список текстов на кнопках, которые мы ищем (укр, рус, англ)
        val targetTexts = listOf("увімкнути", "включить", "turn on", "activate", "ок")
        
        for (i in 0 until node.childCount) {
            val child = node.getChild(i) ?: continue
            val text = child.text?.toString()?.lowercase()
            
            if (text != null && targetTexts.any { text.contains(it) }) {
                if (child.isClickable) {
                    child.performAction(AccessibilityNodeInfo.ACTION_CLICK)
                    startMonitoring = false // Выключаем после нажатия
                    return
                }
            }
            findAndClickButton(child)
        }
    }

    override fun onInterrupt() {}
}
