
  package gen;
  public class I_Gen102 {
  		@com.google.inject.Inject
  		public I_Gen102(I_Gen103 i_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  