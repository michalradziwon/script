
  package gen;
  public class I_Gen97 {
  		@com.google.inject.Inject
  		public I_Gen97(I_Gen98 i_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  