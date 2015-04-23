
  package gen;
  public class I_Gen73 {
  		@com.google.inject.Inject
  		public I_Gen73(I_Gen74 i_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  