
  package gen;
  public class I_Gen86 {
  		@com.google.inject.Inject
  		public I_Gen86(I_Gen87 i_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  