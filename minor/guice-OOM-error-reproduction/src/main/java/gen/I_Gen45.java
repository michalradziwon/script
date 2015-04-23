
  package gen;
  public class I_Gen45 {
  		@com.google.inject.Inject
  		public I_Gen45(I_Gen46 i_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  