
  package gen;
  public class E_Gen125 {
  		@com.google.inject.Inject
  		public E_Gen125(E_Gen126 e_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  