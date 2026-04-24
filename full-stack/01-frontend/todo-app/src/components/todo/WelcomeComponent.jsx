import { useParams, Link } from 'react-router-dom'
import { useState } from 'react'
import { retrieveHelloWorldBean } from './api/HelloWorldApiService'


export default function WelcomeComponent() {
    
    const { username } = useParams()
    const [message, setMessage] = useState(null)
    
    function callHelloWorldRestApi() {

        retrieveHelloWorldBean()
            .then((response) => successfulResponse(response))
            .catch((error) => errorResponse(error))
            .finally(() => console.log('cleanup'))
    }

    function successfulResponse(response) {
        console.log(response)
        setMessage(response.data.message)
    }

    function errorResponse(error) {
        console.log(error)
    }
    return (
        <div className="WelcomeComponent">
            <h1>Welcome to the website {username}!</h1>
            <div>Your todos are <Link to="/todos">Here</Link></div>
            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorldRestApi}>
                    Call Hello World
                </button>
            </div>
            <div className='text-info'>{message}</div>
        </div>
    )
}