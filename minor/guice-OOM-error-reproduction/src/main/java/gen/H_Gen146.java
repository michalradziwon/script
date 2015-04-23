
  package gen;
  public class H_Gen146 {
  		@com.google.inject.Inject
  		public H_Gen146(H_Gen147 h_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  