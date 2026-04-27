import {apiClient} from "./ApiClient";

export const retrieveHelloWorldPathVariable
    = (name, token) => apiClient.get(`/hello-world/path-variable/${name}`)

export const executeBasicAuthenticationService
    = (token) => apiClient.get('/basicauth')