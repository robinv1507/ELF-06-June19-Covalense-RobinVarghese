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

    ValidateForm(event){
        event.preventDefault();
        console.log('ValidateForm');
        if(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
                      .test(this.state.email) &&
                    this.state.email.trim()!=''
                       &&this.state.phoneno.length==10){

                    this.state.name.trim();
                        return true;          
        }
        else{
            return false; 
        }
    }
        
    postData(event){
        event.preventDefault();
        console.log('post data',this.state);

        if(this.ValidateForm(event)){

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

    }


    render() {
        return (
            <div>
               <form onSubmit={this.postData}>
  <div className="row">
    <div className="col">
      <input type="text" onChange={(event)=>{
          this.setState({name:event.target.value})}} 
          value={this.state.name} className="form-control" required placeholder="Name"/>
    </div><br></br>
    <div className="col">
      <input type="text"  onChange={(event)=>{
          this.setState({email:event.target.value})}}  value={this.state.email} className="form-control" required placeholder="Email"/>
    </div><br></br>
    <div className="col">
      <input type="number"  onChange={(event)=>{
          this.setState({phoneno:event.target.value})}} value={this.state.phoneno} className="form-control" required placeholder="Phone number"/>
    </div><br></br>
  </div>

    <button type="submit" className="btn btn-primary">CreateAccount</button>
 
</form>
            </div>
        )
    }
}
