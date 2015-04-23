
  package gen;
  public class T_Gen9 {
  		@com.google.inject.Inject
  		public T_Gen9(T_Gen10 t_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  