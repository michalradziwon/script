
  package gen;
  public class I_Gen103 {
  		@com.google.inject.Inject
  		public I_Gen103(I_Gen104 i_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  