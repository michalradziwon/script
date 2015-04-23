
  package gen;
  public class E_Gen73 {
  		@com.google.inject.Inject
  		public E_Gen73(E_Gen74 e_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  