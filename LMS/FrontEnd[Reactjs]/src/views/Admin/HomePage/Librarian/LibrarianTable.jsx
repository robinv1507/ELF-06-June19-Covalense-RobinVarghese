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
        { title: 'Password',field:'password' },
        { title: 'UserType', field: 'userType' },
      ],
      data: [      
      ],
    }
    Axios.get('http://localhost:700/getOnlyUser',
    {params : {userType:'librarian'}})
    .then((res)=>{
      let userData=res.data.userData;
      console.log('getuser',userData)
      this.setState({data: res.data.userData})
      console.log('getalluser',res);
    })
    .catch((err)=>{
      console.log('err',err)
    })
  
    
  }
  addUser(newData){
    //event.preventDefault();
    console.log("newData",newData)
   const datas={id:newData.id,name:newData.name,emailId:newData.emailId,mobileNumber:newData.mobileNumber,
       password:newData.password,userType:newData.userType};

       console.log("datas",datas)
  
       
    Axios.post('http://localhost:700/createUser',datas)
   /*  {params : {id:newData.id,name:newData.name,emailId:newData.emailId,mobileNumber:newData.mobileNumber,
               password:newData.password,UserType:newData.UserType}}) */
    .then((res)=>{

      console.log('Res',res);
      let userData=res.data;
       if(res.data.statusCode==201)
      {
       console.log("userdata",userData)
        alert(userData.description);
      } else{
        //<h1>invalid id</h1>
          alert(userData.description);
      }
     
    })
    .catch((err)=>{
      console.log('err',err)
    })
  

  }//endof adduser
  updateUser(newData){
    //event.preventDefault();
    console.log("newData",newData)
   const datas={id:newData.id,name:newData.name,emailId:newData.emailId,mobileNumber:newData.mobileNumber,
       password:newData.password,userType:newData.userType};

       console.log("datas",datas)
  
       
    Axios.post('http://localhost:700/updateUser',datas)
   /*  {params : {id:newData.id,name:newData.name,emailId:newData.emailId,mobileNumber:newData.mobileNumber,
               password:newData.password,UserType:newData.UserType}}) */
    .then((res)=>{

      console.log('Res',res);
      let userData=res.data;
       if(res.data.statusCode==201)
      {
       console.log("userdata",userData)
        alert(userData.description);
      } else{
        //<h1>invalid id</h1>
          alert(userData.description);
      }
     
    })
    .catch((err)=>{
      console.log('err',err)
    })
  

  }//end of updateuser
  deleteUser(oldData){
    //event.preventDefault();
    console.log("oldData",oldData)
  
       
    Axios.get('http://localhost:700/deleteUser', {params : {id:oldData.id}})
    .then((res)=>{

      console.log('Res',res);
      let userData=res.data;
       if(res.data.statusCode==201)
      {
       console.log("userdata",userData)
        alert(userData.description);
      } else{
        //<h1>invalid id</h1>
          alert(userData.description);
      }
     
    })
    .catch((err)=>{
      console.log('err',err)
    })
  }
 
render(){
  return (
    
    <MaterialTable style={{margin:'70px',marginLeft:'240px'}}
      title="Librarian Details"
      columns={this.state.columns}
      data={this.state.data}
      editable={{
        onRowAdd: newData =>
          new Promise(resolve => {
            this.addUser(newData);
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
              this.updateUser(newData)
              const data = [...this.state.data];
              data[data.indexOf(oldData)] = newData;
             this.setState({ ...this.state, data });
            }, 600);
          }),
        onRowDelete: oldData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              this.deleteUser(oldData);
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
