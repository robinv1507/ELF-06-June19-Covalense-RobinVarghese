import React, { Component } from 'react'
import Axios from 'axios';
import {Modal,Button} from 'react-bootstrap';

export default class ViewAccount extends Component {

    constructor(props){
        super(props)
        this.state={
            accounts:[],
            show:false,
            name:'',
            email:'',
            phoneno:''
        }
    }
    componentDidMount(){

        Axios.get('https://emp-app-b9c12.firebaseio.com/accounts.json')
        .then((response)=>{
            console.log("response data",response);
            let fetchedAccounts=[];
            for(let key in response.data){
                fetchedAccounts.push({
                    ...response.data[key],
                    id:key
                })
                
            }
            this.setState({
                accounts:fetchedAccounts
            })
            console.log("fetchedAccounts data",fetchedAccounts);
            console.log("accounts data",this.state.accounts);
        }).catch((error)=>{
            console.log('error',error);
        })
    }//end of didmount
    deleteAccount(account){
        console.log('Account id',account.id);
        debugger
        Axios.delete('https://emp-app-b9c12.firebaseio.com/accounts/'+account.id+'/.json')
        .then((response)=>{
            alert("deleted successfully")
            let allAccounts=this.state.accounts;
            let index=           allAccounts.indexOf(account);
            let newAccounts=allAccounts.splice(index,1);
            console.log('newAccounts',newAccounts);
            this.setState({
                accounts:allAccounts
            })
        })
        .catch((error)=>{
           alert("deletion failed")
        })

       

    }//end of deleteAccount()
    editAccount(account){
        this.setState({
            name:account.name,
            email:account.email,
            phoneno:account.phoneno,
            id:account.id,
            show:!this.state.show
        })

    }
    handleClose(){
        this.setState({    
            show:!this.state.show
        })
    }
    putData(){

    }
    updateAccountData(){
        const{id,name,email,phoneno}=this.state;
        const account={name,email,phoneno}

        Axios.put('https://emp-app-b9c12.firebaseio.com/accounts/'+id+'/.json',account)
        .then((response)=>{
            console.log("updated successfully")
            this.handleClose()
        })
        .catch((error)=>{
            console.log("error",error)
        })

    }

    render() {
        return (
            <div>
                <table className="table">
  <thead>
    <tr>
    <th scope="col">#</th>
    <th scope="col">Name</th>
    <th scope="col">Email</th>
    <th scope="col">PhoneNO</th> 
    </tr>
  </thead>
  <tbody>
      {
          this.state.accounts.map((account)=>{
           return(  <tr key={account.id}>
            <th>{account.name}</th>
            <td>{account.email}</td>
            <td>{account.phoneno}</td>
            <td>
                <button onClick={this.deleteAccount.bind(this,account)}
                className="btn btn-danger">delete</button>
            </td>
            <td>
                <button onClick={this.editAccount.bind(this,account)}
                className="btn btn-success">edit</button>
            </td>
          </tr>)

          })
      }
    
  </tbody>
</table>
<div>
      <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
        <Modal.Header closeButton>
          <Modal.Title>Modal heading</Modal.Title>
        </Modal.Header>
        <Modal.Body>
        <div className="row">
    <div className="col">
      <input type="text" onChange={(event)=>{
          this.setState({name:event.target.value})}} 
          value={this.state.name} className="form-control" placeholder="Name"/>
    </div><br></br>
    <div className="col">
      <input type="text"  onChange={(event)=>{
          this.setState({email:event.target.value})}}  value={this.state.email} className="form-control" placeholder="Email"/>
    </div><br></br>
    <div className="col">
      <input type="number"  onChange={(event)=>{
          this.setState({phoneno:event.target.value})}} value={this.state.phoneno} className="form-control" placeholder="Phone number"/>
    </div><br></br>
  </div>

        
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={this.handleClose.bind(this)}>
            Close
          </Button>
          <Button variant="primary" onClick={this.updateAccountData.bind(this)}>
            Save Changes
          </Button>
        </Modal.Footer>
      </Modal>
</div>
            </div>
        )
    }
}
