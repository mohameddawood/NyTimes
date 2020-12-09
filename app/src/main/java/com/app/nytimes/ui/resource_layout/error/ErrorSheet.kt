package com.app.nytimes.ui.resource_layout.error

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.app.nytimes.R
import com.app.nytimes.databinding.LayoutErrorBinding
import com.app.nytimes.manager.utilities.Constants
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ErrorSheet : BottomSheetDialogFragment() {
    private lateinit var errorBinding: LayoutErrorBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        errorBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_error, container, false)
        getBundleMessage()
        errorBinding.lifecycleOwner = this

        return errorBinding.root
    }

    private fun getBundleMessage(){
        if(arguments?.containsKey(Constants.MESSAGE) == true){
            errorBinding.tvMessage.text = requireArguments().getString(Constants.MESSAGE)
        }
    }
}

