
  package gen;
  public class I_Gen40 {
  		@com.google.inject.Inject
  		public I_Gen40(I_Gen41 i_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  