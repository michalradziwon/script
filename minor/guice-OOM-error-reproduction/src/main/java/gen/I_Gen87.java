
  package gen;
  public class I_Gen87 {
  		@com.google.inject.Inject
  		public I_Gen87(I_Gen88 i_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  