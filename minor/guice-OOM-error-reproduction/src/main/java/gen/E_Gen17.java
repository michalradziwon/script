
  package gen;
  public class E_Gen17 {
  		@com.google.inject.Inject
  		public E_Gen17(E_Gen18 e_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  