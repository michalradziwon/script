
  package gen;
  public class T_Gen145 {
  		@com.google.inject.Inject
  		public T_Gen145(T_Gen146 t_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  