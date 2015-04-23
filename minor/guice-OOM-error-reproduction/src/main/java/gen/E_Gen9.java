
  package gen;
  public class E_Gen9 {
  		@com.google.inject.Inject
  		public E_Gen9(E_Gen10 e_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  