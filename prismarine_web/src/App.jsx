import React, { useState } from 'react';
import './App.css'
import Card from './components/card/card';
import CreateModal from './components/create-modal/create-modal';
import { useUserData } from './hooks/useUserData';

function App() {
  // Estado padrão
  const {data, isLoading, error} = useUserData();
  // Modo criação
  const [isModalOpen, setIsModalOpen] = useState(false);
  
  // Função para estados da modal
  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }

  if(isLoading) return <div>Carregando...</div>;
  if(error) return <div>Erro</div>

  return (
      <div className="container">
          <h1>Cardápio</h1>
          <div className="card-grid">
            {data?.map(userData => (
              <Card 
                userAge={userData.userAge}
                userName={userData.userName}
                userProfilePicture={userData.userProfilePicture}
              />
            ))}
          </div>
          {isModalOpen && <CreateModal/>}
          <button onClick={handleOpenModal}>Novo</button>
      </div>
  )
}

export default App;
