package org.huajistudio.api;

import org.huajistudio.api.math.ChessVector;
import org.huajistudio.api.math.Direction;
import ro.fortsoft.pf4j.ExtensionPoint;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public interface Chess extends ExtensionPoint {
	// TODO generate moves
	// FIXME couldn't be successfully converted by Gson
	Chess KING =
		() -> Arrays.asList(
			new ChessVector(Direction.UP, 1),
			new ChessVector(Direction.LEFT, 1),
			new ChessVector(Direction.RIGHT, 1),
			new ChessVector(Direction.DOWN, 1),
			new ChessVector(Direction.UP_LEFT, 1),
			new ChessVector(Direction.UP_RIGHT, 1),
			new ChessVector(Direction.DOWN_LEFT, 1),
			new ChessVector(Direction.DOWN_RIGHT, 1)
		);
    Chess QUEEN = () -> Arrays.asList(
		new ChessVector(Direction.UP, Integer.MAX_VALUE),
		new ChessVector(Direction.LEFT, Integer.MAX_VALUE),
		new ChessVector(Direction.RIGHT, Integer.MAX_VALUE),
		new ChessVector(Direction.DOWN, Integer.MAX_VALUE),
		new ChessVector(Direction.UP_LEFT, Integer.MAX_VALUE),
		new ChessVector(Direction.UP_RIGHT, Integer.MAX_VALUE),
		new ChessVector(Direction.DOWN_LEFT, Integer.MAX_VALUE),
		new ChessVector(Direction.DOWN_RIGHT, Integer.MAX_VALUE)
	);
    Chess POPE = () -> Arrays.asList(
    	new ChessVector(Direction.UP_LEFT, Integer.MAX_VALUE),
	    new ChessVector(Direction.UP_RIGHT, Integer.MAX_VALUE),
	    new ChessVector(Direction.DOWN_LEFT, Integer.MAX_VALUE),
	    new ChessVector(Direction.DOWN_RIGHT, Integer.MAX_VALUE)
    );
    Chess KNIGHT = Collections::emptyList;
    Chess CASTLE = () -> Arrays.asList(
		new ChessVector(Direction.UP, Integer.MAX_VALUE),
		new ChessVector(Direction.LEFT, Integer.MAX_VALUE),
		new ChessVector(Direction.RIGHT, Integer.MAX_VALUE),
		new ChessVector(Direction.DOWN, Integer.MAX_VALUE)
	);
    Chess PAWN = Collections::emptyList;

    Collection<ChessVector> getMovableVectors();
}
