
  package gen;
  public class E_Gen196 {
  		@com.google.inject.Inject
  		public E_Gen196(E_Gen197 e_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  