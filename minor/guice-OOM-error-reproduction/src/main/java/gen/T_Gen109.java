
  package gen;
  public class T_Gen109 {
  		@com.google.inject.Inject
  		public T_Gen109(T_Gen110 t_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  