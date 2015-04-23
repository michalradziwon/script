
  package gen;
  public class E_Gen10 {
  		@com.google.inject.Inject
  		public E_Gen10(E_Gen11 e_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  