
  package gen;
  public class E_Gen86 {
  		@com.google.inject.Inject
  		public E_Gen86(E_Gen87 e_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  