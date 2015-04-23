
  package gen;
  public class T_Gen132 {
  		@com.google.inject.Inject
  		public T_Gen132(T_Gen133 t_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  