export default function ListTodosComponent() {

    const today = new Date();
    const targetDate = new Date(today.getFullYear()+10, today.getMonth(),today.getDay())

    const todos = [
        { id: 1, description: "Learn Java", done: false, targetDate:targetDate},
        { id: 2, description: "Learn SpringBoot",done: false, targetDate:targetDate },
        { id: 3, description: "Learn Docker",done: false, targetDate:targetDate }
    ]

    return (
        <div className="container">
            <h1>Here are the things you want to do!</h1>
            <table className="table">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>Description</td>
                        <td>Is Done?</td>
                        <td>Target Date</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        todos.map(
                            todo => 
                                <tr key={todo.id}>
                                    <td>{todo.id}</td>
                                    <td>{todo.description}</td>
                                    <td>{todo.done.toString()}</td>
                                    <td>{todo.targetDate.toDateString()}</td>
                                </tr>
                            )
                        }
                    
                </tbody>
            </table>
        </div>
    )
}