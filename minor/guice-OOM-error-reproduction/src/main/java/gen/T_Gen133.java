
  package gen;
  public class T_Gen133 {
  		@com.google.inject.Inject
  		public T_Gen133(T_Gen134 t_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  