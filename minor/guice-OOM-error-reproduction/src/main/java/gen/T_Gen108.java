
  package gen;
  public class T_Gen108 {
  		@com.google.inject.Inject
  		public T_Gen108(T_Gen109 t_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  