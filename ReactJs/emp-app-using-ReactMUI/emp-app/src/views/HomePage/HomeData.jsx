import React from 'react';
import { withStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';
import Divider from '@material-ui/core/Divider';
import Button from '@material-ui/core/Button';
import Grid from '@material-ui/core/Grid';
import FormLabel from '@material-ui/core/FormLabel';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import RadioGroup from '@material-ui/core/RadioGroup';
import Radio from '@material-ui/core/Radio';
import Paper from '@material-ui/core/Paper';
const useStyles = ()=>({
  card: {
    flexGrow: 1,
    margin:'100px',
    padding:'22px',
    
    width:'330px'
  },
  container:{
    gridGap:'20px',
    margin:'100px',
  },
  paper: {
    padding: '20px',
    textAlign: 'center',
    whiteSpace: 'nowrap',
    width:'50%',
    margin:'100px',
    
  },
  
  pos: {
    marginBottom: 12,
  },
});

class HomeData extends React.Component {
  constructor(props) {
    super(props);
    
    // we use this to make the card to appear after the page has been rendered
    this.state = {
      bean:JSON.parse(localStorage.getItem("bean"))
    };
  }

    render() {
      
      const { classes } = this.props;
      
  return (
    <div>
       <Grid container  spacing={3} >
      <Grid item xs={12}>
      <Paper className={classes.paper}>
        
        <Typography color="red" variant="h5" component="h2">
         Employee Details  
         <Button variant="contained" color="primary" >
        Edit
      </Button>
        </Typography>
        

        <hr/>

       <List component="nav" /* className={classes.root} */ aria-label="mailbox folders">
      <ListItem button>
      Emp Id      :  {this.state.bean.id} <br></br>
        
      </ListItem>
      <Divider />
      <ListItem button divider>
      Name        :   {this.state.bean.name} <br></br>
      </ListItem>
      <ListItem button>
      Phone No  :  {this.state.bean.phone}  <br></br>
      </ListItem>
      <Divider light />
      <ListItem button>
      Email     :  {this.state.bean.email}   <br></br> 
       
      </ListItem>
      <Divider light />
      <ListItem button>
      Age     :  {this.state.bean.age}   <br></br> 
       
      </ListItem>
     </List>
     </Paper>
      </Grid>
      <Grid item xs={12}>
      
        </Grid>
      
    </Grid>
    
    

  
    

    </div>
  );
    }
}
export default withStyles(useStyles)(HomeData);
