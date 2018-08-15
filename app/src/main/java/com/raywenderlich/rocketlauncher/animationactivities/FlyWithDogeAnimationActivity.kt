package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorSet
import android.animation.ValueAnimator

class FlyWithDogeAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        var positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight);

        positionAnimator.addUpdateListener {
            var value = it.animatedValue as Float

            rocket.translationY = value
            doge.translationY = value
        }

        val rotateAnimator = ValueAnimator.ofFloat(0f, 360f)

        rotateAnimator.addUpdateListener {
            var value = it.animatedValue as Float

            doge.rotation = value
            island.rotationY = value
        }

        val animationSet = AnimatorSet()

        animationSet.play(positionAnimator).with(rotateAnimator)
        animationSet.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        animationSet.start()
    }
}
