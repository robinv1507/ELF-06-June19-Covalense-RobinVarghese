import React from 'react';
import MaterialTable from 'material-table';


export default class   User extends React.Component {
  constructor(props) {
    super(props);
   this.state={
      columns: [
        { title: 'User Id', field: 'userId', type: 'numeric' },
        { title: 'Name', field: 'name' },
        { title: 'EmailId', field: 'emailId', type:'email' },
        { title: 'Phone Number', field: 'mobileNumber', type: 'numeric' },
        {
          title: 'Password',field:'password' },
      ],
      data: [
        { name: 'Mehmet', userId: 1, emailId: "abcd@gmail.com", mobileNumber:89231363, password:'123' },
        { name: 'Mehmet', userId: 2, emailId: "abcd@gmail.com", mobileNumber:89231363 },

      
      ],
    }
    
  }
 
render(){
  return (
    
    <MaterialTable style={{margin:'70px',marginLeft:'240px'}}
      title="User Details"
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
