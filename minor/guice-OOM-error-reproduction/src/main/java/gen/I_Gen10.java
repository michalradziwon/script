
  package gen;
  public class I_Gen10 {
  		@com.google.inject.Inject
  		public I_Gen10(I_Gen11 i_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  