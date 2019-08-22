import React from 'react';
import MaterialTable from 'material-table';
import Axios from "axios";

export default class   User extends React.Component {
  constructor(props) {
    super(props);
   this.state={
     
      columns: [
        { title: 'User Id', field: 'id', type: 'numeric' },
        { title: 'Name', field: 'name' },
        { title: 'EmailId', field: 'emailId', type:'email' },
        { title: 'Phone Number', field: 'mobileNumber', type: 'numeric' },
        { title: 'UserType', field: 'UserType' },
        {
          title: 'Password',field:'password' },
      ],
      data: [      
      ],
    }
    Axios.get('http://localhost:700/getAllUser')
    .then((res)=>{
      let userData=res.data.userData;

      this.setState({data: res.data.userData})
      console.log('getalluser',res);
    })
    .catch((err)=>{
      console.log('err',err)
    })
  
    
  }
  addUser(newData){
    //event.preventDefault();
    Axios.post('http://localhost:700/create',null,
    {params : {newData}})
    .then((res)=>{
      let userData=res.data.userData[0];
       if(res.data.statusCode==201)
      {
       console.log("userdata",userData)
        alert(userData.description);
      } else{
        //<h1>invalid id</h1>
          alert(userData.description);
      }
      console.log('Res',res);
    })
    .catch((err)=>{
      console.log('err',err)
    })
  

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
                //this.addUser(newData);
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
