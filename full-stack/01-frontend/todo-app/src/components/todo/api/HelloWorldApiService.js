import {apiClient} from "./ApiClient";

export const retrieveHelloWorldPathVariable
    = (name, token) => apiClient.get(`/hello-world/path-variable/${name}`)