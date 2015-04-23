
  package gen;
  public class E_Gen135 {
  		@com.google.inject.Inject
  		public E_Gen135(E_Gen136 e_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  