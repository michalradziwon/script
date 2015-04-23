
  package gen;
  public class I_Gen188 {
  		@com.google.inject.Inject
  		public I_Gen188(I_Gen189 i_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  