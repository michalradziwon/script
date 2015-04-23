
  package gen;
  public class T_Gen127 {
  		@com.google.inject.Inject
  		public T_Gen127(T_Gen128 t_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  