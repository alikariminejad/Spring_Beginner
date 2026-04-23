import { useState } from 'react'
import {useNavigate} from 'react-router-dom'
import { useAuth } from './security/AuthContext'


export function LoginComponent() {

    const [username, setUsername] = useState('Default User')
    const [password, setPassword] = useState('############')
    const [showSuccessMessage, setShowSuccessMessage] = useState(false)
    const [showErrorMessage, setShowErrrorMessage] = useState(false)
    const navigate = useNavigate()
    const authContext = useAuth()

    function handleUsernameChange(event) {
        setUsername(event.target.value)
    }

    function handlePasswordChange(event) {
        setPassword(event.target.value)
    }

    function handleSubmit() {
        if (username === 'admin' && password === 'admin') {
            authContext.setAuthenticated(true)
            setShowSuccessMessage(true)
            setShowErrrorMessage(false)
            navigate(`/welcome/${username}`)
        } else {
            authContext.setAuthenticated(false)
            setShowSuccessMessage(false)
            setShowErrrorMessage(true)
        }
    }
    
    return (
        <div className="Login">
            <h1>Time to Login!</h1>
            {showSuccessMessage && <div className='successMessage'>Authenticated Successfully</div>}
            {showErrorMessage && <div className='errorMessage'>Authentication Failed. Please check your credentials.</div>}
            <div className='LoginForm'>
            <div>
                <label>User Name</label>
                <input type="text" name="username" value={username} onChange={handleUsernameChange} />
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password" value={password} onChange={handlePasswordChange} />
            </div>
            <div>
                <button type="button" name="login" onClick={handleSubmit}>login</button>
            </div>
            </div>
            </div>
    )
}