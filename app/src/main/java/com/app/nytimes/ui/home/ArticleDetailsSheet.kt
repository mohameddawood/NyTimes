package com.app.nytimes.ui.home

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.app.nytimes.R
import com.app.nytimes.databinding.ArticleDetailsSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ArticleDetailsSheet : BottomSheetDialogFragment() {

    private lateinit var articleDetailsSheetBinding: ArticleDetailsSheetBinding
    private var bottomSheetBehavior: BottomSheetBehavior<*>? = null
    private val args: ArticleDetailsSheetArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        articleDetailsSheetBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.article_details_sheet,
            container,
            false
        )
        articleDetailsSheetBinding.article = args.article

        articleDetailsSheetBinding.imgBack.setOnClickListener {
            dismiss()
        }
        return articleDetailsSheetBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        articleDetailsSheetBinding.lifecycleOwner = this
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        var bottomSheet: View? = null
        if (dialog != null) {
            bottomSheet = dialog.findViewById(R.id.design_bottom_sheet)
            bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        }
        val view = view
        val finalBottomSheet = bottomSheet
        view!!.post {
            val parent = view.parent as View
            val params = parent.layoutParams as CoordinatorLayout.LayoutParams
            val behavior = params.behavior
            bottomSheetBehavior = behavior as BottomSheetBehavior<*>?
            bottomSheetBehavior!!.peekHeight = view.measuredHeight
            (finalBottomSheet!!.parent as View).setBackgroundColor(Color.TRANSPARENT)
        }
    }

}