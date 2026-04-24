import { useEffect, useState } from "react";
import { deleteTodoApi, retrieveAllTodosForUsernameApi } from "./api/TodoApiService";

export default function ListTodosComponent() {

    const today = new Date();
    const [todos, setTodos] = useState([])
    const [message, setMessage] = useState(null)

    useEffect(() => refreshTodos(), [])

    function refreshTodos() {
        retrieveAllTodosForUsernameApi('admin')
            .then(response => {
                console.log(response)
                setTodos(response.data)
            })
            .catch(error => console.log(error))    
    }

    function deleteTodo(id) {
        deleteTodoApi('admin', id)
            .then(
                () => {
                    setMessage(`Delete of todo with id=${id} was successful`)
                    refreshTodos()
                }
            )
            .catch()
    }
    
    return (
        <div className="container">
            <h1>Here are the things you want to do!</h1>
            {message && <div className="alert alert-warning">{message}</div>}
            <table className="table">
                <thead>
                    <tr>
                        <th>Description</th>
                        <th>Is Done?</th>
                        <th>Target Date</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        todos.map(
                            todo => 
                                <tr key={todo.id}>
                                    <td>{todo.description}</td>
                                    <td>{todo.done.toString()}</td>
                                    {/* <td>{todo.targetDate.toDateString()}</td> */}
                                    <td>{todo.targetDate.toString()}</td>
                                    <td><button className="btn btn-warning" onClick={()=>deleteTodo(todo.id)}>Delete</button></td>
                                </tr>
                            )
                        }
                    
                </tbody>
            </table>
        </div>
    )
}