
  package gen;
  public class T_Gen187 {
  		@com.google.inject.Inject
  		public T_Gen187(T_Gen188 t_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  