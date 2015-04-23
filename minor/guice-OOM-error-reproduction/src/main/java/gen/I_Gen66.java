
  package gen;
  public class I_Gen66 {
  		@com.google.inject.Inject
  		public I_Gen66(I_Gen67 i_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  