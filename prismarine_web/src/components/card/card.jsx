// import "./card.css";

const Card = ({ price, image, title }) => {
    // Componente dos cards na interface da aplicação
    return (
        <div className="card">
            <img src={image}/>
            <h2>{title}</h2>
            <p><b>{price}</b></p>
        </div>
    );
};

export default Card;
