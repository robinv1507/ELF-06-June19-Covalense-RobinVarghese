import React from 'react';
import { withStyles, makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import Button from '@material-ui/core/Button';
import Axios from "axios";
import Input from '@material-ui/core/Input';
import SearchIcon from '@material-ui/icons/Search';


const StyledTableCell = withStyles(theme => ({
  head: {
    backgroundColor: '#28b8d6',
    color: theme.palette.common.white,
  },
  body: {
    fontSize: 14,
  },
  searchIcon: {
   
    width: theme.spacing(7),
    height: '100%',
    position: 'absolute',
    pointerEvents: 'none',
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
  }
  
}))(TableCell);

const StyledTableRow = withStyles(theme => ({
  root: {
    '&:nth-of-type(odd)': {
      backgroundColor: theme.palette.background.default,
    },
  },
}))(TableRow);

const useStyles = () => ({
  root: {
    width: '70%',
   // marginTop: theme.spacing(3),
    overflowX: 'auto',
  },
  table: {
    minWidth: 700,
  },
  search:{
    margin:'70px',
    marginLeft:'230px',
    marginRight:'80px'
  }
});

 class BookTable extends React.Component {
  constructor(props) {
    super(props);

   this.state={
     bookName:'',
    rows: [ ],
      
    }
    
    Axios.get('http://localhost:700/getAllBook')
    .then((res)=>{
      console.log('getallBook',res);
     // let booksData=res.data.bookData;
      this.setState({rows: res.data.bookData})
    })
    .catch((err)=>{
      console.log('err',err)
    })
  
    
  }
  
  SearchBoook=(event)=>{
    event.preventDefault();
    Axios.get('http://localhost:700/getBook',{params:{bookName:this.state.bookName}})
    .then((res)=>{
      console.log('getallBook for search',res);
     // let booksData=res.data.bookData;
     if(res.data.statusCode==201){
      this.setState({rows: res.data.bookData})
     }else{
       alert(res.data.description)
     }
      
    })
    .catch((err)=>{
      console.log('err',err)
    })
  
    
  }
  
  
render(){
  const classes = useStyles();
  return (<div>
  
    <div className={classes.search} style={{margin:'20px',
                                           align:'right',marginLeft:"800px",
                                           marginTop:"20px"}}>
             <form method="get" onSubmit={this.SearchBoook}> 
            <Input  variant="contained"
               //value={searchBookName}
              placeholder="Search  book......  "
              onChange={(event)=>{
                this.setState({bookName:event.target.value})
              }}
              value={this.state.bookName}
            />
         
         <Button type="submit" > <SearchIcon /></Button>
        </form>
          </div>

    <Paper className={classes.root} 
          style={{margin:'50px',marginLeft:'230px',marginRight:'80px'}}>
      <Table className={classes.table}>
        <TableHead>
          <TableRow>
            <StyledTableCell>Book Id</StyledTableCell>
            <StyledTableCell align="right">Book Name</StyledTableCell>
            <StyledTableCell align="right">Author Name</StyledTableCell>
            <StyledTableCell align="right">Catagery</StyledTableCell>
            <StyledTableCell align="right">ISBN Number</StyledTableCell>
            <StyledTableCell align="right">Language</StyledTableCell>
            <StyledTableCell align="right">No of copies</StyledTableCell>
            <StyledTableCell align="right">Available Copies</StyledTableCell>
            <StyledTableCell align="right">Send Request</StyledTableCell>
            
          </TableRow>
        </TableHead>
        <TableBody>
          {this.state.rows.map(row => (
            <StyledTableRow key={row.bookId}>
              <StyledTableCell component="th" scope="row">
                {row.bookId}
              </StyledTableCell>
              <StyledTableCell align="right">{row.bookName}</StyledTableCell>
              <StyledTableCell align="right">{row.authorName}</StyledTableCell>
              <StyledTableCell align="right">{row.catagery}</StyledTableCell>
              <StyledTableCell align="right">{row.isbnNumber}</StyledTableCell>
              <StyledTableCell align="right">{row.language}</StyledTableCell>
             
              <StyledTableCell align="right">{row.numberOfCopies}</StyledTableCell>
              <StyledTableCell align="right">{row.availableCopies}</StyledTableCell>
              
              <StyledTableCell align="right">
              <Button variant="contained" size="small" color="secondary" className={classes.button}>
                Request</Button>
              </StyledTableCell>

            </StyledTableRow>
          ))}
        </TableBody>
      </Table>
    </Paper>
    </div>
  );
          }
}export default withStyles(useStyles) (BookTable);
