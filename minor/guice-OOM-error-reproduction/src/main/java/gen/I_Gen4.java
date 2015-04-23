
  package gen;
  public class I_Gen4 {
  		@com.google.inject.Inject
  		public I_Gen4(I_Gen5 i_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  