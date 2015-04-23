
  package gen;
  public class I_Gen52 {
  		@com.google.inject.Inject
  		public I_Gen52(I_Gen53 i_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  