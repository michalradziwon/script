
  package gen;
  public class I_Gen72 {
  		@com.google.inject.Inject
  		public I_Gen72(I_Gen73 i_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  