
  package gen;
  public class I_Gen101 {
  		@com.google.inject.Inject
  		public I_Gen101(I_Gen102 i_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  