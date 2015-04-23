
  package gen;
  public class I_Gen3 {
  		@com.google.inject.Inject
  		public I_Gen3(I_Gen4 i_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  