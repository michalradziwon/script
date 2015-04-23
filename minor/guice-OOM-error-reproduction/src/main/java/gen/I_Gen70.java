
  package gen;
  public class I_Gen70 {
  		@com.google.inject.Inject
  		public I_Gen70(I_Gen71 i_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  