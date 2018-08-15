package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ObjectAnimator

class LaunchRocketObjectAnimatorAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        var objectAnimator = ObjectAnimator.ofFloat(rocket, "translationY", 0f, -screenHeight);

        var islandObject = ObjectAnimator.ofFloat(island,"scaleX",0f,10f)

        objectAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        islandObject.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        objectAnimator.start()

        islandObject.start()

    }
}
