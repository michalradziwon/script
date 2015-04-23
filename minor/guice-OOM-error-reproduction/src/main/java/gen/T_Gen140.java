
  package gen;
  public class T_Gen140 {
  		@com.google.inject.Inject
  		public T_Gen140(T_Gen141 t_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  