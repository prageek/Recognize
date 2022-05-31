package com.pragee.mob.recognize.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    // TODO : Check if the user is a first time user or the permission has been revoked (due to none usage) and show this banner
    private val _permission = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isPermissionGranted = _permission
}