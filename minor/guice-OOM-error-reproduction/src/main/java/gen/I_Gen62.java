
  package gen;
  public class I_Gen62 {
  		@com.google.inject.Inject
  		public I_Gen62(I_Gen63 i_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  