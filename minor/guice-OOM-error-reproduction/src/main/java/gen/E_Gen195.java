
  package gen;
  public class E_Gen195 {
  		@com.google.inject.Inject
  		public E_Gen195(E_Gen196 e_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  