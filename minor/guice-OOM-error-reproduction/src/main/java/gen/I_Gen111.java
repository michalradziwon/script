
  package gen;
  public class I_Gen111 {
  		@com.google.inject.Inject
  		public I_Gen111(I_Gen112 i_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  