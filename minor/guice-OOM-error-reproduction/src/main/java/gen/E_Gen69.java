
  package gen;
  public class E_Gen69 {
  		@com.google.inject.Inject
  		public E_Gen69(E_Gen70 e_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  