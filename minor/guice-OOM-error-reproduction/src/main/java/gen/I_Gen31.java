
  package gen;
  public class I_Gen31 {
  		@com.google.inject.Inject
  		public I_Gen31(I_Gen32 i_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  