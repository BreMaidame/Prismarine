import './App.css'
import Card from './components/card/card';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const {data, isLoading, error} = useFoodData();

  if(isLoading) return <div>Carregando...</div>;
  if(error) return <div>Erro</div>

  return (
      <div className="container">
          <h1>Cardápio</h1>
          <div className="card-grid">
            {data?.map(foodData => (
              <Card 
                price={foodData.price}
                title={foodData.title}
                image={foodData.image}
              />
            ))}
          </div>
      </div>
  )
}

export default App;
