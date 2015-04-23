
  package gen;
  public class T_Gen51 {
  		@com.google.inject.Inject
  		public T_Gen51(T_Gen52 t_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  