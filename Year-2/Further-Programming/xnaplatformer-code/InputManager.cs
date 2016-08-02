using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Microsoft.Xna.Framework.Input;

namespace xnaplatformer
{
    public class InputManager
    {

        #region Variables

        KeyboardState prevKeyState, keyState;

        #endregion

        #region Properties

        public KeyboardState PrevKeyState
        {
            get { return prevKeyState; }
            set { prevKeyState = value; }
        }

        public KeyboardState KeyState
        {
            get { return keyState; }
            set { keyState = value; }
        }

        #endregion

        #region Public Methods

        public void Update()
        {
            prevKeyState = keyState;
            keyState = Keyboard.GetState();
        }
        // cheking if keys are pressed or not
        public bool KeyPressed(Keys key)
        {
            if (keyState.IsKeyDown(key) && prevKeyState.IsKeyUp(key))
                return true;
            return false;
        }

        public bool KeyPressed(params Keys[] keys)
        {
            foreach (Keys key in keys)
            {
                if (keyState.IsKeyDown(key) && prevKeyState.IsKeyUp(key))
                    return true;
            }
            return false;
        }

        public bool KeyReleased(Keys key)
        {
            if (keyState.IsKeyUp(key) && prevKeyState.IsKeyDown(key))
                return true;
            return false;
        }

        public bool KeyReleased(params Keys[] keys)
        {
            foreach (Keys key in keys)
            {
                if (keyState.IsKeyUp(key) && prevKeyState.IsKeyDown(key))
                    return true;
            }
            return false;
        }

        public bool KeyDown(Keys key)
        {
            if (keyState.IsKeyDown(key))
                return true;
            else
                return false;
        }

        public bool KeyDown(params Keys[] keys)
        {
            foreach (Keys key in keys)
            {
                if (keyState.IsKeyDown(key))
                    return true;
            }
            return false;
        }

        #endregion

    }
}

