
  package gen;
  public class I_Gen41 {
  		@com.google.inject.Inject
  		public I_Gen41(I_Gen42 i_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  