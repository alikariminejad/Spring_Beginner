import axios from "axios"

// export function retrieveHelloWorldBean() {
//     return axios.get('http://localhost:8080/hello-world-bean')
// }
// this is the same as the function above
// export const retrieveHelloWorldBean = () => axios.get('http://localhost:8080/hello-world-bean')


const apiClient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)
export const retrieveHelloWorldPathVariable = (name) => apiClient.get(`/hello-world/path-variable/${name}`,
    {
        headers: {
            Authorization: 'Basic YWRtaW46YWRtaW4='
        }
    })

export const executeBasicAuthenticationService
    = (token) => apiClient.get('/basicauth',{
    headers: {
        Authorization: token
    }
})