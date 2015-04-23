
  package gen;
  public class T_Gen126 {
  		@com.google.inject.Inject
  		public T_Gen126(T_Gen127 t_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  