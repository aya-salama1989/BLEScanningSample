package com.aya.salama.blescanning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_device.view.*

class DevicesAdapter : RecyclerView.Adapter<DevicesAdapter.DeviceViewHolder>() {

private var devices = ArrayList<Device>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceViewHolder {
        val v = LayoutInflater
            .from(parent.context).inflate(R.layout.item_device, parent, false)
        return DeviceViewHolder(v)
    }

    override fun getItemCount(): Int {
     return devices.size
    }

    override fun onBindViewHolder(holder: DeviceViewHolder, position: Int) {
        holder.setData(devices[position])
    }


    fun setItems(devices: ArrayList<Device>){
        this.devices = devices
        notifyDataSetChanged()
    }


    inner class DeviceViewHolder( itemView: View): RecyclerView.ViewHolder(itemView){
        fun setData(device:Device){
            itemView.deviceName.text="Name"
            itemView.deviceAddress.text="address address"
        }
    }
}