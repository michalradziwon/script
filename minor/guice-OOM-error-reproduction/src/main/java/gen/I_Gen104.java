
  package gen;
  public class I_Gen104 {
  		@com.google.inject.Inject
  		public I_Gen104(I_Gen105 i_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  