
  package gen;
  public class E_Gen56 {
  		@com.google.inject.Inject
  		public E_Gen56(E_Gen57 e_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  