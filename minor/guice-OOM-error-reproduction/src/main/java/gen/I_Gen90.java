
  package gen;
  public class I_Gen90 {
  		@com.google.inject.Inject
  		public I_Gen90(I_Gen91 i_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  