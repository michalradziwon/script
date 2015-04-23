
  package gen;
  public class I_Gen112 {
  		@com.google.inject.Inject
  		public I_Gen112(I_Gen113 i_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  