
  package gen;
  public class I_Gen49 {
  		@com.google.inject.Inject
  		public I_Gen49(I_Gen50 i_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  