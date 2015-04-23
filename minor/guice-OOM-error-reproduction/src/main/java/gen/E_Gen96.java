
  package gen;
  public class E_Gen96 {
  		@com.google.inject.Inject
  		public E_Gen96(E_Gen97 e_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  