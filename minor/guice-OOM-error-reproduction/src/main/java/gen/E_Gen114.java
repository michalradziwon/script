
  package gen;
  public class E_Gen114 {
  		@com.google.inject.Inject
  		public E_Gen114(E_Gen115 e_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  