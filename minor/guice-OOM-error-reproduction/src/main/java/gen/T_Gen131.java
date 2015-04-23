
  package gen;
  public class T_Gen131 {
  		@com.google.inject.Inject
  		public T_Gen131(T_Gen132 t_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  