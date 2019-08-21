import React from 'react';
import MaterialTable from 'material-table';


export default class   User extends React.Component {
  constructor(props) {
    super(props);
   this.state={
      columns: [
        { title: 'BookId', field: 'Bookid',type: 'numeric' },
        { title: 'Book Name', field: 'BookName' },
        { title: 'Catagery', field: 'Catagery'},
        { title: 'ISBNNumber', field: 'ISBNNumber', type: 'numeric' },
        {  title: 'AuthorName',field:'AuthorName' },
        {  title: 'Language',field:'Language' },
        {  title: 'Noofcopies',field:'Noofcopies', type: 'numeric' },
        {  title: 'availableCopies',field:'availableCopies', type: 'numeric' },

        
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
      title="Book Details"
      columns={this.state.columns}
      data={this.state.data}
      editable={{
        onRowAdd: newData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              const data = [...this.state.data];
              data.push(newData);
              this.setState({ ...this.state, data });
            }, 600);
          }),
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
