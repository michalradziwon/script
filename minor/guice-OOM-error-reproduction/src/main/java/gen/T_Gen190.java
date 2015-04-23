
  package gen;
  public class T_Gen190 {
  		@com.google.inject.Inject
  		public T_Gen190(T_Gen191 t_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  