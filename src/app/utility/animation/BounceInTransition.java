package app.utility.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.TimelineBuilder;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * Animate a bounce in effect on a node
 * 
 * Port of BounceIn from Animate.css http://daneden.me/animate by Dan Eden
 * 
 * {@literal @}keyframes bounceIn { 0% { opacity: 0; -webkit-transform:
 * scale(.3); } 50% { opacity: 1; -webkit-transform: scale(1.05); } 70% {
 * -webkit-transform: scale(.9); } 100% { -webkit-transform: scale(1); } }
 * 
 * @author Jasper Potts
 */
public class BounceInTransition extends CachedTimelineTransition {
	/**
	 * Create new BounceInTransition
	 * 
	 * @param node
	 *            The node to affect
	 */
	@SuppressWarnings("deprecation")
	public BounceInTransition(final Node node) {

		super(node,
				TimelineBuilder.create()
						.keyFrames(
								new KeyFrame(Duration.millis(0), new KeyValue(node.opacityProperty(), 0, WEB_EASE),
										new KeyValue(node.scaleXProperty(), 0.3, WEB_EASE),
										new KeyValue(node.scaleYProperty(), 0.3, WEB_EASE)),

								new KeyFrame(Duration.millis(1000), new KeyValue(node.opacityProperty(), 1, WEB_EASE),
										new KeyValue(node.scaleXProperty(), 1, WEB_EASE),
										new KeyValue(node.scaleYProperty(), 1, WEB_EASE)))
						.build(),
				false);
		setCycleDuration(Duration.seconds(1));
		setDelay(Duration.seconds(0.2));
	}
}
