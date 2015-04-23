
  package gen;
  public class E_Gen136 {
  		@com.google.inject.Inject
  		public E_Gen136(E_Gen137 e_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  