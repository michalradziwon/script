
  package gen;
  public class I_Gen94 {
  		@com.google.inject.Inject
  		public I_Gen94(I_Gen95 i_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  