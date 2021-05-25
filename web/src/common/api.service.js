import axios from "axios";

export function get(path = '') {
    return axios.get(path).catch(err => {
        console.log(err);
        throw new Error('HTTP Get Error : api.service');
    })
}

export function post(path = '', params) {
    return axios.post(path, params).catch(err => {
        console.log(err);
        throw new Error('HTTP Post Error : api.service');
    })
}