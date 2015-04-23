
  package gen;
  public class I_Gen47 {
  		@com.google.inject.Inject
  		public I_Gen47(I_Gen48 i_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  