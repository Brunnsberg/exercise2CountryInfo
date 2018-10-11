package com.buutcamp.main;

import com.buutcamp.inputhandle.Country;
import com.buutcamp.inputhandle.Finland;
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

            //country.setName(userInput);
            if (userInput.equals("get Finlands info"))
            {
                Country country = new Finland();

                System.out.println("Land: " + country.getLand());
                System.out.println("President name: " + country.getPresident());
                System.out.println("Population: " + country.getPopulation());
                System.out.println("Capital: " +  country.getCapital());
            }
        }
    }
}
