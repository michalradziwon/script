
  package gen;
  public class I_Gen61 {
  		@com.google.inject.Inject
  		public I_Gen61(I_Gen62 i_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  