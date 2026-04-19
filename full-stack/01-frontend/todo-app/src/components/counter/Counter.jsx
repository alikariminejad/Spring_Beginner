import './Counter.css'

export default function Counter() {

    const buttonStyle = {
        fontSize: "16px",
        backgroundColor: "#00a5ab",
        width: "100px",
        margin: "10px",
        color: "white",
        padding: "15px",
        borderRadius: "30px"
    }

    function incrementCounterFunction() {
        console.log('increment clicked')
    }

    return (
        <div className="Counter">
            <span className="count">0</span>
            <div>
                <button className="counterButton"
                    onClick={incrementCounterFunction}>+1</button>
            </div>
        </div>
    )
}