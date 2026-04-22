import {BrowserRouter, Routes, Route} from 'react-router-dom'
import './TodoApp.css'
import HeaderComponent from './HeaderComponent'
import { LoginComponent } from './LoginComponent'
import LogoutComponent from './LogoutComponent'
import WelcomeComponent from './WelcomeComponent'
import ListTodosComponent from './ListTodosComponent'
import ErrorComponent from './ErrorComponent'
import AuthProvider from './security/AuthContext'

export default function TodoApp() {
    return (
        <div className="TodoApp">
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent />
                    <Routes>
                        <Route path='/' element={<LoginComponent/>}/>
                        <Route path='/login' element={<LoginComponent />}/>
                        <Route path='/welcome/:username' element={<WelcomeComponent />}/>
                        <Route path='/todos' element={<ListTodosComponent />} />
                        <Route path='/logout' element={<LogoutComponent/>}/>
                        <Route path='*' element={<ErrorComponent/>}/>
                    </Routes>
                </BrowserRouter>
            </AuthProvider>
        </div>
    )
}