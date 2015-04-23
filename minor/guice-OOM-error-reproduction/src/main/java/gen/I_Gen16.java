
  package gen;
  public class I_Gen16 {
  		@com.google.inject.Inject
  		public I_Gen16(I_Gen17 i_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  