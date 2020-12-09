package com.app.nytimes.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewGroup
import com.app.nytimes.databinding.FragmentSplashBinding
import com.app.nytimes.manager.base.BaseFragment
import com.app.nytimes.manager.utilities.Constants
import com.app.nytimes.manager.utilities.bottomNavigationVisibility
import com.app.nytimes.manager.utilities.toolBarVisibility
import com.app.nytimes.ui.MainActivity
import kotlin.math.hypot

class SplashFragment : BaseFragment() {
    private lateinit var splashBinding: FragmentSplashBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        splashBinding = FragmentSplashBinding.inflate(inflater, container, false)
        return splashBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).toolBarVisibility(false)
        (activity as MainActivity).bottomNavigationVisibility(false)

        animateSplash()
    }

    private fun animateSplash() {
        splashBinding.ivSplashLogo.post {
            val anim =
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ViewAnimationUtils.createCircularReveal(
                        splashBinding.llSplashParent,
                        splashBinding.llSplashParent.width / 2,
                        splashBinding.llSplashParent.height / 2, 0f,
                        hypot(
                            splashBinding.llSplashParent.width.toDouble(),
                            splashBinding.llSplashParent.height.toDouble()
                        ).toFloat()
                    )
                } else {
                    TODO("VERSION.SDK_INT < LOLLIPOP")
                }
            anim.duration = Constants.DELAY_SMALL.toLong()
            anim.start()
        }
    }
}