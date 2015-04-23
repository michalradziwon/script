
  package gen;
  public class I_Gen137 {
  		@com.google.inject.Inject
  		public I_Gen137(I_Gen138 i_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  