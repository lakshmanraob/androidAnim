package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class RotateRocketAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        var valueAnimator = ValueAnimator.ofFloat(0f, 360f)

        valueAnimator.addUpdateListener {
            var value = it.animatedValue as Float

            rocket.rotation = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = BaseAnimationActivity.Companion.DEFAULT_ANIMATION_DURATION
        valueAnimator.start()

    }
}
