
  package gen;
  public class I_Gen174 {
  		@com.google.inject.Inject
  		public I_Gen174(I_Gen175 i_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  