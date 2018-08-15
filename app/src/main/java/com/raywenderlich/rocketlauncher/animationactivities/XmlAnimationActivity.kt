package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.raywenderlich.rocketlauncher.R

class XmlAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

        val islandAnimator = AnimatorInflater.loadAnimator(applicationContext, R.animator.fade_out) as AnimatorSet
        islandAnimator.setTarget(island)

//        islandAnimator.addListener(object : Animator.AnimatorListener {
//            override fun onAnimationRepeat(p0: Animator?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//            override fun onAnimationEnd(animation: Animator?) {
//                rocketDogeAnimation()
//            }
//
//            override fun onAnimationCancel(p0: Animator?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//            override fun onAnimationStart(p0: Animator?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        });

        islandAnimator.start()

        rocketDogeAnimation()

    }

    fun rocketDogeAnimation() {
        val rocketAnimatorSet = AnimatorInflater.loadAnimator(applicationContext, R.animator.jump_and_blink) as AnimatorSet
        rocketAnimatorSet.setTarget(rocket)

        val dogeAnimatorSet = AnimatorInflater.loadAnimator(applicationContext, R.animator.jump_and_blink) as AnimatorSet
        dogeAnimatorSet.setTarget(doge)

        val bothAnimatorSet = AnimatorSet()
        bothAnimatorSet.playTogether(rocketAnimatorSet, dogeAnimatorSet)

        bothAnimatorSet.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION
        bothAnimatorSet.start()
    }
}
