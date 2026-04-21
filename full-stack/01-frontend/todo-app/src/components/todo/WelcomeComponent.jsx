import {useParams, Link} from 'react-router-dom'


export default function WelcomeComponent() {
    
    const {username} = useParams()

    return (
        <div className="WelcomeComponent">
            <h1>Welcome to the website {username}!</h1>
            <div>Your todos are <Link to="/todos">Here</Link></div>
        </div>
    )
}