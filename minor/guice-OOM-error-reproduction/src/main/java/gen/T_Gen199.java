
  package gen;
  public class T_Gen199 {
  		@com.google.inject.Inject
  		public T_Gen199(T_Gen200 t_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  