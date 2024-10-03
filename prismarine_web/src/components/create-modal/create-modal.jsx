import { useUserDataMutate } from "../../hooks/useUserDataMutate";
import React from "react";
import "./modal.css";

const Input = ({ label, value, updateValue }) => {
    // Retorna componente de inputs
    return (
        <>
            <label>{label}</label>
            <input value={value} onChange={e => updateValue(e.target.value)} />
        </>
    );
};

const CreateModal = () => {
    const [userName, setUserName] = React.useState("");
    const [userAge, setUserAge] = React.useState("");
    const [userProfilePicture, setUserProfilePicture] = React.useState("");
    const {mutate} = useUserDataMutate();

    const submit = () => {
        const userData = {
            userName,
            userAge,
            userProfilePicture
        };
        mutate(userData);
        closeModal();
    }

    // Componente dos cards na interface da aplicação
    return (
        <div className="modal-overflow">
            <div className="body">
                <h2>Cadastre um novo usuário</h2>
                <form className="input-container">
                    <Input label="userName" value={userName} updateValue={setUserName} />
                    <Input label="userAge" value={userAge} updateValue={setUserAge} />
                    <Input label="userProfilePicture" value={userProfilePicture} updateValue={setUserProfilePicture} />
                </form>
                <button className="btn-secondary" onClick={submit}>
                </button>
            </div>
        </div>
    );
};

export default CreateModal;
