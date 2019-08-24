import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import GridList from '@material-ui/core/GridList';
import GridListTile from '@material-ui/core/GridListTile';
import GridListTileBar from '@material-ui/core/GridListTileBar';
import ListSubheader from '@material-ui/core/ListSubheader';
import IconButton from '@material-ui/core/IconButton';
import InfoIcon from '@material-ui/icons/Info';
//import tileData from './tileData';
import b1 from "assets/img/book/b1.jpg";
import b2 from "assets/img/book/b2.jpg";
import b3 from "assets/img/book/b3.jpg";
import b4 from "assets/img/book/b4.jpg";
import b5 from "assets/img/book/b5.jpg";
import b6 from "assets/img/book/b6.jpg";
const useStyles = makeStyles(theme => ({
  root: {
    display: 'flex',
    flexWrap: 'wrap',
    justifyContent: 'space-around',
    overflow: 'hidden',
    margin:'40px',
    marginLeft:'240px',

    backgroundColor: theme.palette.background.paper,
  },
  gridList: {
    width: 900,
    height: 650,
  },
  icon: {
    color: 'rgba(255, 255, 255, 0.54)',
  },
}));

/**
 * The example data is structured as follows:
 *
 * import image from 'path/to/image.jpg';
 * [etc...]
 *
 * const tileData = [
 *   {
 *     img: image,
 *     title: 'Image',
 *     author: 'author',
 *   },
 *   {
 *     [etc...]
 *   },
 * ];
 */
const tileData = [
    {
      img: b1,
      title: 'Image',
    author: 'author',
   },
    {
      img: b2,
      title: 'Image',
    author: 'author',
    
    },
    {
      img: b3,
      title: 'Image',
    author: 'author',
    
    },
    {
      img: b4,
      title: 'Image',
    author: 'author',
    
    },
    {
      img: b5,
      title: 'Image',
    author: 'author',
    
    },
    {
      img: b6,
      title: 'Image',
    author: 'author',
    
    },
  ];
export default function TitlebarGridList() {
  const classes = useStyles();

  return (
    <div className={classes.root}>
      <GridList cellHeight={180} className={classes.gridList}>
        <GridListTile key="Subheader" cols={2} style={{ height: 'auto' }}>
          <h3>Read the Books</h3>
        </GridListTile>
        {tileData.map(tile => (
          <GridListTile key={tile.img}>
            <img src={tile.img} alt={tile.title} />
            <GridListTileBar
              title={tile.title}
              subtitle={<span>by: {tile.author}</span>}
              actionIcon={
                <IconButton aria-label={`info about ${tile.title}`} className={classes.icon}>
                  <InfoIcon />
                </IconButton>
              }
            />
          </GridListTile>
        ))}
      </GridList>
    </div>
  );
}
