const person = {
    name: 'Ali',
    address: {
        line1: 'Baker Street',
        city: 'London',
        country: 'UK',
    },
    profiles: ['twitter', 'linkedin', 'instagram'],
    printprofiles: () => {
        person.profiles.map(
            (profile) => console.log(profile)
        )
    }
}


export default function LearningJavaScript() {
    return (
    <div>
        <div>Name: {person.name}</div>
            <div>Address: {person.address.line1}</div>
            <div>City: {person.address.city}, Country: {person.address.country}</div>
            <div>Profiles:1-{person.profiles[0]},2-{person.profiles[1]},3-{person.profiles[2]}</div>
            <div>{person.printprofiles()}</div>
            
    </div>

    );
}