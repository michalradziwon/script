
  package gen;
  public class T_Gen171 {
  		@com.google.inject.Inject
  		public T_Gen171(T_Gen172 t_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  