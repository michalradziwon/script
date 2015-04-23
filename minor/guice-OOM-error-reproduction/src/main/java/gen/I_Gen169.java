
  package gen;
  public class I_Gen169 {
  		@com.google.inject.Inject
  		public I_Gen169(I_Gen170 i_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  