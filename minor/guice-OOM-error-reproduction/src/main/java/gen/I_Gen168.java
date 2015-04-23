
  package gen;
  public class I_Gen168 {
  		@com.google.inject.Inject
  		public I_Gen168(I_Gen169 i_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  