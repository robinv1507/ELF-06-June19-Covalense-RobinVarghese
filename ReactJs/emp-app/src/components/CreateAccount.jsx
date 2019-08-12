import React, { Component } from 'react'
import Axios from 'axios';

export default class CreateAccount extends Component {
    constructor(props){
        super(props)
        this.state={
            name:'',
            email:'',
            phoneno:''
        }
        this.postData=this.postData.bind(this);

    }

    postData(event){
        event.preventDefault();
        console.log('post data',this.state);

        let accountData=this.state;
        Axios.post('https://emp-app-b9c12.firebaseio.com/accounts.json'
        ,accountData).then((response)=>{

              console.log("response Object",response);
              this.setState({
                name:'',
                email:'',
                phoneno:''
            })
        }).catch((error)=>{
            console.log("error ",error);

        })

    }


    render() {
        return (
            <div>
               <form onSubmit={this.postData}>
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

    <button type="submit" className="btn btn-primary">CreateAccount</button>
 
</form>
            </div>
        )
    }
}
