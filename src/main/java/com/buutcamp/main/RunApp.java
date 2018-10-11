package com.buutcamp.main;

import com.buutcamp.inputhandle.HandleInput;

class RunApp
{
    RunApp()
    {
        HandleInput handleInput = new HandleInput();

        while (true)
        {
            String userInput = handleInput.getUserInput();
            System.out.println(userInput);

            if (userInput.equals("exit"))
            {
                return;
            }
        }
    }
}
