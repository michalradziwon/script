
  package gen;
  public class T_Gen27 {
  		@com.google.inject.Inject
  		public T_Gen27(T_Gen28 t_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  