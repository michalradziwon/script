
  package gen;
  public class E_Gen101 {
  		@com.google.inject.Inject
  		public E_Gen101(E_Gen102 e_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  