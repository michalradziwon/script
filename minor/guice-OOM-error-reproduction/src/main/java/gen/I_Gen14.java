
  package gen;
  public class I_Gen14 {
  		@com.google.inject.Inject
  		public I_Gen14(I_Gen15 i_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  