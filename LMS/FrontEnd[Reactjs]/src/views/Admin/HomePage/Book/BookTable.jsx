import React from 'react';
import MaterialTable from 'material-table';
import Axios from "axios";

export default class   User extends React.Component {
  constructor(props) {
    super(props);
   this.state={
      columns: [
        { title: 'BookId', field: 'bookId',type: 'numeric' },
        { title: 'Book Name', field: 'bookName' },
        { title: 'Catagery', field: 'catagery'},
        { title: 'ISBNNumber', field: 'isbnNumber', type: 'numeric' },
        {  title: 'AuthorName',field:'authorName' },
        {  title: 'Language',field:'language' },
        {  title: 'Noofcopies',field:'numberOfCopies', type: 'numeric' },
        {  title: 'availableCopies',field:'availableCopies', type: 'numeric' },

        
      ],
      data: []
    }
    
    Axios.get('http://localhost:700/getAllBook')
    .then((res)=>{
      console.log('getallBook',res);
     // let booksData=res.data.bookData;
      this.setState({data: res.data.bookData})
    })
    .catch((err)=>{
      console.log('err',err)
    })
  
    
  }
  addBook(newData){
    //event.preventDefault();
    console.log("newData",newData)
   const datas={bookId:newData.bookId,bookName:newData.bookName,catagery:newData.catagery,isbnNumber:newData.isbnNumber,
    authorName:newData.authorName,language:newData.language,numberOfCopies:newData.numberOfCopies,
    availableCopies:newData.availableCopies};

       console.log("datas",datas)
  
       
    Axios.post('http://localhost:700/addBook',datas)
   /*  {params : {id:newData.id,name:newData.name,emailId:newData.emailId,mobileNumber:newData.mobileNumber,
               password:newData.password,UserType:newData.UserType}}) */
    .then((res)=>{

      console.log('Res',res);
      let bookData=res.data;
       if(res.data.statusCode==201)
      {
       console.log("bookData",bookData)
        alert(bookData.description);
      } else{
        //<h1>invalid id</h1>
          alert(bookData.description);
      }
     
    })
    .catch((err)=>{
      console.log('err',err)
    })
  

  }//endof adduser
  updateBook(newData){
    //event.preventDefault();
    console.log("newData",newData)
   const datas={bookId:newData.bookId,bookName:newData.bookName,catagery:newData.catagery,isbnNumber:newData.isbnNumber,
    authorName:newData.authorName,language:newData.language,numberOfCopies:newData.numberOfCopies,
    availableCopies:newData.availableCopies};

       console.log("datas",datas)
  
       
    Axios.post('http://localhost:700/updateBook',datas)
   /*  {params : {id:newData.id,name:newData.name,emailId:newData.emailId,mobileNumber:newData.mobileNumber,
               password:newData.password,UserType:newData.UserType}}) */
    .then((res)=>{

      console.log('Res',res);
      let bookData=res.data;
       if(res.data.statusCode==201)
      {
       console.log("bookData",bookData)
        alert(bookData.description);
      } else{
        //<h1>invalid id</h1>
          alert(bookData.description);
      }
     
    })
  }//end of updateuser
  deleteBook(oldData){
    //event.preventDefault();
    console.log("oldData",oldData)
  
       
    Axios.get('http://localhost:700/deleteBook', {params : {bookId:oldData.bookId}})
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
    
    <MaterialTable style={{margin:'40px',marginLeft:'160px',width:'88%',padding:"2px"}}
      title="Book Details"
      columns={this.state.columns}
      data={this.state.data}
      editable={{
        onRowAdd: newData =>
          new Promise(resolve => {
            this.addBook(newData);
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
              this.updateBook(newData)
              const data = [...this.state.data];
              data[data.indexOf(oldData)] = newData;
             this.setState({ ...this.state, data });
            }, 600);
          }),
        onRowDelete: oldData =>
          new Promise(resolve => {
            setTimeout(() => {
              resolve();
              this.deleteBook(oldData);
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
