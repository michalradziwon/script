
  package gen;
  public class E_Gen134 {
  		@com.google.inject.Inject
  		public E_Gen134(E_Gen135 e_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  