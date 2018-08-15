package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator

class AccelerateRocketAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        var valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

        valueAnimator.addUpdateListener {
            var value = it.animatedValue as Float

            rocket.translationY = value
        }

        valueAnimator.interpolator = AccelerateInterpolator(1.5f)

        valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        valueAnimator.start()


    }
}
