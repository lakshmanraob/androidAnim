package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListenerAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        val animator = ValueAnimator.ofFloat(0f, -screenHeight)

        animator.addUpdateListener {
            val value = it.animatedValue as Float

            doge.translationY = value
            rocket.translationY = value
        }

        animator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationEnd(animation: Animator?) {
                Toast.makeText(applicationContext, "Doge is Space", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationCancel(animation: Animator?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationStart(animation: Animator?) {
                Toast.makeText(applicationContext, "Doge is taking off", Toast.LENGTH_SHORT).show()
            }

        })

        animator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION
        animator.start()

    }
}
