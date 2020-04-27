package com.aya.salama.blescanning

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment





class BLEDevicesFragment : Fragment(R.layout.fragment_b_l_e_devices) {
    companion object {
        private const val DEVICES_LIST= "devices_list"
        fun newInstance(param1: ArrayList<out Parcelable>) =
            BLEDevicesFragment().apply {
                arguments = Bundle().apply {
                    putParcelableArrayList(DEVICES_LIST, param1)
                }
            }
    }
}
