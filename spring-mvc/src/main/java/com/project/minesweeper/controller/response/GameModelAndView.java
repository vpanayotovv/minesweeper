package com.project.minesweeper.controller.response;

import org.springframework.web.servlet.ModelAndView;

import com.project.minesweeper.model.Difficulty;
import com.project.minesweeper.model.Game;
import com.project.minesweeper.view.GameView;

public class GameModelAndView extends ModelAndView {

    /**
     * Constructs a new model and view with the given template name and
     * pre-populates the model with generic parameters required by templates.
     */
    public GameModelAndView(String templateName) {
        super(templateName);
        addObject("difficulties", Difficulty.values());
    }

    /**
     * Constructs a new model and view with the given game available for the template.
     */
    public GameModelAndView(String templateName, Game game) {
        this(templateName);
        addObject("gameView", new GameView(game));
    }
}
