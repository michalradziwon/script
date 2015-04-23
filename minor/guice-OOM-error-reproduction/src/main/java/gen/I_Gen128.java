
  package gen;
  public class I_Gen128 {
  		@com.google.inject.Inject
  		public I_Gen128(I_Gen129 i_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  