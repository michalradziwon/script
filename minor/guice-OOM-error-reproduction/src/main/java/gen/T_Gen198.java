
  package gen;
  public class T_Gen198 {
  		@com.google.inject.Inject
  		public T_Gen198(T_Gen199 t_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  