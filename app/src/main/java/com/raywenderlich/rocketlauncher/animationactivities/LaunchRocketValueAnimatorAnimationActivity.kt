package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValueAnimatorAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

        valueAnimator.addUpdateListener {
            var value = it.animatedValue as Float
            rocket.translationY = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = BaseAnimationActivity.Companion.DEFAULT_ANIMATION_DURATION

        valueAnimator.start()

    }
}
