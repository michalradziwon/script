
  package gen;
  public class I_Gen173 {
  		@com.google.inject.Inject
  		public I_Gen173(I_Gen174 i_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  