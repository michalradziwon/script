
  package gen;
  public class I_Gen100 {
  		@com.google.inject.Inject
  		public I_Gen100(I_Gen101 i_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  