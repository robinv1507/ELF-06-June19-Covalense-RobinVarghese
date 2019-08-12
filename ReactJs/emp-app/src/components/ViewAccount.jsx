import React, { Component } from 'react'
import Axios from 'axios';

export default class ViewAccount extends Component {

    constructor(props){
        super(props)
        this.state={
            accounts:[]
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
            console.log("fetchedAccounts data",fetchedAccounts);

        }).catch((error)=>{
            console.log('error',error);
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
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
   
  </tbody>
</table>
            </div>
        )
    }
}
