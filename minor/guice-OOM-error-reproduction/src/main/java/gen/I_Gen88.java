
  package gen;
  public class I_Gen88 {
  		@com.google.inject.Inject
  		public I_Gen88(I_Gen89 i_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  