
  package gen;
  public class I_Gen63 {
  		@com.google.inject.Inject
  		public I_Gen63(I_Gen64 i_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  