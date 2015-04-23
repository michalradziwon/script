
  package gen;
  public class E_Gen147 {
  		@com.google.inject.Inject
  		public E_Gen147(E_Gen148 e_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  