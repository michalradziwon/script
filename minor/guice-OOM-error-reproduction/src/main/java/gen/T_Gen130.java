
  package gen;
  public class T_Gen130 {
  		@com.google.inject.Inject
  		public T_Gen130(T_Gen131 t_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  