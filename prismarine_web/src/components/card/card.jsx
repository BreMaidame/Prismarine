import "./card.css";

const Card = ({ userAge, userProfilePicture, userName }) => {
    // Componente dos cards na interface da aplicação
    return (
        <div className="card">
            <img src={userProfilePicture}/>
            <h2>{userName}</h2>
            <p><b>{userAge}</b></p>
        </div>
    );
};

export default Card;
