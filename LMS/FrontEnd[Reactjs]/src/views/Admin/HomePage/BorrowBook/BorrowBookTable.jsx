import React from 'react';
import MaterialTable from 'material-table';


export default class   User extends React.Component {
  constructor(props) {
    super(props);
   this.state={
      columns: [
        { title: 'Book Id', field: 'Bookid',type: 'numeric' },
        { title: 'User Id', field: 'UserId' },
        { title: 'Catagery', field: 'Catagery'},
        { title: 'DateOf Borrowed', field: 'dateOfBorrowed', type: 'date' },
        { title: 'DateOf Return', field: 'dateOfReturn', type: 'date' },
        { title: 'Request Date', field: 'requestDate', type: 'date' },
        
        {  title:'requestStatus',field:'requestStatus' },
        {  title:'returnStatus',field:'returnStatus' },
       
        
      ],
      data: [
        { Bookid: 'Mehmet', BookName: 1, Catagery: "abcdcom",
         ISBNNumber:89231363, AuthorName:'aaa',Language:'e',
         Noofcopies:2,availableCopies:2 },

      
      ],
    }
    
  }
 
render(){
  return (
    
    <MaterialTable style={{margin:'70px',marginLeft:'240px'}}
      title="Book Borrow Details"
      columns={this.state.columns}
      data={this.state.data}
      editable={{
        /* onRowAdd: newData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...this.state.data];
              data.push(newData);
              this.setState({ ...this.state, data });
            }, 600);
          }), */
        onRowUpdate: (newData, oldData) =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...this.state.data];
              data[data.indexOf(oldData)] = newData;
             this.setState({ ...this.state, data });
             
            }, 600);
          }),

        onRowDelete: oldData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...this.state.data];
              data.splice(data.indexOf(oldData), 1);
              this.setState({ ...this.state, data });
            }, 600);
          }),
      }}
    />
  );
    }
}
