
  package gen;
  public class I_Gen38 {
  		@com.google.inject.Inject
  		public I_Gen38(I_Gen39 i_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  