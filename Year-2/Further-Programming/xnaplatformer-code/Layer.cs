using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.Graphics;

namespace xnaplatformer
{
    public class Layer
    {

        #region Variables

        List<Tile> tiles;
        List<string> motion, solid;
        FileManager fileManager;
        ContentManager content;
        Texture2D tileSheet;
        string[] getMotion;
        string nullTile;

        #endregion

        #region Properties

        static public Vector2 TileDimensions
        {
            get { return new Vector2(32, 32); }
        }

        #endregion

        #region Public Methods

        public void LoadContent(Map map, string layerID)
        {
            tiles = new List<Tile>();
            motion = new List<string>();
            solid = new List<string>();
            fileManager = new FileManager();
            content = new ContentManager(ScreenManager.Instance.Content.ServiceProvider, "Content");
            // setting up the filename and identifier for map1.txt
            fileManager.LoadContent("Load/Maps/" + map.ID + ".txt", layerID);

            int indexY = 0;
            // switch case for the different values within the map1.txt 
            for (int i = 0; i < fileManager.Attributes.Count; i++)
            {
                for (int j = 0; j < fileManager.Attributes[i].Count; j++)
                {
                    switch (fileManager.Attributes[i][j])
                    {
                        case "TileSet":
                            tileSheet = content.Load<Texture2D>("TileSets/" + fileManager.Contents[i][j]);
                            break;
                        case "Solid":
                            solid.Add(fileManager.Contents[i][j]);
                            break;
                        case "Motion":
                            motion.Add(fileManager.Contents[i][j]);
                            break;
                        case "NullTile":
                            nullTile = fileManager.Contents[i][j];
                            break;
                        case "StartLayer":
                            Tile.Motion tempMotion = Tile.Motion.Static;
                            Tile.State tempState;

                            for (int k = 0; k < fileManager.Contents[i].Count; k++)
                            {
                                // settings for wether the tiles will be solid or passive
                                if (fileManager.Contents[i][k] != nullTile)
                                {
                                    string[] split = fileManager.Contents[i][k].Split(',');
                                    tiles.Add(new Tile());

                                    if (solid.Contains(fileManager.Contents[i][k]))
                                        tempState = Tile.State.Solid;
                                    else
                                        tempState = Tile.State.Passive;

                                    foreach (string m in motion)
                                    {
                                        // settings for motion of the tiles
                                        getMotion = m.Split(':');
                                        if (getMotion[0] == fileManager.Contents[i][k])
                                        {
                                            tempMotion = (Tile.Motion)Enum.Parse(typeof(Tile.Motion), getMotion[1]);
                                            break;
                                        }
                                    }

                                    tiles[tiles.Count-1].SetTile(tempState, tempMotion, new Vector2(k * 32, indexY * 32), tileSheet,
                                        new Rectangle(int.Parse(split[0]) * 32, int.Parse(split[1]) * 32, 32, 32));
                                }
                                
                                
                            }
                            indexY++;
                            break;
                    }
                }
            }
        }

        public void Update(GameTime gameTime)
        {
            for (int i = 0; i < tiles.Count; i++)
            {
                tiles[i].Update(gameTime);
            }
        }

        public void UpdateCollision(ref Entity e)
        {
            for (int i = 0; i < tiles.Count; i++)
            {
                tiles[i].UpdateCollision(ref e);
            }
        }

        public void Draw(SpriteBatch spriteBatch)
        {
            for (int i = 0; i < tiles.Count; i++)
            {
                tiles[i].Draw(spriteBatch);
            }
        }

        #endregion

    }
}

