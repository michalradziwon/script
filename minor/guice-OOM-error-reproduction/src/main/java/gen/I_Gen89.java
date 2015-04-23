
  package gen;
  public class I_Gen89 {
  		@com.google.inject.Inject
  		public I_Gen89(I_Gen90 i_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  