
  package gen;
  public class I_Gen143 {
  		@com.google.inject.Inject
  		public I_Gen143(I_Gen144 i_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  