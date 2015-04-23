
  package gen;
  public class E_Gen126 {
  		@com.google.inject.Inject
  		public E_Gen126(E_Gen127 e_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  