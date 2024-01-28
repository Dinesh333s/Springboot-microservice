import axios from 'axios'

const emplyoee_service_base_url = "http://localhost:9191/api/employees/";

const emp_id = 1;
class EmployeeService{
getEmployee()
{
    return axios.get(emplyoee_service_base_url+''+emp_id);
}
}
export default new EmployeeService