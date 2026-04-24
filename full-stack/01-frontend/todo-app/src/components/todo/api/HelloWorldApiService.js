import axios from "axios"

// export function retrieveHelloWorldBean() {
//     return axios.get('http://localhost:8080/hello-world-bean')
// }
// this is the same as the function above
export const retrieveHelloWorldBean = () =>  axios.get('http://localhost:8080/hello-world-bean')